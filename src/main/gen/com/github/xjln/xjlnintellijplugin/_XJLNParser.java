// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;
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
  // KEYWORD_ABSTRACT (IDENTIFIER | OPPERATOR) '(' parameterList ')' ('::' (IDENTIFIER | PRIMITIVETYPE))? NEW_LINE
  public static boolean abstractMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod")) return false;
    if (!nextTokenIs(b, KEYWORD_ABSTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ABSTRACT);
    r = r && abstractMethod_1(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && abstractMethod_5(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, ABSTRACT_METHOD, r);
    return r;
  }

  // IDENTIFIER | OPPERATOR
  private static boolean abstractMethod_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, OPPERATOR);
    return r;
  }

  // ('::' (IDENTIFIER | PRIMITIVETYPE))?
  private static boolean abstractMethod_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_5")) return false;
    abstractMethod_5_0(b, l + 1);
    return true;
  }

  // '::' (IDENTIFIER | PRIMITIVETYPE)
  private static boolean abstractMethod_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && abstractMethod_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | PRIMITIVETYPE
  private static boolean abstractMethod_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_5_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, PRIMITIVETYPE);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | use | enum | record | clazz | field | main | methodDefMain
  static boolean argument_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = use(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = record(b, l + 1);
    if (!r) r = clazz(b, l + 1);
    if (!r) r = field(b, l + 1);
    if (!r) r = main(b, l + 1);
    if (!r) r = methodDefMain(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '[' IDENTIFIER (COMMA DIGITS)+']'
  public static boolean arrCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrCreation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARR_CREATION, "<arr creation>");
    r = consumeToken(b, "[");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && arrCreation_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA DIGITS)+
  private static boolean arrCreation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrCreation_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrCreation_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!arrCreation_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrCreation_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA DIGITS
  private static boolean arrCreation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrCreation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, DIGITS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPPERATOR? calcArg (OPPERATOR OPPERATOR? calcArg)*
  public static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC, "<calc>");
    r = calc_0(b, l + 1);
    r = r && calcArg(b, l + 1);
    r = r && calc_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPPERATOR?
  private static boolean calc_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_0")) return false;
    consumeToken(b, OPPERATOR);
    return true;
  }

  // (OPPERATOR OPPERATOR? calcArg)*
  private static boolean calc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!calc_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calc_2", c)) break;
    }
    return true;
  }

  // OPPERATOR OPPERATOR? calcArg
  private static boolean calc_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPPERATOR);
    r = r && calc_2_0_1(b, l + 1);
    r = r && calcArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPPERATOR?
  private static boolean calc_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_2_0_1")) return false;
    consumeToken(b, OPPERATOR);
    return true;
  }

  /* ********************************************************** */
  // call | ('(' calc ')') | STRING | CHAR | DIGITS | DIGITS_FLOATING_POINT
  public static boolean calcArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_ARG, "<calc arg>");
    r = call(b, l + 1);
    if (!r) r = calcArg_1(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, DIGITS);
    if (!r) r = consumeToken(b, DIGITS_FLOATING_POINT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' calc ')'
  private static boolean calcArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (methodCall | varCall | objCreation | arrCreation) (':' (methodCall | varCall))*
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = call_0(b, l + 1);
    r = r && call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // methodCall | varCall | objCreation | arrCreation
  private static boolean call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0")) return false;
    boolean r;
    r = methodCall(b, l + 1);
    if (!r) r = varCall(b, l + 1);
    if (!r) r = objCreation(b, l + 1);
    if (!r) r = arrCreation(b, l + 1);
    return r;
  }

  // (':' (methodCall | varCall))*
  private static boolean call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_1", c)) break;
    }
    return true;
  }

  // ':' (methodCall | varCall)
  private static boolean call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && call_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCall | varCall
  private static boolean call_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0_1")) return false;
    boolean r;
    r = methodCall(b, l + 1);
    if (!r) r = varCall(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // docs (KEYWORD_DEF | KEYWORD_ABSTRACT) IDENTIFIER '[' parameterList ']' ('=>' )? NEW_LINE (methodDef | abstractMethod | init | (field NEW_LINE) | NEW_LINE)* KEYWORD_END
  public static boolean clazz(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAZZ, "<clazz>");
    r = docs(b, l + 1);
    r = r && clazz_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && clazz_6(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && clazz_8(b, l + 1);
    r = r && consumeToken(b, KEYWORD_END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_DEF | KEYWORD_ABSTRACT
  private static boolean clazz_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1")) return false;
    boolean r;
    r = consumeToken(b, KEYWORD_DEF);
    if (!r) r = consumeToken(b, KEYWORD_ABSTRACT);
    return r;
  }

  // ('=>' )?
  private static boolean clazz_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6")) return false;
    clazz_6_0(b, l + 1);
    return true;
  }

  // ('=>' )
  private static boolean clazz_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=>");
    exit_section_(b, m, null, r);
    return r;
  }

  // (methodDef | abstractMethod | init | (field NEW_LINE) | NEW_LINE)*
  private static boolean clazz_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_8", c)) break;
    }
    return true;
  }

  // methodDef | abstractMethod | init | (field NEW_LINE) | NEW_LINE
  private static boolean clazz_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDef(b, l + 1);
    if (!r) r = abstractMethod(b, l + 1);
    if (!r) r = init(b, l + 1);
    if (!r) r = clazz_8_0_3(b, l + 1);
    if (!r) r = consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // field NEW_LINE
  private static boolean clazz_8_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_8_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (DOC NEW_LINE)*
  static boolean docs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs")) return false;
    while (true) {
      int c = current_position_(b);
      if (!docs_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docs", c)) break;
    }
    return true;
  }

  // DOC NEW_LINE
  private static boolean docs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOC, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs KEYWORD_DEF IDENTIFIER '=' IDENTIFIER ('|' IDENTIFIER)*
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, "<enum $>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM, "<enum $>");
    r = docs(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_DEF, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enum_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('|' IDENTIFIER)*
  private static boolean enum_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_5", c)) break;
    }
    return true;
  }

  // '|' IDENTIFIER
  private static boolean enum_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_INNER? var
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && var(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_INNER?
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    consumeToken(b, KEYWORD_INNER);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_INIT (methodShort | methodCode) NEW_LINE
  public static boolean init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init")) return false;
    if (!nextTokenIs(b, KEYWORD_INIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_INIT);
    r = r && init_1(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, INIT, r);
    return r;
  }

  // methodShort | methodCode
  private static boolean init_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_1")) return false;
    boolean r;
    r = methodShort(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_MAIN (methodShort | methodCode)
  public static boolean main(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main")) return false;
    if (!nextTokenIs(b, KEYWORD_MAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_MAIN);
    r = r && main_1(b, l + 1);
    exit_section_(b, m, MAIN, r);
    return r;
  }

  // methodShort | methodCode
  private static boolean main_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1")) return false;
    boolean r;
    r = methodShort(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' parameterListArguments ')'
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && parameterListArguments(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // NEW_LINE (statement NEW_LINE)* KEYWORD_END NEW_LINE
  public static boolean methodCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode")) return false;
    if (!nextTokenIs(b, NEW_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && methodCode_1(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_END, NEW_LINE);
    exit_section_(b, m, METHOD_CODE, r);
    return r;
  }

  // (statement NEW_LINE)*
  private static boolean methodCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodCode_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCode_1", c)) break;
    }
    return true;
  }

  // statement NEW_LINE
  private static boolean methodCode_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF (IDENTIFIER | OPPERATOR) '(' parameterList ')' ('::' (IDENTIFIER | PRIMITIVETYPE))? (((methodShort | methodEquals) NEW_LINE)  | methodCode | methodDefMulti)
  public static boolean methodDef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && methodDef_1(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && methodDef_5(b, l + 1);
    r = r && methodDef_6(b, l + 1);
    exit_section_(b, m, METHOD_DEF, r);
    return r;
  }

  // IDENTIFIER | OPPERATOR
  private static boolean methodDef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, OPPERATOR);
    return r;
  }

  // ('::' (IDENTIFIER | PRIMITIVETYPE))?
  private static boolean methodDef_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_5")) return false;
    methodDef_5_0(b, l + 1);
    return true;
  }

  // '::' (IDENTIFIER | PRIMITIVETYPE)
  private static boolean methodDef_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && methodDef_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | PRIMITIVETYPE
  private static boolean methodDef_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_5_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, PRIMITIVETYPE);
    return r;
  }

  // ((methodShort | methodEquals) NEW_LINE)  | methodCode | methodDefMulti
  private static boolean methodDef_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDef_6_0(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    if (!r) r = methodDefMulti(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (methodShort | methodEquals) NEW_LINE
  private static boolean methodDef_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDef_6_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodShort | methodEquals
  private static boolean methodDef_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDef_6_0_0")) return false;
    boolean r;
    r = methodShort(b, l + 1);
    if (!r) r = methodEquals(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF IDENTIFIER '(' parameterList ')' ('::' (IDENTIFIER | PRIMITIVETYPE))? (((methodShort | methodEquals) NEW_LINE) | methodCode | methodDefMulti)
  public static boolean methodDefMain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_DEF, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && methodDefMain_5(b, l + 1);
    r = r && methodDefMain_6(b, l + 1);
    exit_section_(b, m, METHOD_DEF_MAIN, r);
    return r;
  }

  // ('::' (IDENTIFIER | PRIMITIVETYPE))?
  private static boolean methodDefMain_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_5")) return false;
    methodDefMain_5_0(b, l + 1);
    return true;
  }

  // '::' (IDENTIFIER | PRIMITIVETYPE)
  private static boolean methodDefMain_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && methodDefMain_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | PRIMITIVETYPE
  private static boolean methodDefMain_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_5_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, PRIMITIVETYPE);
    return r;
  }

  // ((methodShort | methodEquals) NEW_LINE) | methodCode | methodDefMulti
  private static boolean methodDefMain_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDefMain_6_0(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    if (!r) r = methodDefMulti(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (methodShort | methodEquals) NEW_LINE
  private static boolean methodDefMain_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDefMain_6_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodShort | methodEquals
  private static boolean methodDefMain_6_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMain_6_0_0")) return false;
    boolean r;
    r = methodShort(b, l + 1);
    if (!r) r = methodEquals(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '{' ('(' calc ')' ((methodShort | methodEquals) NEW_LINE) | methodCode)* NEW_LINE '}' NEW_LINE
  public static boolean methodDefMulti(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_DEF_MULTI, "<method def multi>");
    r = consumeToken(b, "{");
    r = r && methodDefMulti_1(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && consumeToken(b, "}");
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('(' calc ')' ((methodShort | methodEquals) NEW_LINE) | methodCode)*
  private static boolean methodDefMulti_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodDefMulti_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodDefMulti_1", c)) break;
    }
    return true;
  }

  // '(' calc ')' ((methodShort | methodEquals) NEW_LINE) | methodCode
  private static boolean methodDefMulti_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDefMulti_1_0_0(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' calc ')' ((methodShort | methodEquals) NEW_LINE)
  private static boolean methodDefMulti_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && methodDefMulti_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (methodShort | methodEquals) NEW_LINE
  private static boolean methodDefMulti_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti_1_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodDefMulti_1_0_0_3_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodShort | methodEquals
  private static boolean methodDefMulti_1_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodDefMulti_1_0_0_3_0")) return false;
    boolean r;
    r = methodShort(b, l + 1);
    if (!r) r = methodEquals(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '=' calc
  public static boolean methodEquals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodEquals")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_EQUALS, "<method equals>");
    r = consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '->' statement
  public static boolean methodShort(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodShort")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SHORT, "<method short>");
    r = consumeToken(b, "->");
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '[' parameterListArguments ']'
  public static boolean objCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objCreation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && parameterListArguments(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, OBJ_CREATION, r);
    return r;
  }

  /* ********************************************************** */
  // (var (COMMA var)*)?
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    parameterList_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // var (COMMA var)*
  private static boolean parameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    r = r && parameterList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA var)*
  private static boolean parameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_0_1", c)) break;
    }
    return true;
  }

  // COMMA var
  private static boolean parameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (calc (COMMA calc)*)?
  public static boolean parameterListArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterListArguments")) return false;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST_ARGUMENTS, "<parameter list arguments>");
    parameterListArguments_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean parameterListArguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterListArguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && parameterListArguments_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean parameterListArguments_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterListArguments_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterListArguments_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterListArguments_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean parameterListArguments_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterListArguments_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs KEYWORD_DEF IDENTIFIER '=' '[' parameterList ']'
  public static boolean record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record")) return false;
    if (!nextTokenIs(b, "<record>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD, "<record>");
    r = docs(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_DEF, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, "[");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KEYWORD_RETURN (call | calc)) | var | calc | call
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = var(b, l + 1);
    if (!r) r = calc(b, l + 1);
    if (!r) r = call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_RETURN (call | calc)
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // call | calc
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    boolean r;
    r = call(b, l + 1);
    if (!r) r = calc(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PRIMITIVETYPE | IDENTIFIER | '[' IDENTIFIER ']'
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, PRIMITIVETYPE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' IDENTIFIER ']'
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_USE ((PATH) | (('{' IDENTIFIER (COMMA IDENTIFIER)* '}') | (IDENTIFIER)) KEYWORD_FROM PATH) (KEYWORD_AS IDENTIFIER)?
  public static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    if (!nextTokenIs(b, KEYWORD_USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_USE);
    r = r && use_1(b, l + 1);
    r = r && use_2(b, l + 1);
    exit_section_(b, m, USE, r);
    return r;
  }

  // (PATH) | (('{' IDENTIFIER (COMMA IDENTIFIER)* '}') | (IDENTIFIER)) KEYWORD_FROM PATH
  private static boolean use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PATH);
    if (!r) r = use_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('{' IDENTIFIER (COMMA IDENTIFIER)* '}') | (IDENTIFIER)) KEYWORD_FROM PATH
  private static boolean use_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_1_1_0(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_FROM, PATH);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('{' IDENTIFIER (COMMA IDENTIFIER)* '}') | (IDENTIFIER)
  private static boolean use_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_1_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' IDENTIFIER (COMMA IDENTIFIER)* '}'
  private static boolean use_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && use_1_1_0_0_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean use_1_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_1_1_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_1_1_0_0_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean use_1_1_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_AS IDENTIFIER)?
  private static boolean use_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_2")) return false;
    use_2_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS IDENTIFIER
  private static boolean use_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEYWORD_AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_CONST? ((type IDENTIFIER) | (type? IDENTIFIER '=' calc))
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = var_0(b, l + 1);
    r = r && var_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_CONST?
  private static boolean var_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_0")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  // (type IDENTIFIER) | (type? IDENTIFIER '=' calc)
  private static boolean var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_1_0(b, l + 1);
    if (!r) r = var_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type IDENTIFIER
  private static boolean var_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // type? IDENTIFIER '=' calc
  private static boolean var_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_1_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean var_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1_1_0")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean varCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VAR_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // (argument_? (NEW_LINE argument_?)*)?
  static boolean xjlnFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile")) return false;
    xjlnFile_0(b, l + 1);
    return true;
  }

  // argument_? (NEW_LINE argument_?)*
  private static boolean xjlnFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0_0(b, l + 1);
    r = r && xjlnFile_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_?
  private static boolean xjlnFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_0")) return false;
    argument_(b, l + 1);
    return true;
  }

  // (NEW_LINE argument_?)*
  private static boolean xjlnFile_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xjlnFile_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_0_1", c)) break;
    }
    return true;
  }

  // NEW_LINE argument_?
  private static boolean xjlnFile_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && xjlnFile_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_?
  private static boolean xjlnFile_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_1_0_1")) return false;
    argument_(b, l + 1);
    return true;
  }

}
