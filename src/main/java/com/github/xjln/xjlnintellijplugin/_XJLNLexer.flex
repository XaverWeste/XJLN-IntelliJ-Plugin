package com.github.xjln.xjlnintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;

%%

%{
  public _XJLNLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _XJLNLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=[\t\ ]+

PRIMITIVETYPE=(int) | (double) | (float) | (long) | (short) | (boolean) | (char) | (byte)
NEW_LINE=\n
PATH=[a-zA-Z]+("/"[a-zA-Z]+)+
IDENTIFIER=[a-zA-Z][a-zA-Z0-9]*
OPPERATOR=[-+*/%&|<>=!\^]+
DIGITS_FLOATING_POINT=[0-9]+\.[0-9]+
DIGITS=[0-9]+
CHAR='.'
DOC=##[^\n]*
COMMENT=#[^[#\n]][^\n]*
STRING=\"[^\"]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}                { return WHITE_SPACE; }

  "use"                        { return KEYWORD_USE; }
  "from"                       { return KEYWORD_FROM; }
  "as"                         { return KEYWORD_AS; }
  "def"                        { return KEYWORD_DEF; }
  "abstract"                   { return KEYWORD_ABSTRACT; }
  "inner"                      { return KEYWORD_INNER; }
  "const"                      { return KEYWORD_CONST; }
  "var"                        { return KEYWORD_VAR; }
  "main"                       { return KEYWORD_MAIN; }
  "init"                       { return KEYWORD_INIT; }
  "return"                     { return KEYWORD_RETURN; }
  "end"                        { return KEYWORD_END; }
  ","                          { return COMMA; }

  {PRIMITIVETYPE}              { return PRIMITIVETYPE; }
  {NEW_LINE}                   { return NEW_LINE; }
  {PATH}                       { return PATH; }
  {IDENTIFIER}                 { return IDENTIFIER; }
  {OPPERATOR}                  { return OPPERATOR; }
  {DIGITS_FLOATING_POINT}      { return DIGITS_FLOATING_POINT; }
  {DIGITS}                     { return DIGITS; }
  {CHAR}                       { return CHAR; }
  {DOC}                        { return DOC; }
  {COMMENT}                    { return COMMENT; }
  {STRING}                     { return STRING; }

}

[^] { return BAD_CHARACTER; }
