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
WHITE_SPACE=[\t\ ]+

NEW_LINE=\n
LETTER=[a-zA-Z]
DIGIT=[0-9]
OPERATOR=[-+*/%&|<>=!\^]
CHAR='.'
DOC=##[^\n]*
COMMENT=#[^[#\n]][^\n]*
STRING=\"[^\"]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "use"              { return KEYWORD_USE; }
  "from"             { return KEYWORD_FROM; }
  "as"               { return KEYWORD_AS; }
  "def"              { return KEYWORD_DEF; }
  "abstract"         { return KEYWORD_ABSTRACT; }
  "inner"            { return KEYWORD_INNER; }
  "const"            { return KEYWORD_CONST; }
  "var"              { return KEYWORD_VAR; }
  "main"             { return KEYWORD_MAIN; }
  "init"             { return KEYWORD_INIT; }
  "return"           { return KEYWORD_RETURN; }
  "end"              { return KEYWORD_END; }
  "if"               { return KEYWORD_IF; }
  "else"             { return KEYWORD_ELSE; }
  "while"            { return KEYWORD_WHILE; }
  "for"              { return KEYWORD_FOR; }
  "in"               { return KEYWORD_IN; }
  "int"              { return KEYWORD_INT; }
  "double"           { return KEYWORD_DOUBLE; }
  "float"            { return KEYWORD_FLOAT; }
  "long"             { return KEYWORD_LONG; }
  "short"            { return KEYWORD_SHORT; }
  "boolean"          { return KEYWORD_BOOLEAN; }
  "char"             { return KEYWORD_CHAR; }
  "byte"             { return KEYWORD_BYTE; }
  ","                { return COMMA; }

  {NEW_LINE}         { return NEW_LINE; }
  {LETTER}           { return LETTER; }
  {DIGIT}            { return DIGIT; }
  {OPERATOR}         { return OPERATOR; }
  {CHAR}             { return CHAR; }
  {DOC}              { return DOC; }
  {COMMENT}          { return COMMENT; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
