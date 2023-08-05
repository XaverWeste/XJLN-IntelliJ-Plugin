// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNPropertyImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface XJLNTypes {


  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType DOUBLE = new XJLNTokenType("DOUBLE");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType INT = new XJLNTokenType("INT");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType OPPERATOR = new XJLNTokenType("OPPERATOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
