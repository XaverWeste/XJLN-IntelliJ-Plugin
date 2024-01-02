// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;
//import static com.github.xjln.xjlnintellijplugin.XJLNParserUtil.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;

import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class _XJLNParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return xjlnFile(b, l + 1);
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_ABSTRACT IDENTIFIER
  public static boolean abstract_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && abstract_method_1(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_ABSTRACT, IDENTIFIER);
    exit_section_(b, m, ABSTRACT_METHOD, r);
    return r;
  }

  // access_modifier?
  private static boolean abstract_method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_PUBLIC | KEYWORD_PROTECTED | KEYWORD_PRIVATE
  public static boolean access_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESS_MODIFIER, "<access modifier>");
    r = consumeToken(b, KEYWORD_PUBLIC);
    if (!r) r = consumeToken(b, KEYWORD_PROTECTED);
    if (!r) r = consumeToken(b, KEYWORD_PRIVATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // use | field | data | type | interface | clazz | method | COMMENT
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = use(b, l + 1);
    if (!r) r = field(b, l + 1);
    if (!r) r = data(b, l + 1);
    if (!r) r = type(b, l + 1);
    if (!r) r = interface_$(b, l + 1);
    if (!r) r = clazz(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_CLASS (KEYWORD_ABSTRACT | KEYWORD_FINAL)* IDENTIFIER "{" ((field | abstract_method | method | COMMENT)? NEW_LINE)* "}"
  public static boolean clazz(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && clazz_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_CLASS);
    r = r && clazz_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "{");
    r = r && clazz_6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, CLAZZ, r);
    return r;
  }

  // access_modifier?
  private static boolean clazz_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // (KEYWORD_ABSTRACT | KEYWORD_FINAL)*
  private static boolean clazz_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_3", c)) break;
    }
    return true;
  }

  // KEYWORD_ABSTRACT | KEYWORD_FINAL
  private static boolean clazz_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_3_0")) return false;
    boolean r;
    r = consumeToken(b, KEYWORD_ABSTRACT);
    if (!r) r = consumeToken(b, KEYWORD_FINAL);
    return r;
  }

  // ((field | abstract_method | method | COMMENT)? NEW_LINE)*
  private static boolean clazz_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_6", c)) break;
    }
    return true;
  }

  // (field | abstract_method | method | COMMENT)? NEW_LINE
  private static boolean clazz_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clazz_6_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (field | abstract_method | method | COMMENT)?
  private static boolean clazz_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6_0_0")) return false;
    clazz_6_0_0_0(b, l + 1);
    return true;
  }

  // field | abstract_method | method | COMMENT
  private static boolean clazz_6_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6_0_0_0")) return false;
    boolean r;
    r = field(b, l + 1);
    if (!r) r = abstract_method(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // data_type_def KEYWORD_CONST? KEYWORD_DATA IDENTIFIER "=" "[" (datatype IDENTIFIER ("," datatype IDENTIFIER)*)? "]"
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_type_def(b, l + 1);
    r = r && data_1(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_DATA, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, "[");
    r = r && data_6(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, DATA, r);
    return r;
  }

  // KEYWORD_CONST?
  private static boolean data_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_1")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  // (datatype IDENTIFIER ("," datatype IDENTIFIER)*)?
  private static boolean data_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_6")) return false;
    data_6_0(b, l + 1);
    return true;
  }

  // datatype IDENTIFIER ("," datatype IDENTIFIER)*
  private static boolean data_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && data_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," datatype IDENTIFIER)*
  private static boolean data_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_6_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_6_0_2", c)) break;
    }
    return true;
  }

  // "," datatype IDENTIFIER
  private static boolean data_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_FINAL?
  public static boolean data_type_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type_def")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && data_type_def_1(b, l + 1);
    r = r && data_type_def_2(b, l + 1);
    exit_section_(b, m, DATA_TYPE_DEF, r);
    return r;
  }

  // access_modifier?
  private static boolean data_type_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type_def_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // KEYWORD_FINAL?
  private static boolean data_type_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_type_def_2")) return false;
    consumeToken(b, KEYWORD_FINAL);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | KEYWORD_INT | KEYWORD_SHORT | KEYWORD_LONG | KEYWORD_FLOAT | KEYWORD_DOUBLE | KEYWORD_BOOLEAN | KEYWORD_CHAR | KEYWORD_BYTE
  public static boolean datatype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE, "<datatype>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KEYWORD_INT);
    if (!r) r = consumeToken(b, KEYWORD_SHORT);
    if (!r) r = consumeToken(b, KEYWORD_LONG);
    if (!r) r = consumeToken(b, KEYWORD_FLOAT);
    if (!r) r = consumeToken(b, KEYWORD_DOUBLE);
    if (!r) r = consumeToken(b, KEYWORD_BOOLEAN);
    if (!r) r = consumeToken(b, KEYWORD_CHAR);
    if (!r) r = consumeToken(b, KEYWORD_BYTE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // access_modifier? KEYWORD_STATIC? datatype IDENTIFIER ("=" value)?
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && field_1(b, l + 1);
    r = r && datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && field_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // access_modifier?
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // KEYWORD_STATIC?
  private static boolean field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_1")) return false;
    consumeToken(b, KEYWORD_STATIC);
    return true;
  }

  // ("=" value)?
  private static boolean field_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4")) return false;
    field_4_0(b, l + 1);
    return true;
  }

  // "=" value
  private static boolean field_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_ABSTRACT? KEYWORD_INTERFACE IDENTIFIER "{" ((abstract_method | COMMENT)? NEW_LINE)* "}"
  public static boolean interface_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_$")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && interface_1(b, l + 1);
    r = r && interface_2(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_INTERFACE, IDENTIFIER);
    r = r && consumeToken(b, "{");
    r = r && interface_6(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, INTERFACE, r);
    return r;
  }

  // access_modifier?
  private static boolean interface_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // KEYWORD_ABSTRACT?
  private static boolean interface_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_2")) return false;
    consumeToken(b, KEYWORD_ABSTRACT);
    return true;
  }

  // ((abstract_method | COMMENT)? NEW_LINE)*
  private static boolean interface_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_6", c)) break;
    }
    return true;
  }

  // (abstract_method | COMMENT)? NEW_LINE
  private static boolean interface_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_6_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (abstract_method | COMMENT)?
  private static boolean interface_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_6_0_0")) return false;
    interface_6_0_0_0(b, l + 1);
    return true;
  }

  // abstract_method | COMMENT
  private static boolean interface_6_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_6_0_0_0")) return false;
    boolean r;
    r = abstract_method(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? (KEYWORD_STATIC | KEYWORD_SYNCHRONISED)* IDENTIFIER "(" (datatype IDENTIFIER ("," datatype IDENTIFIER)*)? ")" ("::" datatype)? NEW_LINE KEYWORD_END
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && method_1(b, l + 1);
    r = r && method_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && method_5(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_7(b, l + 1);
    r = r && consumeTokens(b, 0, NEW_LINE, KEYWORD_END);
    exit_section_(b, m, METHOD, r);
    return r;
  }

  // access_modifier?
  private static boolean method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // (KEYWORD_STATIC | KEYWORD_SYNCHRONISED)*
  private static boolean method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_2", c)) break;
    }
    return true;
  }

  // KEYWORD_STATIC | KEYWORD_SYNCHRONISED
  private static boolean method_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_2_0")) return false;
    boolean r;
    r = consumeToken(b, KEYWORD_STATIC);
    if (!r) r = consumeToken(b, KEYWORD_SYNCHRONISED);
    return r;
  }

  // (datatype IDENTIFIER ("," datatype IDENTIFIER)*)?
  private static boolean method_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5")) return false;
    method_5_0(b, l + 1);
    return true;
  }

  // datatype IDENTIFIER ("," datatype IDENTIFIER)*
  private static boolean method_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && method_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("," datatype IDENTIFIER)*
  private static boolean method_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_5_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_5_0_2", c)) break;
    }
    return true;
  }

  // "," datatype IDENTIFIER
  private static boolean method_5_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("::" datatype)?
  private static boolean method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7")) return false;
    method_7_0(b, l + 1);
    return true;
  }

  // "::" datatype
  private static boolean method_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && datatype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" IDENTIFIER ("," IDENTIFIER)* "}" KEYWORD_FROM path
  public static boolean multi_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_USE, "<multi use>");
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && multi_use_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeToken(b, KEYWORD_FROM);
    r = r && path(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ("," IDENTIFIER)*
  private static boolean multi_use_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multi_use_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multi_use_2", c)) break;
    }
    return true;
  }

  // "," IDENTIFIER
  private static boolean multi_use_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ("/" IDENTIFIER)*
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && path_1(b, l + 1);
    exit_section_(b, m, PATH, r);
    return r;
  }

  // ("/" IDENTIFIER)*
  private static boolean path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path_1", c)) break;
    }
    return true;
  }

  // "/" IDENTIFIER
  private static boolean path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((IDENTIFIER KEYWORD_FROM path) | path) (KEYWORD_AS IDENTIFIER)?
  public static boolean single_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_use_0(b, l + 1);
    r = r && single_use_1(b, l + 1);
    exit_section_(b, m, SINGLE_USE, r);
    return r;
  }

  // (IDENTIFIER KEYWORD_FROM path) | path
  private static boolean single_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_use_0_0(b, l + 1);
    if (!r) r = path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER KEYWORD_FROM path
  private static boolean single_use_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, KEYWORD_FROM);
    r = r && path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_AS IDENTIFIER)?
  private static boolean single_use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_1")) return false;
    single_use_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS IDENTIFIER
  private static boolean single_use_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // data_type_def KEYWORD_TYPE IDENTIFIER "=" IDENTIFIER ("|" IDENTIFIER)*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_type_def(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_TYPE, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_5(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // ("|" IDENTIFIER)*
  private static boolean type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_5", c)) break;
    }
    return true;
  }

  // "|" IDENTIFIER
  private static boolean type_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_USE (single_use | multi_use)
  public static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    if (!nextTokenIs(b, KEYWORD_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_USE);
    r = r && use_1(b, l + 1);
    exit_section_(b, m, USE, r);
    return r;
  }

  // single_use | multi_use
  private static boolean use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1")) return false;
    boolean r;
    r = single_use(b, l + 1);
    if (!r) r = multi_use(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CHAR | NUMBER | STRING
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // argument? (NEW_LINE argument?)*
  static boolean xjlnFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0(b, l + 1);
    r = r && xjlnFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument?
  private static boolean xjlnFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0")) return false;
    argument(b, l + 1);
    return true;
  }

  // (NEW_LINE argument?)*
  private static boolean xjlnFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xjlnFile_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_1", c)) break;
    }
    return true;
  }

  // NEW_LINE argument?
  private static boolean xjlnFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && xjlnFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument?
  private static boolean xjlnFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1_0_1")) return false;
    argument(b, l + 1);
    return true;
  }

}
