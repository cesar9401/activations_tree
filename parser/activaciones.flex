package com.cesar31.activaciones.parser;

import static com.cesar31.activaciones.parser.ActivacionesParserSym.*;
import java_cup.runtime.Symbol;

%%

%class ActivacionesLex
%type java_cup.runtime.Symbol
%public
%unicode
%cup
%line
%column

%{
	private Symbol symbol(int type) {
		return new Symbol(type, yyline + 1, yycolumn + 1);
	}

	private Symbol symbol(int type, Object object) {
		return new Symbol(type, yyline + 1, yycolumn + 1, object);
	}
%}

%eofval{
	return symbol(EOF);
%eofval}
%eofclose

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

/* Integer */
Integer = 0|[1-9][0-9]*

/* id */
Id = \w+

%%

<YYINITIAL> {

	{Integer}
	{ return symbol(INTEGER, yytext()); }

	"programa"
	{ return symbol(PROGRAM); }

	"procedimiento"
	{ return symbol(PROCESS); }

	"var"
	{ return symbol(VAR); }

	"integer"
	{ return symbol(INT); }

	"real"
	{ return symbol(REAL); }

	"char"
	{ return symbol(CHAR); }

	"boolean"
	{ return symbol(BOOLEAN); }

	"string"
	{ return symbol(STRING); }

	"true"
	{ return symbol(BOOL); }

	"false"
	{ return symbol(BOOL); }

	"("
	{ return symbol(LPAREN); }

	")"
	{ return symbol(RPAREN); }

	"begin"
	{ return symbol(BEGIN); }

	"end"
	{ return symbol(END); }

	":"
	{ return symbol(COLON); }

	";"
	{ return symbol(SEMI); }

	":="
	{ return symbol(EQUAL); }

	"+"
	{ return symbol(PLUS); }

	"-"
	{ return symbol(MINUS); }

	"*"
	{ return symbol(TIMES); }

	"/"
	{ return symbol(DIVIDE); }

	","
	{ return symbol(COMMA); }


	{Id}
	{ return symbol(ID, yytext()); }

	{WhiteSpace}
	{ /* Ignore */ }

}

[^]
{
	System.out.println("Error: " + yytext());
	return symbol(ERROR, yytext());
}
