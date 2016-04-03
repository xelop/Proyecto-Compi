package lexer;
import static lexer.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
N = [0-9]
WHITE=[ \r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}

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
"|" {lexeme = yytext(); return opORBits;}
"^" {lexeme = yytext(); return opXOR;}
"~" {lexeme = yytext(); return opNOTBits;}
"\t" {lexeme = yytext(); return opTAB;}



{L}({L}|{N})* {lexeme=yytext(); return Identificador;}
 ("(-"{N}+")")|{N}+ {lexeme=yytext(); return INT;}
. {return ERROR;}