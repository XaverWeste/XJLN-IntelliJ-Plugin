// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xjln.xjlnintellijplugin.psi.impl.*;

public interface XJLNTypes {

  IElementType ABSTRACT_METHOD = new XJLNElementType("ABSTRACT_METHOD");
  IElementType ARR_CREATION = new XJLNElementType("ARR_CREATION");
  IElementType CALC = new XJLNElementType("CALC");
  IElementType CALC_ARG = new XJLNElementType("CALC_ARG");
  IElementType CALL = new XJLNElementType("CALL");
  IElementType CLAZZ = new XJLNElementType("CLAZZ");
  IElementType ENUM = new XJLNElementType("ENUM");
  IElementType FIELD = new XJLNElementType("FIELD");
  IElementType INIT = new XJLNElementType("INIT");
  IElementType MAIN = new XJLNElementType("MAIN");
  IElementType METHOD_CALL = new XJLNElementType("METHOD_CALL");
  IElementType METHOD_CODE = new XJLNElementType("METHOD_CODE");
  IElementType METHOD_DEF = new XJLNElementType("METHOD_DEF");
  IElementType METHOD_DEF_MAIN = new XJLNElementType("METHOD_DEF_MAIN");
  IElementType METHOD_EQUALS = new XJLNElementType("METHOD_EQUALS");
  IElementType METHOD_SHORT = new XJLNElementType("METHOD_SHORT");
  IElementType OBJ_CREATION = new XJLNElementType("OBJ_CREATION");
  IElementType PARAMETER_LIST = new XJLNElementType("PARAMETER_LIST");
  IElementType PARAMETER_LIST_ARGUMENTS = new XJLNElementType("PARAMETER_LIST_ARGUMENTS");
  IElementType RECORD = new XJLNElementType("RECORD");
  IElementType STATEMENT = new XJLNElementType("STATEMENT");
  IElementType TYPE = new XJLNElementType("TYPE");
  IElementType USE = new XJLNElementType("USE");
  IElementType VAR = new XJLNElementType("VAR");
  IElementType VAR_CALL = new XJLNElementType("VAR_CALL");

  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMA = new XJLNTokenType(",");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType DIGITS = new XJLNTokenType("DIGITS");
  IElementType DIGITS_FLOATING_POINT = new XJLNTokenType("DIGITS_FLOATING_POINT");
  IElementType DOC = new XJLNTokenType("DOC");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType KEYWORD_ABSTRACT = new XJLNTokenType("abstract");
  IElementType KEYWORD_AS = new XJLNTokenType("as");
  IElementType KEYWORD_CONST = new XJLNTokenType("const");
  IElementType KEYWORD_DEF = new XJLNTokenType("def");
  IElementType KEYWORD_END = new XJLNTokenType("end");
  IElementType KEYWORD_FROM = new XJLNTokenType("from");
  IElementType KEYWORD_INIT = new XJLNTokenType("init");
  IElementType KEYWORD_INNER = new XJLNTokenType("inner");
  IElementType KEYWORD_MAIN = new XJLNTokenType("main");
  IElementType KEYWORD_RETURN = new XJLNTokenType("return");
  IElementType KEYWORD_USE = new XJLNTokenType("use");
  IElementType KEYWORD_VAR = new XJLNTokenType("var");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType OPPERATOR = new XJLNTokenType("OPPERATOR");
  IElementType PATH = new XJLNTokenType("PATH");
  IElementType PRIMITIVETYPE = new XJLNTokenType("PRIMITIVETYPE");
  IElementType STRING = new XJLNTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACT_METHOD) {
        return new XJLNAbstractMethodImpl(node);
      }
      else if (type == ARR_CREATION) {
        return new XJLNArrCreationImpl(node);
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
      else if (type == CLAZZ) {
        return new XJLNClazzImpl(node);
      }
      else if (type == ENUM) {
        return new XJLNEnumImpl(node);
      }
      else if (type == FIELD) {
        return new XJLNFieldImpl(node);
      }
      else if (type == INIT) {
        return new XJLNInitImpl(node);
      }
      else if (type == MAIN) {
        return new XJLNMainImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new XJLNMethodCallImpl(node);
      }
      else if (type == METHOD_CODE) {
        return new XJLNMethodCodeImpl(node);
      }
      else if (type == METHOD_DEF) {
        return new XJLNMethodDefImpl(node);
      }
      else if (type == METHOD_DEF_MAIN) {
        return new XJLNMethodDefMainImpl(node);
      }
      else if (type == METHOD_EQUALS) {
        return new XJLNMethodEqualsImpl(node);
      }
      else if (type == METHOD_SHORT) {
        return new XJLNMethodShortImpl(node);
      }
      else if (type == OBJ_CREATION) {
        return new XJLNObjCreationImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new XJLNParameterListImpl(node);
      }
      else if (type == PARAMETER_LIST_ARGUMENTS) {
        return new XJLNParameterListArgumentsImpl(node);
      }
      else if (type == RECORD) {
        return new XJLNRecordImpl(node);
      }
      else if (type == STATEMENT) {
        return new XJLNStatementImpl(node);
      }
      else if (type == TYPE) {
        return new XJLNTypeImpl(node);
      }
      else if (type == USE) {
        return new XJLNUseImpl(node);
      }
      else if (type == VAR) {
        return new XJLNVarImpl(node);
      }
      else if (type == VAR_CALL) {
        return new XJLNVarCallImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
