// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.xjln.xjlnintellijplugin.psi.impl.*;

public interface XJLNTypes {

  IElementType ABSTRACT_METHOD = new XJLNElementType("ABSTRACT_METHOD");
  IElementType ACCESS_MODIFIER = new XJLNElementType("ACCESS_MODIFIER");
  IElementType ARGUMENT = new XJLNElementType("ARGUMENT");
  IElementType CLAZZ = new XJLNElementType("CLAZZ");
  IElementType DATA = new XJLNElementType("DATA");
  IElementType DATATYPE = new XJLNElementType("DATATYPE");
  IElementType DATA_TYPE_DEF = new XJLNElementType("DATA_TYPE_DEF");
  IElementType FIELD = new XJLNElementType("FIELD");
  IElementType INTERFACE = new XJLNElementType("INTERFACE");
  IElementType METHOD = new XJLNElementType("METHOD");
  IElementType MULTI_USE = new XJLNElementType("MULTI_USE");
  IElementType PATH = new XJLNElementType("PATH");
  IElementType SINGLE_USE = new XJLNElementType("SINGLE_USE");
  IElementType TYPE = new XJLNElementType("TYPE");
  IElementType USE = new XJLNElementType("USE");
  IElementType VALUE = new XJLNElementType("VALUE");

  IElementType CHAR = new XJLNTokenType("CHAR");
  IElementType COMMENT = new XJLNTokenType("COMMENT");
  IElementType IDENTIFIER = new XJLNTokenType("IDENTIFIER");
  IElementType KEYWORD_ABSTRACT = new XJLNTokenType("abstract");
  IElementType KEYWORD_AS = new XJLNTokenType("as");
  IElementType KEYWORD_BOOLEAN = new XJLNTokenType("boolean");
  IElementType KEYWORD_BYTE = new XJLNTokenType("byte");
  IElementType KEYWORD_CHAR = new XJLNTokenType("char");
  IElementType KEYWORD_CLASS = new XJLNTokenType("class");
  IElementType KEYWORD_CONST = new XJLNTokenType("const");
  IElementType KEYWORD_DATA = new XJLNTokenType("data");
  IElementType KEYWORD_DEF = new XJLNTokenType("def");
  IElementType KEYWORD_DOUBLE = new XJLNTokenType("double");
  IElementType KEYWORD_ELSE = new XJLNTokenType("else");
  IElementType KEYWORD_END = new XJLNTokenType("end");
  IElementType KEYWORD_FINAL = new XJLNTokenType("final");
  IElementType KEYWORD_FLOAT = new XJLNTokenType("float");
  IElementType KEYWORD_FROM = new XJLNTokenType("from");
  IElementType KEYWORD_IF = new XJLNTokenType("if");
  IElementType KEYWORD_INIT = new XJLNTokenType("init");
  IElementType KEYWORD_INT = new XJLNTokenType("int");
  IElementType KEYWORD_INTERFACE = new XJLNTokenType("interface");
  IElementType KEYWORD_LONG = new XJLNTokenType("long");
  IElementType KEYWORD_PRIVATE = new XJLNTokenType("private");
  IElementType KEYWORD_PROTECTED = new XJLNTokenType("protected");
  IElementType KEYWORD_PUBLIC = new XJLNTokenType("public");
  IElementType KEYWORD_RETURN = new XJLNTokenType("return");
  IElementType KEYWORD_SHORT = new XJLNTokenType("short");
  IElementType KEYWORD_STATIC = new XJLNTokenType("static");
  IElementType KEYWORD_SYNCHRONISED = new XJLNTokenType("synchronised");
  IElementType KEYWORD_TYPE = new XJLNTokenType("type");
  IElementType KEYWORD_USE = new XJLNTokenType("use");
  IElementType KEYWORD_WHILE = new XJLNTokenType("while");
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
      else if (type == ARGUMENT) {
        return new XJLNArgumentImpl(node);
      }
      else if (type == CLAZZ) {
        return new XJLNClazzImpl(node);
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
      else if (type == FIELD) {
        return new XJLNFieldImpl(node);
      }
      else if (type == INTERFACE) {
        return new XJLNInterfaceImpl(node);
      }
      else if (type == METHOD) {
        return new XJLNMethodImpl(node);
      }
      else if (type == MULTI_USE) {
        return new XJLNMultiUseImpl(node);
      }
      else if (type == PATH) {
        return new XJLNPathImpl(node);
      }
      else if (type == SINGLE_USE) {
        return new XJLNSingleUseImpl(node);
      }
      else if (type == TYPE) {
        return new XJLNTypeImpl(node);
      }
      else if (type == USE) {
        return new XJLNUseImpl(node);
      }
      else if (type == VALUE) {
        return new XJLNValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
