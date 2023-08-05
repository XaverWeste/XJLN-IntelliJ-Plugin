package com.github.xjln.xjlnintellijplugin;

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
WHITE_SPACE=[\ \t]+

NEW_LINE=\n
IDENTIFIER=[a-zA-Z][a-zA-Z0-9]*
OPPERATOR=[-+*/%&|<>=!\^]+
DOUBLE=[0-9]+\.[0-9]+
INT=[0-9]+
CHAR='.'
COMMENT=#[^\n]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }


  {NEW_LINE}         { return NEW_LINE; }
  {IDENTIFIER}       { return IDENTIFIER; }
  {OPPERATOR}        { return OPPERATOR; }
  {DOUBLE}           { return DOUBLE; }
  {INT}              { return INT; }
  {CHAR}             { return CHAR; }
  {COMMENT}          { return COMMENT; }

}

[^] { return BAD_CHARACTER; }
