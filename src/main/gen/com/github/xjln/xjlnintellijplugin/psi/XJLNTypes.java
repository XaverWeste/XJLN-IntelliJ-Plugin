// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xjln.xjlnintellijplugin.psi.impl.*;

public interface XJLNTypes {

  IElementType ARGUMENT = new XJLNElementType("ARGUMENT");
  IElementType ARRAY_CREATION = new XJLNElementType("ARRAY_CREATION");
  IElementType CALC = new XJLNElementType("CALC");
  IElementType CALC_ARG = new XJLNElementType("CALC_ARG");
  IElementType CALL = new XJLNElementType("CALL");
  IElementType CLAS = new XJLNElementType("CLAS");
  IElementType DOCS = new XJLNElementType("DOCS");
  IElementType ENUM = new XJLNElementType("ENUM");
  IElementType FIELD = new XJLNElementType("FIELD");
  IElementType MAIN_ARG = new XJLNElementType("MAIN_ARG");
  IElementType METHOD = new XJLNElementType("METHOD");
  IElementType METHOD_CALL = new XJLNElementType("METHOD_CALL");
  IElementType OBJECT_CREATION = new XJLNElementType("OBJECT_CREATION");
  IElementType PARAMETER_LIST = new XJLNElementType("PARAMETER_LIST");
  IElementType STATEMENT = new XJLNElementType("STATEMENT");
  IElementType TYPE = new XJLNElementType("TYPE");
  IElementType USE_ARG = new XJLNElementType("USE_ARG");

  IElementType AS = new XJLNTokenType("as");
  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMA = new XJLNTokenType(",");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType CONNST = new XJLNTokenType("CONNST");
  IElementType CONST = new XJLNTokenType("const");
  IElementType DEF = new XJLNTokenType("def");
  IElementType DOC = new XJLNTokenType("DOC");
  IElementType DOUBLE = new XJLNTokenType("DOUBLE");
  IElementType END = new XJLNTokenType("end");
  IElementType FROM = new XJLNTokenType("from");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType INNER = new XJLNTokenType("inner");
  IElementType INT = new XJLNTokenType("INT");
  IElementType MAIN = new XJLNTokenType("main");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType OPPERATOR = new XJLNTokenType("OPPERATOR");
  IElementType PRIMITIVETYPE = new XJLNTokenType("PRIMITIVETYPE");
  IElementType STRING = new XJLNTokenType("STRING");
  IElementType USE = new XJLNTokenType("use");
  IElementType VAR = new XJLNTokenType("var");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new XJLNArgumentImpl(node);
      }
      else if (type == ARRAY_CREATION) {
        return new XJLNArrayCreationImpl(node);
      }
      else if (type == CALC) {
        return new XJLNCalcImpl(node);
      }
      else if (type == CALC_ARG) {
        return new XJLNCalcArgImpl(node);
      }
      else if (type == CALL) {
        return new XJLNCallImpl(node);
      }
      else if (type == CLAS) {
        return new XJLNClasImpl(node);
      }
      else if (type == DOCS) {
        return new XJLNDocsImpl(node);
      }
      else if (type == ENUM) {
        return new XJLNEnumImpl(node);
      }
      else if (type == FIELD) {
        return new XJLNFieldImpl(node);
      }
      else if (type == MAIN_ARG) {
        return new XJLNMainArgImpl(node);
      }
      else if (type == METHOD) {
        return new XJLNMethodImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new XJLNMethodCallImpl(node);
      }
      else if (type == OBJECT_CREATION) {
        return new XJLNObjectCreationImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new XJLNParameterListImpl(node);
      }
      else if (type == STATEMENT) {
        return new XJLNStatementImpl(node);
      }
      else if (type == TYPE) {
        return new XJLNTypeImpl(node);
      }
      else if (type == USE_ARG) {
        return new XJLNUseArgImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
