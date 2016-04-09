package lexer;
import static lexer.Token.*;
%%

%class Lexer
%type Token
%line
%column
%state MYSTRING
%state MYCHAR

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
Binario = (0|1)
Octal = [0-7]
Operador = [+,-] /*No se si tener todos los valores de operador servira para arreglar el ER de identificador */
Hexadecimal = ([0-9]|[a-f])
WhiteSpace = {LineTerminator} | [ ]
LineTerminator = (\r\n|\r|\n)
InputCharacter = [^\r\n] /* todos los caracteres que no son el enter */
IdentificadorInvalido = ([^A-Za-z\r\n_0-9 ])

Comentario = {ComentarioDeLinea}|{ComentarioDeBloque}
ComentarioDeLinea = "#" {InputCharacter}* {LineTerminator}?
ComentarioDeBloque = \"\"\"([\s\S]*)\"\"\"

%%
/* Comentarios y espacios en blanco son ignorados */


<YYINITIAL> {
 \"                             { string.setLength(0); cambioLinea = false; yybegin(MYSTRING); }
 {WhiteSpace} {/* ignore */}
 {Comentario} {/* ignore */}
 0("b"|"B"){Binario}+ {lexeme=yytext(); return INT;}
 0("o"|"O"){Octal}+  {lexeme=yytext(); return INT;}
 0("x"|"X"){Hexadecimal}+  {lexeme=yytext(); return INT;}
 {Numero}+({Letra}+{Numero}*)+ {lexeme = yytext(); return ERROR;}
 {Numero}+ {lexeme=yytext(); return INT;}
 ({Numero}+"."{Numero}+) {lexeme=yytext(); return FLOAT;}

 \' {string.setLength(0); yybegin(MYCHAR);} 



/* Operadores */

"+" {lexeme = yytext(); return opAritmeticos;}
"-" {lexeme = yytext(); return opAritmeticos;}
"*" {lexeme = yytext(); return opAritmeticos;}
"/" {lexeme = yytext(); return opAritmeticos;}
"//" {lexeme = yytext(); return opAritmeticos;}
"%" {lexeme = yytext(); return opAritmeticos;}
"**" {lexeme = yytext(); return opAritmeticos;}
"=" {lexeme = yytext(); return opAsingaciones;}
"==" {lexeme = yytext(); return opComparadores;}
"!=" {lexeme = yytext(); return opComparadores;}
"<>" {lexeme = yytext(); return opComparadores;}
">" {lexeme = yytext(); return opComparadores;}
"<" {lexeme = yytext(); return opComparadores;}
">=" {lexeme = yytext(); return opComparadores;}
"<=" {lexeme = yytext(); return opComparadores;}
"+=" {lexeme = yytext(); return opAsingaciones;}
"-=" {lexeme = yytext(); return opAsingaciones;}
"*=" {lexeme = yytext(); return opAsingaciones;}
"/=" {lexeme = yytext(); return opAsingaciones;}
"**=" {lexeme = yytext(); return opAsingaciones;}
"//=" {lexeme = yytext(); return opAsingaciones;}
"(" {lexeme = yytext(); return opDelimitadores;}
")" {lexeme = yytext(); return opDelimitadores;}
"[" {lexeme = yytext(); return opDelimitadores;}
"]" {lexeme = yytext(); return opDelimitadores;}
"," {lexeme = yytext(); return opDelimitadores;}
"." {lexeme = yytext(); return opDelimitadores;}
":" {lexeme = yytext(); return opDelimitadores;}
">>" {lexeme = yytext(); return opBits;}
"<<" {lexeme = yytext(); return opBits;}
"and" {lexeme = yytext(); return opLogicos;}
"or" {lexeme = yytext(); return opLogicos;}
"not" {lexeme = yytext(); return opLogicos;}
"&" {lexeme = yytext(); return opBits;}
"^" {lexeme = yytext(); return opBits;}
"~" {lexeme = yytext(); return opBits;}
\u007C {lexeme=yytext(); return opBits;}
"\t" {lexeme = yytext(); return opDelimitadores;}

/* Palabras reservadas */
"assert" {lexeme = yytext(); return PalabraReservada;}
"break" {lexeme = yytext(); return PalabraReservada;}
"class" {lexeme = yytext(); return PalabraReservada;}
"continue" {lexeme = yytext(); return PalabraReservada;}
"def" {lexeme = yytext(); return PalabraReservada;}
"del" {lexeme = yytext(); return PalabraReservada;}
"elif" {lexeme = yytext(); return PalabraReservada;}
"else" {lexeme = yytext(); return PalabraReservada;}
"except" {lexeme = yytext(); return PalabraReservada;}
"exec" {lexeme = yytext(); return PalabraReservada;}
"finally" {lexeme = yytext(); return PalabraReservada;}
"for" {lexeme = yytext(); return PalabraReservada;}
"from" {lexeme = yytext(); return PalabraReservada;}
"global" {lexeme = yytext(); return PalabraReservada;}
"if" {lexeme = yytext(); return PalabraReservada;}
"import" {lexeme = yytext(); return PalabraReservada;}
"in" {lexeme = yytext(); return PalabraReservada;}
"is" {lexeme = yytext(); return PalabraReservada;}
"lambda" {lexeme = yytext(); return PalabraReservada;}
"pass" {lexeme = yytext(); return PalabraReservada;}
"print" {lexeme = yytext(); return PalabraReservada;}
"raise" {lexeme = yytext(); return PalabraReservada;}
"return" {lexeme = yytext(); return PalabraReservada;}
"try" {lexeme = yytext(); return PalabraReservada;}
"while" {lexeme = yytext(); return PalabraReservada;}
"int" {lexeme = yytext(); return PalabraReservada;}

"float" {lexeme = yytext(); return PalabraReservada;}
"string" {lexeme = yytext(); return PalabraReservada;}
"list" {lexeme = yytext(); return PalabraReservada;}
"bool" {lexeme = yytext(); return PalabraReservada;}

{Letra}(({Letra}|{Numero})*({IdentificadorInvalido})+({Letra}|{Numero})*)+ {lexeme="string"+yytext(); return ERROR;} 
{Letra}({Letra}|{Numero})* {lexeme=yytext(); return Identificador;}

}

<MYCHAR> {

\'                              {yybegin(YYINITIAL); lexeme = "'"+ string.toString()+"'"; 
                                 if(string.length()>1)
                                    return ERROR;
                                 else
                                    return CHAR;   }
<<EOF>>                          { yybegin(YYINITIAL); lexeme = "Char sin terminar: " + string.toString(); return ERROR;}
\S                               { string.append( yytext() );}


}
<MYSTRING> {
  {LineTerminator}               { cambioLinea = true;}
  \"                             { yybegin(YYINITIAL);
                                   lexeme = "\"" +string.toString()+"\"";
                                   if(cambioLinea){
                                        return ERROR;
                                   }else{
                                        return STRING;
                                   }} /*Numero linea = adonde terminO*/
 \S                   { string.append( yytext() ); }
<<EOF>>                          { yybegin(YYINITIAL); lexeme = "String sin terminar: " + string.toString(); return ERROR;}

  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }
  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }

}



/* Error */
. {lexeme = yytext();return ERROR;}