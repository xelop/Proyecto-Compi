package lexer;
import static lexer.Token.*;
%%

%class Lexer
%type Token
%line
%column
%state STRING
%state CHAR

%{
    //esto se copia directamente

    StringBuffer string = new StringBuffer();
    Boolean cambioLinea = false;

    public String lexeme;
    public int getLine(){
        return yyline;
    }
%}

Letra = [a-zA-Z_]
Numero = [0-9]
Binario = [0|1]
Octal = [0-7]
Operador = [+,-] /*No se si tener todos los valores de operador servira para arreglar el ER de identificador */
Hexadecimal = [0-9|a-f]
WhiteSpace = {LineTerminator} | [ ]
LineTerminator = (\r\n|\r|\n)
InputCharacter = [^\r\n] /* todos los caracteres que no son el enter */

Comentario = {ComentarioDeLinea}|{ComentarioDeBloque}
ComentarioDeLinea = "#" {InputCharacter}* {LineTerminator}?
ComentarioDeBloque = \"\"\"([\s\S]*)\"\"\"

%%
/* Comentarios y espacios en blanco son ignorados */



{WhiteSpace} {/* ignore */}
{Comentario} {/* ignore */ }

<YYINITIAL> {
 \"                             { string.setLength(0); cambioLinea = false; yybegin(STRING); }
 0("b"|"B"){Binario}+ {lexeme=yytext(); return INT;}
 {Letra}({Letra}|{Numero})* {lexeme=yytext(); return Identificador;} /* hay que arregalarla */
 {Numero}+({WhiteSpace}|{Operador}) {lexeme=yytext(); return INT;}
 0("o"|"O"){Octal}+  {lexeme=yytext(); return INT;}
 0("x"|"X"){Hexadecimal}+  {lexeme=yytext(); return INT;}

 ({Numero}+"."{Numero}+) {lexeme=yytext(); return FLOAT;}

 \' {string.setLength(0); yybegin(CHAR);} /* arreglar char */

 \u007C {lexeme=yytext(); return opORBits;}

}

/* Operadores */


"+" {lexeme = yytext(); return opSuma;}
"-" {lexeme = yytext(); return opResta;}
"*" {lexeme = yytext(); return opMult;}
"/" {lexeme = yytext(); return opDiv;}
"//" {lexeme = yytext(); return opDivEntera;}
"%" {lexeme = yytext(); return opMod;}
"**" {lexeme = yytext(); return opExponente;}
"=" {lexeme = yytext(); return opIgual;}
"==" {lexeme = yytext(); return opExactamenteIgual;}
"!=" {lexeme = yytext(); return opDiferencia;}
"<>" {lexeme = yytext(); return opDiferencia2;}
">" {lexeme = yytext(); return opMayorQue;}
"<" {lexeme = yytext(); return opMenorQue;}
">=" {lexeme = yytext(); return opMayorOIgual;}
"<=" {lexeme = yytext(); return opMenorOIgual;}
"+=" {lexeme = yytext(); return opMasIgual;}
"-=" {lexeme = yytext(); return opMenosIgual;}
"*=" {lexeme = yytext(); return opMulIgual;}
"/=" {lexeme = yytext(); return opDivIgual;}
"**=" {lexeme = yytext(); return opExponenteIgual;}
"//=" {lexeme = yytext(); return opDivEnteraIgual;}
"(" {lexeme = yytext(); return opParentesis1;}
")" {lexeme = yytext(); return opParentesis2;}
"," {lexeme = yytext(); return opComa;}
"." {lexeme = yytext(); return opPunto;}
">>" {lexeme = yytext(); return opShiftDerecho;}
"<<" {lexeme = yytext(); return opShiftIzquierdo;}
"and" {lexeme = yytext(); return opANDLog;}
"or" {lexeme = yytext(); return opORLog;}
"nor" {lexeme = yytext(); return opNOTLog;}
"&" {lexeme = yytext(); return opANDBits;}
"^" {lexeme = yytext(); return opXOR;}
"~" {lexeme = yytext(); return opNOTBits;}
"\t" {lexeme = yytext(); return opTAB;}

/* Palabras reservadas */
/*"AND" {lexeme = yytext(); return rAnd;}
"OR" {lexeme = yytext(); return rOr;}
"NOT" {lexeme = yytext(); return rNot;} Estos hay que preguntar*/
"assert" {lexeme = yytext(); return rAssert;}
"break" {lexeme = yytext(); return rBreak;}
"class" {lexeme = yytext(); return rClass;}
"continue" {lexeme = yytext(); return rContinue;}
"def" {lexeme = yytext(); return rDel;}
"del" {lexeme = yytext(); return rDel;}
"elif" {lexeme = yytext(); return rElif;}
"else" {lexeme = yytext(); return rElse;}
"except" {lexeme = yytext(); return rExcept;}
"exec" {lexeme = yytext(); return rExec;}
"finally" {lexeme = yytext(); return rFinally;}
"for" {lexeme = yytext(); return rFor;}
"from" {lexeme = yytext(); return rFrom;}
"global" {lexeme = yytext(); return rGlobal;}
"if" {lexeme = yytext(); return rIf;}
"import" {lexeme = yytext(); return rImport;}
"in" {lexeme = yytext(); return rIn;}
"is" {lexeme = yytext(); return rIs;}
"lambda" {lexeme = yytext(); return rLambda;}
"pass" {lexeme = yytext(); return rPass;}
"print" {lexeme = yytext(); return rPrint;}
"raise" {lexeme = yytext(); return rRaise;}
"return" {lexeme = yytext(); return rReturn;}
"try" {lexeme = yytext(); return rTry;}
"while" {lexeme = yytext(); return rWhile;}
"int" {lexeme = yytext(); return rInt;}
"float" {lexeme = yytext(); return rFloat;}
"string" {lexeme = yytext(); return rString;}
"list" {lexeme = yytext(); return rList;}
"bool" {lexeme = yytext(); return rBool;}

<CHAR> {

\'                              {yybegin(YYINITIAL); lexeme = "'"+ string.toString()+"'"; 
                                 if(string.length()>1)
                                    return ERROR;
                                 else
                                    return MYCHAR;   }
\S                              { string.append( yytext() );}

}
<STRING> {
  \\n                          { cambioLinea = true; System.out.println("entre"); }
  \"                             { yybegin(YYINITIAL);
                                   lexeme = "\"" +string.toString()+"\"";
                                   if(cambioLinea){
                                        return ERROR;
                                   }else{
                                        return MYSTRING;
                                   }} /*Numero linea = adonde termino, no deja solo STRING */
 \S                   { string.append( yytext() ); }
<<EOF>>                          { yybegin(YYINITIAL); lexeme = "String sin terminar: " + string.toString(); return ERROR;}

  \\t                            { string.append('\t'); }
  \r                            { cambioLinea = true; }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}



/* Error */
. {lexeme = yytext();return ERROR;}