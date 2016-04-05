package lexer;
import static lexer.Token.*;
%%

%class Lexer
%type Token
%line
%column
%state STRING

%{
    //esto se copia directamente

    StringBuffer string = new StringBuffer();

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
LineTerminator = [\r|\n|\r\n]
InputCharacter = [^\r\n] /* todos los caracteres que no son el enter */

Comentario = {ComentarioDeLinea}
ComentarioDeLinea = "#" {InputCharacter}* {LineTerminator}?

%%
/* Comentarios y espacios en blanco son ignorados */
{WhiteSpace} {/* ignore */}
{Comentario} { /* ignore */ }

<YYINITIAL> {

 "|" {lexeme = yytext(); return opORBits;}
 \"                             { string.setLength(0); yybegin(STRING); }
 {Letra}({Letra}|{Numero})* {lexeme=yytext(); return Identificador;} /* hay que arregalarla */
 {Numero}+({WhiteSpace}|{Operador}) {lexeme=yytext(); return INT;}
 0"b"{Binario}+({WhiteSpace}|{Operador})  {lexeme=yytext(); return INT;}
 0"o"{Octal}+  {lexeme=yytext(); return INT;}
 0"x"{Hexadecimal}+  {lexeme=yytext(); return INT;}
 ({Numero}+"."{Numero}|0"."{Numero}) {lexeme=yytext(); return FLOAT;}

 '{InputCharacter}' {lexeme=yytext(); return CHAR;}

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


<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   lexeme = string.toString();
                                   return MYSTRING; }   /*Numero linea = adonde termino, no deja solo STRING */
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}



/* Error */
. {lexeme = yytext();return ERROR;}