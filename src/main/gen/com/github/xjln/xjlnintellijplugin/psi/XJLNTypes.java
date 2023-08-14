// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xjln.xjlnintellijplugin.psi.impl.*;

public interface XJLNTypes {

  IElementType ABSTRACT_METHOD = new XJLNElementType("ABSTRACT_METHOD");
  IElementType ARGUMENT = new XJLNElementType("ARGUMENT");
  IElementType ARRAY_CREATION = new XJLNElementType("ARRAY_CREATION");
  IElementType ARRAY_TYPE = new XJLNElementType("ARRAY_TYPE");
  IElementType CALC = new XJLNElementType("CALC");
  IElementType CALC_ARG = new XJLNElementType("CALC_ARG");
  IElementType CALL = new XJLNElementType("CALL");
  IElementType CLASS_ARGUMENT = new XJLNElementType("CLASS_ARGUMENT");
  IElementType CLASS_METHOD = new XJLNElementType("CLASS_METHOD");
  IElementType CLAZZ = new XJLNElementType("CLAZZ");
  IElementType COMPLEX_TYPE = new XJLNElementType("COMPLEX_TYPE");
  IElementType DOCS = new XJLNElementType("DOCS");
  IElementType ELSE_STATEMENT = new XJLNElementType("ELSE_STATEMENT");
  IElementType ENUM = new XJLNElementType("ENUM");
  IElementType ENUM_VALUE = new XJLNElementType("ENUM_VALUE");
  IElementType FIELD = new XJLNElementType("FIELD");
  IElementType FOR_STATEMENT = new XJLNElementType("FOR_STATEMENT");
  IElementType GENERICS = new XJLNElementType("GENERICS");
  IElementType IDENTIFIER = new XJLNElementType("IDENTIFIER");
  IElementType IF_STATEMENT = new XJLNElementType("IF_STATEMENT");
  IElementType INIT = new XJLNElementType("INIT");
  IElementType INTEGER = new XJLNElementType("INTEGER");
  IElementType MAIN = new XJLNElementType("MAIN");
  IElementType METHOD = new XJLNElementType("METHOD");
  IElementType METHOD_CALL = new XJLNElementType("METHOD_CALL");
  IElementType METHOD_CODE = new XJLNElementType("METHOD_CODE");
  IElementType METHOD_EQUAL = new XJLNElementType("METHOD_EQUAL");
  IElementType METHOD_STATEMENT = new XJLNElementType("METHOD_STATEMENT");
  IElementType METHOD_SWITCH = new XJLNElementType("METHOD_SWITCH");
  IElementType METHOD_SWITCH_ARG = new XJLNElementType("METHOD_SWITCH_ARG");
  IElementType MULTI_USE = new XJLNElementType("MULTI_USE");
  IElementType NUMBER = new XJLNElementType("NUMBER");
  IElementType OBJECT_CREATION = new XJLNElementType("OBJECT_CREATION");
  IElementType OPERATORS = new XJLNElementType("OPERATORS");
  IElementType PARAMETER = new XJLNElementType("PARAMETER");
  IElementType PARAMETER_LIST = new XJLNElementType("PARAMETER_LIST");
  IElementType PATH = new XJLNElementType("PATH");
  IElementType PRIMITIVE_TYPE = new XJLNElementType("PRIMITIVE_TYPE");
  IElementType RECORD = new XJLNElementType("RECORD");
  IElementType RETURN_STATEMENT = new XJLNElementType("RETURN_STATEMENT");
  IElementType SINGLE_USE = new XJLNElementType("SINGLE_USE");
  IElementType STATEMENT = new XJLNElementType("STATEMENT");
  IElementType TYPE = new XJLNElementType("TYPE");
  IElementType USE = new XJLNElementType("USE");
  IElementType USE_FROM_PATH = new XJLNElementType("USE_FROM_PATH");
  IElementType VALUE = new XJLNElementType("VALUE");
  IElementType VAR = new XJLNElementType("VAR");
  IElementType VAR_WITHOUT_VALUE = new XJLNElementType("VAR_WITHOUT_VALUE");
  IElementType WHILE_STATEMENT = new XJLNElementType("WHILE_STATEMENT");

  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMA = new XJLNTokenType(",");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType DIGIT = new XJLNTokenType("DIGIT");
  IElementType DOC = new XJLNTokenType("DOC");
  IElementType KEYWORD_ABSTRACT = new XJLNTokenType("abstract");
  IElementType KEYWORD_AS = new XJLNTokenType("as");
  IElementType KEYWORD_BOOLEAN = new XJLNTokenType("boolean");
  IElementType KEYWORD_BYTE = new XJLNTokenType("byte");
  IElementType KEYWORD_CHAR = new XJLNTokenType("char");
  IElementType KEYWORD_CONST = new XJLNTokenType("const");
  IElementType KEYWORD_DEF = new XJLNTokenType("def");
  IElementType KEYWORD_DOUBLE = new XJLNTokenType("double");
  IElementType KEYWORD_ELSE = new XJLNTokenType("else");
  IElementType KEYWORD_END = new XJLNTokenType("end");
  IElementType KEYWORD_FLOAT = new XJLNTokenType("float");
  IElementType KEYWORD_FOR = new XJLNTokenType("for");
  IElementType KEYWORD_FROM = new XJLNTokenType("from");
  IElementType KEYWORD_IF = new XJLNTokenType("if");
  IElementType KEYWORD_IN = new XJLNTokenType("in");
  IElementType KEYWORD_INIT = new XJLNTokenType("init");
  IElementType KEYWORD_INNER = new XJLNTokenType("inner");
  IElementType KEYWORD_INT = new XJLNTokenType("int");
  IElementType KEYWORD_LONG = new XJLNTokenType("long");
  IElementType KEYWORD_MAIN = new XJLNTokenType("main");
  IElementType KEYWORD_RETURN = new XJLNTokenType("return");
  IElementType KEYWORD_SHORT = new XJLNTokenType("short");
  IElementType KEYWORD_USE = new XJLNTokenType("use");
  IElementType KEYWORD_VAR = new XJLNTokenType("var");
  IElementType KEYWORD_WHILE = new XJLNTokenType("while");
  IElementType LETTER = new XJLNTokenType("LETTER");
  IElementType NEW_LINE = new XJLNTokenType("NEW_LINE");
  IElementType OPERATOR = new XJLNTokenType("OPERATOR");
  IElementType STRING = new XJLNTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACT_METHOD) {
        return new XJLNAbstractMethodImpl(node);
      }
      else if (type == ARGUMENT) {
        return new XJLNArgumentImpl(node);
      }
      else if (type == ARRAY_CREATION) {
        return new XJLNArrayCreationImpl(node);
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
      else if (type == CLASS_ARGUMENT) {
        return new XJLNClassArgumentImpl(node);
      }
      else if (type == CLASS_METHOD) {
        return new XJLNClassMethodImpl(node);
      }
      else if (type == CLAZZ) {
        return new XJLNClazzImpl(node);
      }
      else if (type == COMPLEX_TYPE) {
        return new XJLNComplexTypeImpl(node);
      }
      else if (type == DOCS) {
        return new XJLNDocsImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new XJLNElseStatementImpl(node);
      }
      else if (type == ENUM) {
        return new XJLNEnumImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new XJLNEnumValueImpl(node);
      }
      else if (type == FIELD) {
        return new XJLNFieldImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new XJLNForStatementImpl(node);
      }
      else if (type == GENERICS) {
        return new XJLNGenericsImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new XJLNIdentifierImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new XJLNIfStatementImpl(node);
      }
      else if (type == INIT) {
        return new XJLNInitImpl(node);
      }
      else if (type == INTEGER) {
        return new XJLNIntegerImpl(node);
      }
      else if (type == MAIN) {
        return new XJLNMainImpl(node);
      }
      else if (type == METHOD) {
        return new XJLNMethodImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new XJLNMethodCallImpl(node);
      }
      else if (type == METHOD_CODE) {
        return new XJLNMethodCodeImpl(node);
      }
      else if (type == METHOD_EQUAL) {
        return new XJLNMethodEqualImpl(node);
      }
      else if (type == METHOD_STATEMENT) {
        return new XJLNMethodStatementImpl(node);
      }
      else if (type == METHOD_SWITCH) {
        return new XJLNMethodSwitchImpl(node);
      }
      else if (type == METHOD_SWITCH_ARG) {
        return new XJLNMethodSwitchArgImpl(node);
      }
      else if (type == MULTI_USE) {
        return new XJLNMultiUseImpl(node);
      }
      else if (type == NUMBER) {
        return new XJLNNumberImpl(node);
      }
      else if (type == OBJECT_CREATION) {
        return new XJLNObjectCreationImpl(node);
      }
      else if (type == OPERATORS) {
        return new XJLNOperatorsImpl(node);
      }
      else if (type == PARAMETER) {
        return new XJLNParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new XJLNParameterListImpl(node);
      }
      else if (type == PATH) {
        return new XJLNPathImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new XJLNPrimitiveTypeImpl(node);
      }
      else if (type == RECORD) {
        return new XJLNRecordImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new XJLNReturnStatementImpl(node);
      }
      else if (type == SINGLE_USE) {
        return new XJLNSingleUseImpl(node);
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
      else if (type == USE_FROM_PATH) {
        return new XJLNUseFromPathImpl(node);
      }
      else if (type == VALUE) {
        return new XJLNValueImpl(node);
      }
      else if (type == VAR) {
        return new XJLNVarImpl(node);
      }
      else if (type == VAR_WITHOUT_VALUE) {
        return new XJLNVarWithoutValueImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new XJLNWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
