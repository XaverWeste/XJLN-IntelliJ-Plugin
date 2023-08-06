// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface XJLNTypes {


  IElementType AS = new XJLNTokenType("as");
  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMA = new XJLNTokenType(",");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType CONNST = new XJLNTokenType("CONNST");
  IElementType CONST = new XJLNTokenType("const");
  IElementType DEF = new XJLNTokenType("def");
  IElementType DOUBLE = new XJLNTokenType("DOUBLE");
  IElementType END = new XJLNTokenType("end");
  IElementType FROM = new XJLNTokenType("from");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType INNER = new XJLNTokenType("inner");
  IElementType INT = new XJLNTokenType("INT");
  IElementType MAIN = new XJLNTokenType("main");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType OPPERATOR = new XJLNTokenType("OPPERATOR");
  IElementType STRING = new XJLNTokenType("STRING");
  IElementType USE = new XJLNTokenType("use");
  IElementType VAR = new XJLNTokenType("var");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
