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
WHITE_SPACE=[\t\ \r]+

NEW_LINE=\n
IDENTIFIER=[a-zA-Z][a-zA-Z0-9]*
OPPERATOR=[-+*/%&|<>=!\^]+
DOUBLE=[0-9]+\.[0-9]+
INT=[0-9]+
CHAR='.'
COMMENT=#[^\n]*
STRING=\"[^\"]*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "use"              { return USE; }
  "from"             { return FROM; }
  "as"               { return AS; }
  "def"              { return DEF; }
  "inner"            { return INNER; }
  "const"            { return CONST; }
  "var"              { return VAR; }
  "main"             { return MAIN; }
  "end"              { return END; }
  ","                { return COMMA; }
  "CONNST"           { return CONNST; }

  {NEW_LINE}         { return NEW_LINE; }
  {IDENTIFIER}       { return IDENTIFIER; }
  {OPPERATOR}        { return OPPERATOR; }
  {DOUBLE}           { return DOUBLE; }
  {INT}              { return INT; }
  {CHAR}             { return CHAR; }
  {COMMENT}          { return COMMENT; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
