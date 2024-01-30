// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xjln.xjlnintellijplugin.psi.impl.*;

public interface XJLNTypes {

  IElementType ABSTRACT_METHOD = new XJLNElementType("ABSTRACT_METHOD");
  IElementType ACCESS_MODIFIER = new XJLNElementType("ACCESS_MODIFIER");
  IElementType ALIAS = new XJLNElementType("ALIAS");
  IElementType ARGUMENT = new XJLNElementType("ARGUMENT");
  IElementType ARR = new XJLNElementType("ARR");
  IElementType ARRAY_TYPE = new XJLNElementType("ARRAY_TYPE");
  IElementType CALC = new XJLNElementType("CALC");
  IElementType CALC_ARG = new XJLNElementType("CALC_ARG");
  IElementType CALL = new XJLNElementType("CALL");
  IElementType CALL_ARG = new XJLNElementType("CALL_ARG");
  IElementType CLASS_NAME = new XJLNElementType("CLASS_NAME");
  IElementType CLAZZ = new XJLNElementType("CLAZZ");
  IElementType CLAZZ_NAME = new XJLNElementType("CLAZZ_NAME");
  IElementType CONTAINS = new XJLNElementType("CONTAINS");
  IElementType DATA = new XJLNElementType("DATA");
  IElementType DATATYPE = new XJLNElementType("DATATYPE");
  IElementType DATA_TYPE_DEF = new XJLNElementType("DATA_TYPE_DEF");
  IElementType ELSE = new XJLNElementType("ELSE");
  IElementType EXTENDS = new XJLNElementType("EXTENDS");
  IElementType FIELD = new XJLNElementType("FIELD");
  IElementType GENERIC = new XJLNElementType("GENERIC");
  IElementType GENERICS = new XJLNElementType("GENERICS");
  IElementType IF = new XJLNElementType("IF");
  IElementType IMPLEMENTS = new XJLNElementType("IMPLEMENTS");
  IElementType INIT = new XJLNElementType("INIT");
  IElementType INTERFACE = new XJLNElementType("INTERFACE");
  IElementType METHOD = new XJLNElementType("METHOD");
  IElementType METHOD_LONG = new XJLNElementType("METHOD_LONG");
  IElementType METHOD_MULT = new XJLNElementType("METHOD_MULT");
  IElementType METHOD_MULT_ARG = new XJLNElementType("METHOD_MULT_ARG");
  IElementType METHOD_SHORT = new XJLNElementType("METHOD_SHORT");
  IElementType MULTI_USE = new XJLNElementType("MULTI_USE");
  IElementType PARAMETER = new XJLNElementType("PARAMETER");
  IElementType PARAMETERLIST = new XJLNElementType("PARAMETERLIST");
  IElementType PATH = new XJLNElementType("PATH");
  IElementType SINGLE_USE = new XJLNElementType("SINGLE_USE");
  IElementType STATEMENT = new XJLNElementType("STATEMENT");
  IElementType STATEMENT_BLOCK = new XJLNElementType("STATEMENT_BLOCK");
  IElementType TYPE = new XJLNElementType("TYPE");
  IElementType TYPE_VALUE = new XJLNElementType("TYPE_VALUE");
  IElementType USE = new XJLNElementType("USE");
  IElementType VALUE = new XJLNElementType("VALUE");
  IElementType VAR = new XJLNElementType("VAR");
  IElementType WHILE = new XJLNElementType("WHILE");

  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMA = new XJLNTokenType(",");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType KEYWORD_ABSTRACT = new XJLNTokenType("abstract");
  IElementType KEYWORD_AS = new XJLNTokenType("as");
  IElementType KEYWORD_BOOLEAN = new XJLNTokenType("boolean");
  IElementType KEYWORD_BYTE = new XJLNTokenType("byte");
  IElementType KEYWORD_CHAR = new XJLNTokenType("char");
  IElementType KEYWORD_CLASS = new XJLNTokenType("class");
  IElementType KEYWORD_CONST = new XJLNTokenType("const");
  IElementType KEYWORD_CONTAINS = new XJLNTokenType("contains");
  IElementType KEYWORD_DATA = new XJLNTokenType("data");
  IElementType KEYWORD_DEF = new XJLNTokenType("def");
  IElementType KEYWORD_DOUBLE = new XJLNTokenType("double");
  IElementType KEYWORD_ELSE = new XJLNTokenType("else");
  IElementType KEYWORD_END = new XJLNTokenType("end");
  IElementType KEYWORD_EXTENDS = new XJLNTokenType("extends");
  IElementType KEYWORD_FINAL = new XJLNTokenType("final");
  IElementType KEYWORD_FLOAT = new XJLNTokenType("float");
  IElementType KEYWORD_FROM = new XJLNTokenType("from");
  IElementType KEYWORD_IF = new XJLNTokenType("if");
  IElementType KEYWORD_IMPLEMENTS = new XJLNTokenType("implements");
  IElementType KEYWORD_INIT = new XJLNTokenType("init");
  IElementType KEYWORD_INT = new XJLNTokenType("int");
  IElementType KEYWORD_INTERFACE = new XJLNTokenType("interface");
  IElementType KEYWORD_LONG = new XJLNTokenType("long");
  IElementType KEYWORD_NULL = new XJLNTokenType("null");
  IElementType KEYWORD_PRIVATE = new XJLNTokenType("private");
  IElementType KEYWORD_PROTECTED = new XJLNTokenType("protected");
  IElementType KEYWORD_PUBLIC = new XJLNTokenType("public");
  IElementType KEYWORD_RETURN = new XJLNTokenType("return");
  IElementType KEYWORD_SHORT = new XJLNTokenType("short");
  IElementType KEYWORD_STATIC = new XJLNTokenType("static");
  IElementType KEYWORD_SYNCHRONISED = new XJLNTokenType("synchronised");
  IElementType KEYWORD_THIS = new XJLNTokenType("this");
  IElementType KEYWORD_TYPE = new XJLNTokenType("type");
  IElementType KEYWORD_USE = new XJLNTokenType("use");
  IElementType KEYWORD_WHILE = new XJLNTokenType("while");
  IElementType LAMBDA = new XJLNTokenType("->");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType NUMBER = new XJLNTokenType("NUMBER");
  IElementType OPERATOR = new XJLNTokenType("OPERATOR");
  IElementType STRING = new XJLNTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACT_METHOD) {
        return new XJLNAbstractMethodImpl(node);
      }
      else if (type == ACCESS_MODIFIER) {
        return new XJLNAccessModifierImpl(node);
      }
      else if (type == ALIAS) {
        return new XJLNAliasImpl(node);
      }
      else if (type == ARGUMENT) {
        return new XJLNArgumentImpl(node);
      }
      else if (type == ARR) {
        return new XJLNArrImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new XJLNArrayTypeImpl(node);
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
      else if (type == CALL_ARG) {
        return new XJLNCallArgImpl(node);
      }
      else if (type == CLASS_NAME) {
        return new XJLNClassNameImpl(node);
      }
      else if (type == CLAZZ) {
        return new XJLNClazzImpl(node);
      }
      else if (type == CLAZZ_NAME) {
        return new XJLNClazzNameImpl(node);
      }
      else if (type == CONTAINS) {
        return new XJLNContainsImpl(node);
      }
      else if (type == DATA) {
        return new XJLNDataImpl(node);
      }
      else if (type == DATATYPE) {
        return new XJLNDatatypeImpl(node);
      }
      else if (type == DATA_TYPE_DEF) {
        return new XJLNDataTypeDefImpl(node);
      }
      else if (type == ELSE) {
        return new XJLNElseImpl(node);
      }
      else if (type == EXTENDS) {
        return new XJLNExtendsImpl(node);
      }
      else if (type == FIELD) {
        return new XJLNFieldImpl(node);
      }
      else if (type == GENERIC) {
        return new XJLNGenericImpl(node);
      }
      else if (type == GENERICS) {
        return new XJLNGenericsImpl(node);
      }
      else if (type == IF) {
        return new XJLNIfImpl(node);
      }
      else if (type == IMPLEMENTS) {
        return new XJLNImplementsImpl(node);
      }
      else if (type == INIT) {
        return new XJLNInitImpl(node);
      }
      else if (type == INTERFACE) {
        return new XJLNInterfaceImpl(node);
      }
      else if (type == METHOD) {
        return new XJLNMethodImpl(node);
      }
      else if (type == METHOD_LONG) {
        return new XJLNMethodLongImpl(node);
      }
      else if (type == METHOD_MULT) {
        return new XJLNMethodMultImpl(node);
      }
      else if (type == METHOD_MULT_ARG) {
        return new XJLNMethodMultArgImpl(node);
      }
      else if (type == METHOD_SHORT) {
        return new XJLNMethodShortImpl(node);
      }
      else if (type == MULTI_USE) {
        return new XJLNMultiUseImpl(node);
      }
      else if (type == PARAMETER) {
        return new XJLNParameterImpl(node);
      }
      else if (type == PARAMETERLIST) {
        return new XJLNParameterlistImpl(node);
      }
      else if (type == PATH) {
        return new XJLNPathImpl(node);
      }
      else if (type == SINGLE_USE) {
        return new XJLNSingleUseImpl(node);
      }
      else if (type == STATEMENT) {
        return new XJLNStatementImpl(node);
      }
      else if (type == STATEMENT_BLOCK) {
        return new XJLNStatementBlockImpl(node);
      }
      else if (type == TYPE) {
        return new XJLNTypeImpl(node);
      }
      else if (type == TYPE_VALUE) {
        return new XJLNTypeValueImpl(node);
      }
      else if (type == USE) {
        return new XJLNUseImpl(node);
      }
      else if (type == VALUE) {
        return new XJLNValueImpl(node);
      }
      else if (type == VAR) {
        return new XJLNVarImpl(node);
      }
      else if (type == WHILE) {
        return new XJLNWhileImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
