package com.github.xjln.xjlnintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;

%%

%{
  public __XJLNLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class __XJLNLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

NEW_LINE=\n
IDENTIFIER=[a-zA-Z][a-zA-Z0-9]*
NUMBER=[0-9]+\.[0-9]+[idslf]?
OPERATOR=[-+*/%&|<>=!\^]+
CHAR='.'
COMMENT=#[^[#\n]]*#?
STRING=\"[^\"]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "use"               { return KEYWORD_USE; }
  "from"              { return KEYWORD_FROM; }
  "as"                { return KEYWORD_AS; }
  "def"               { return KEYWORD_DEF; }
  "public"            { return KEYWORD_PUBLIC; }
  "protected"         { return KEYWORD_PROTECTED; }
  "private"           { return KEYWORD_PRIVATE; }
  "static"            { return KEYWORD_STATIC; }
  "abstract"          { return KEYWORD_ABSTRACT; }
  "final"             { return KEYWORD_FINAL; }
  "synchronised"      { return KEYWORD_SYNCHRONISED; }
  "class"             { return KEYWORD_CLASS; }
  "data"              { return KEYWORD_DATA; }
  "type"              { return KEYWORD_TYPE; }
  "interface"         { return KEYWORD_INTERFACE; }
  "const"             { return KEYWORD_CONST; }
  "init"              { return KEYWORD_INIT; }
  "return"            { return KEYWORD_RETURN; }
  "end"               { return KEYWORD_END; }
  "if"                { return KEYWORD_IF; }
  "else"              { return KEYWORD_ELSE; }
  "while"             { return KEYWORD_WHILE; }
  "int"               { return KEYWORD_INT; }
  "double"            { return KEYWORD_DOUBLE; }
  "float"             { return KEYWORD_FLOAT; }
  "long"              { return KEYWORD_LONG; }
  "short"             { return KEYWORD_SHORT; }
  "boolean"           { return KEYWORD_BOOLEAN; }
  "char"              { return KEYWORD_CHAR; }
  "byte"              { return KEYWORD_BYTE; }

  {NEW_LINE}          { return NEW_LINE; }
  {IDENTIFIER}        { return IDENTIFIER; }
  {NUMBER}            { return NUMBER; }
  {OPERATOR}          { return OPERATOR; }
  {CHAR}              { return CHAR; }
  {COMMENT}           { return COMMENT; }
  {STRING}            { return STRING; }

}

[^] { return BAD_CHARACTER; }
