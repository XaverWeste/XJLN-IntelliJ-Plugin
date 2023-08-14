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
  // docs? KEYWORD_ABSTRACT KEYWORD_INNER? (identifier | operators) generics? '(' parameterList ')' ('::' type)?
  public static boolean abstractMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod")) return false;
    if (!nextTokenIs(b, "<abstract method>", DOC, KEYWORD_ABSTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_METHOD, "<abstract method>");
    r = abstractMethod_0(b, l + 1);
    r = r && consumeToken(b, KEYWORD_ABSTRACT);
    r = r && abstractMethod_2(b, l + 1);
    r = r && abstractMethod_3(b, l + 1);
    r = r && abstractMethod_4(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && abstractMethod_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean abstractMethod_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // KEYWORD_INNER?
  private static boolean abstractMethod_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_2")) return false;
    consumeToken(b, KEYWORD_INNER);
    return true;
  }

  // identifier | operators
  private static boolean abstractMethod_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_3")) return false;
    boolean r;
    r = identifier(b, l + 1);
    if (!r) r = operators(b, l + 1);
    return r;
  }

  // generics?
  private static boolean abstractMethod_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_4")) return false;
    generics(b, l + 1);
    return true;
  }

  // ('::' type)?
  private static boolean abstractMethod_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_8")) return false;
    abstractMethod_8_0(b, l + 1);
    return true;
  }

  // '::' type
  private static boolean abstractMethod_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractMethod_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | record | enum | clazz | method | field | use
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = consumeToken(b, COMMENT);
    if (!r) r = record(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = clazz(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = field(b, l + 1);
    if (!r) r = use(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('[' type (COMMA integer)+ ']') | ('{' (calc (COMMA calc)*)? '}')
  public static boolean arrayCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CREATION, "<array creation>");
    r = arrayCreation_0(b, l + 1);
    if (!r) r = arrayCreation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '[' type (COMMA integer)+ ']'
  private static boolean arrayCreation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && type(b, l + 1);
    r = r && arrayCreation_0_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA integer)+
  private static boolean arrayCreation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayCreation_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!arrayCreation_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayCreation_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA integer
  private static boolean arrayCreation_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' (calc (COMMA calc)*)? '}'
  private static boolean arrayCreation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && arrayCreation_1_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean arrayCreation_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_1_1")) return false;
    arrayCreation_1_1_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean arrayCreation_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && arrayCreation_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean arrayCreation_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayCreation_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayCreation_1_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean arrayCreation_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' type ']'
  public static boolean arrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_TYPE, "<array type>");
    r = consumeToken(b, "[");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // calcArg (operators calcArg)+
  public static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC, "<calc>");
    r = calcArg(b, l + 1);
    r = r && calc_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (operators calcArg)+
  private static boolean calc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!calc_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calc_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // operators calcArg
  private static boolean calc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operators(b, l + 1);
    r = r && calcArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // operators? (value | '(' calc ')')
  public static boolean calcArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_ARG, "<calc arg>");
    r = calcArg_0(b, l + 1);
    r = r && calcArg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // operators?
  private static boolean calcArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg_0")) return false;
    operators(b, l + 1);
    return true;
  }

  // value | '(' calc ')'
  private static boolean calcArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    if (!r) r = calcArg_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' calc ')'
  private static boolean calcArg_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (objectCreation | arrayCreation | methodCall | identifier) (':' (methodCall | identifier))*
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = call_0(b, l + 1);
    r = r && call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // objectCreation | arrayCreation | methodCall | identifier
  private static boolean call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0")) return false;
    boolean r;
    r = objectCreation(b, l + 1);
    if (!r) r = arrayCreation(b, l + 1);
    if (!r) r = methodCall(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    return r;
  }

  // (':' (methodCall | identifier))*
  private static boolean call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_1", c)) break;
    }
    return true;
  }

  // ':' (methodCall | identifier)
  private static boolean call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && call_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCall | identifier
  private static boolean call_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0_1")) return false;
    boolean r;
    r = methodCall(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | classMethod | abstractMethod | field
  public static boolean classArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ARGUMENT, "<class argument>");
    r = consumeToken(b, COMMENT);
    if (!r) r = classMethod(b, l + 1);
    if (!r) r = abstractMethod(b, l + 1);
    if (!r) r = field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // docs? KEYWORD_DEF KEYWORD_INNER? (identifier | operators) generics? '(' parameterList ')' ('::' type)? (methodEqual | methodStatement | methodCode | methodSwitch)
  public static boolean classMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod")) return false;
    if (!nextTokenIs(b, "<class method>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_METHOD, "<class method>");
    r = classMethod_0(b, l + 1);
    r = r && consumeToken(b, KEYWORD_DEF);
    r = r && classMethod_2(b, l + 1);
    r = r && classMethod_3(b, l + 1);
    r = r && classMethod_4(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && classMethod_8(b, l + 1);
    r = r && classMethod_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean classMethod_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // KEYWORD_INNER?
  private static boolean classMethod_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_2")) return false;
    consumeToken(b, KEYWORD_INNER);
    return true;
  }

  // identifier | operators
  private static boolean classMethod_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_3")) return false;
    boolean r;
    r = identifier(b, l + 1);
    if (!r) r = operators(b, l + 1);
    return r;
  }

  // generics?
  private static boolean classMethod_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_4")) return false;
    generics(b, l + 1);
    return true;
  }

  // ('::' type)?
  private static boolean classMethod_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_8")) return false;
    classMethod_8_0(b, l + 1);
    return true;
  }

  // '::' type
  private static boolean classMethod_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodEqual | methodStatement | methodCode | methodSwitch
  private static boolean classMethod_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classMethod_9")) return false;
    boolean r;
    r = methodEqual(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    if (!r) r = methodSwitch(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // docs? (KEYWORD_DEF | KEYWORD_ABSTRACT) identifier generics? '[' parameterList ']' ('=>' objectCreation (COMMA objectCreation)*)? NEW_LINE (classArgument? NEW_LINE)* (init (classArgument? NEW_LINE)*)? KEYWORD_END
  public static boolean clazz(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAZZ, "<clazz>");
    r = clazz_0(b, l + 1);
    r = r && clazz_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && clazz_3(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && clazz_7(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && clazz_9(b, l + 1);
    r = r && clazz_10(b, l + 1);
    r = r && consumeToken(b, KEYWORD_END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean clazz_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // KEYWORD_DEF | KEYWORD_ABSTRACT
  private static boolean clazz_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1")) return false;
    boolean r;
    r = consumeToken(b, KEYWORD_DEF);
    if (!r) r = consumeToken(b, KEYWORD_ABSTRACT);
    return r;
  }

  // generics?
  private static boolean clazz_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_3")) return false;
    generics(b, l + 1);
    return true;
  }

  // ('=>' objectCreation (COMMA objectCreation)*)?
  private static boolean clazz_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_7")) return false;
    clazz_7_0(b, l + 1);
    return true;
  }

  // '=>' objectCreation (COMMA objectCreation)*
  private static boolean clazz_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=>");
    r = r && objectCreation(b, l + 1);
    r = r && clazz_7_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA objectCreation)*
  private static boolean clazz_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_7_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_7_0_2", c)) break;
    }
    return true;
  }

  // COMMA objectCreation
  private static boolean clazz_7_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_7_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && objectCreation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (classArgument? NEW_LINE)*
  private static boolean clazz_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_9", c)) break;
    }
    return true;
  }

  // classArgument? NEW_LINE
  private static boolean clazz_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clazz_9_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // classArgument?
  private static boolean clazz_9_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_9_0_0")) return false;
    classArgument(b, l + 1);
    return true;
  }

  // (init (classArgument? NEW_LINE)*)?
  private static boolean clazz_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_10")) return false;
    clazz_10_0(b, l + 1);
    return true;
  }

  // init (classArgument? NEW_LINE)*
  private static boolean clazz_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = init(b, l + 1);
    r = r && clazz_10_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (classArgument? NEW_LINE)*
  private static boolean clazz_10_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_10_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_10_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_10_0_1", c)) break;
    }
    return true;
  }

  // classArgument? NEW_LINE
  private static boolean clazz_10_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_10_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clazz_10_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // classArgument?
  private static boolean clazz_10_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_10_0_1_0_0")) return false;
    classArgument(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean complexType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, COMPLEX_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // DOC (NEW_LINE DOC)* NEW_LINE
  public static boolean docs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs")) return false;
    if (!nextTokenIs(b, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOC);
    r = r && docs_1(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, DOCS, r);
    return r;
  }

  // (NEW_LINE DOC)*
  private static boolean docs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!docs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docs_1", c)) break;
    }
    return true;
  }

  // NEW_LINE DOC
  private static boolean docs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEW_LINE, DOC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_ELSE (ifStatement | (methodCode | methodStatement))
  public static boolean elseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELSE);
    r = r && elseStatement_1(b, l + 1);
    exit_section_(b, m, ELSE_STATEMENT, r);
    return r;
  }

  // ifStatement | (methodCode | methodStatement)
  private static boolean elseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStatement(b, l + 1);
    if (!r) r = elseStatement_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCode | methodStatement
  private static boolean elseStatement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseStatement_1_1")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // docs? KEYWORD_DEF identifier '=' enumValue ('|' identifier)*
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, "<enum $>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM, "<enum $>");
    r = enum_0(b, l + 1);
    r = r && consumeToken(b, KEYWORD_DEF);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && enumValue(b, l + 1);
    r = r && enum_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean enum_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // ('|' identifier)*
  private static boolean enum_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_5", c)) break;
    }
    return true;
  }

  // '|' identifier
  private static boolean enum_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean enumValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumValue")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    exit_section_(b, m, ENUM_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // docs? KEYWORD_INNER? var
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && field_1(b, l + 1);
    r = r && var(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // KEYWORD_INNER?
  private static boolean field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_1")) return false;
    consumeToken(b, KEYWORD_INNER);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_FOR type? identifier KEYWORD_IN calc (methodCode | methodStatement)
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_FOR);
    r = r && forStatement_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, KEYWORD_IN);
    r = r && calc(b, l + 1);
    r = r && forStatement_5(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // type?
  private static boolean forStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_1")) return false;
    type(b, l + 1);
    return true;
  }

  // methodCode | methodStatement
  private static boolean forStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_5")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '<' type (COMMA type)* '>'
  public static boolean generics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERICS, "<generics>");
    r = consumeToken(b, "<");
    r = r && type(b, l + 1);
    r = r && generics_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA type)*
  private static boolean generics_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generics_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generics_2", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean generics_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LETTER (LETTER | DIGIT)*
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LETTER);
    r = r && identifier_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  // (LETTER | DIGIT)*
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_1", c)) break;
    }
    return true;
  }

  // LETTER | DIGIT
  private static boolean identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1_0")) return false;
    boolean r;
    r = consumeToken(b, LETTER);
    if (!r) r = consumeToken(b, DIGIT);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IF (methodCode | methodStatement) elseStatement*
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IF);
    r = r && ifStatement_1(b, l + 1);
    r = r && ifStatement_2(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // methodCode | methodStatement
  private static boolean ifStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_1")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  // elseStatement*
  private static boolean ifStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!elseStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifStatement_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_INIT (methodCode | methodStatement)
  public static boolean init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init")) return false;
    if (!nextTokenIs(b, KEYWORD_INIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_INIT);
    r = r && init_1(b, l + 1);
    exit_section_(b, m, INIT, r);
    return r;
  }

  // methodCode | methodStatement
  private static boolean init_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_1")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DIGIT+
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGIT);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, DIGIT)) break;
      if (!empty_element_parsed_guard_(b, "integer", c)) break;
    }
    exit_section_(b, m, INTEGER, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_MAIN (methodCode | methodStatement)
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

  // methodCode | methodStatement
  private static boolean main_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // docs? KEYWORD_DEF identifier generics? '(' parameterList ')' ('::' type)? (methodEqual | methodStatement | methodCode | methodSwitch)
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, "<method>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD, "<method>");
    r = method_0(b, l + 1);
    r = r && consumeToken(b, KEYWORD_DEF);
    r = r && identifier(b, l + 1);
    r = r && method_3(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_7(b, l + 1);
    r = r && method_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean method_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // generics?
  private static boolean method_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_3")) return false;
    generics(b, l + 1);
    return true;
  }

  // ('::' type)?
  private static boolean method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7")) return false;
    method_7_0(b, l + 1);
    return true;
  }

  // '::' type
  private static boolean method_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodEqual | methodStatement | methodCode | methodSwitch
  private static boolean method_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8")) return false;
    boolean r;
    r = methodEqual(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    if (!r) r = methodSwitch(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier generics? '(' (calc (COMMA calc)*)? ')'
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && methodCall_1(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && methodCall_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // generics?
  private static boolean methodCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_1")) return false;
    generics(b, l + 1);
    return true;
  }

  // (calc (COMMA calc)*)?
  private static boolean methodCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3")) return false;
    methodCall_3_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean methodCall_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && methodCall_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean methodCall_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodCall_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean methodCall_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEW_LINE (statement? NEW_LINE)* KEYWORD_END
  public static boolean methodCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode")) return false;
    if (!nextTokenIs(b, NEW_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && methodCode_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_END);
    exit_section_(b, m, METHOD_CODE, r);
    return r;
  }

  // (statement? NEW_LINE)*
  private static boolean methodCode_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodCode_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCode_1", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE
  private static boolean methodCode_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodCode_1_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean methodCode_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCode_1_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '=' calc
  public static boolean methodEqual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodEqual")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_EQUAL, "<method equal>");
    r = consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '->' statement
  public static boolean methodStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_STATEMENT, "<method statement>");
    r = consumeToken(b, "->");
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' (NEW_LINE methodSwitchArg?)+ NEW_LINE '}'
  public static boolean methodSwitch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SWITCH, "<method switch>");
    r = consumeToken(b, "{");
    r = r && methodSwitch_1(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NEW_LINE methodSwitchArg?)+
  private static boolean methodSwitch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitch_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = methodSwitch_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!methodSwitch_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodSwitch_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE methodSwitchArg?
  private static boolean methodSwitch_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitch_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && methodSwitch_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodSwitchArg?
  private static boolean methodSwitch_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitch_1_0_1")) return false;
    methodSwitchArg(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' calc (COMMA calc)* ')' (methodEqual | methodStatement | methodCode)
  public static boolean methodSwitchArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitchArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SWITCH_ARG, "<method switch arg>");
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && methodSwitchArg_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && methodSwitchArg_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA calc)*
  private static boolean methodSwitchArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitchArg_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodSwitchArg_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodSwitchArg_2", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean methodSwitchArg_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitchArg_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodEqual | methodStatement | methodCode
  private static boolean methodSwitchArg_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodSwitchArg_4")) return false;
    boolean r;
    r = methodEqual(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    if (!r) r = methodCode(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier (COMMA identifier)+ KEYWORD_FROM path
  public static boolean multiUse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiUse")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && multiUse_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_FROM);
    r = r && path(b, l + 1);
    exit_section_(b, m, MULTI_USE, r);
    return r;
  }

  // (COMMA identifier)+
  private static boolean multiUse_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiUse_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiUse_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!multiUse_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiUse_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA identifier
  private static boolean multiUse_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiUse_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // integer ('.' integer)?
  public static boolean number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && number_1(b, l + 1);
    exit_section_(b, m, NUMBER, r);
    return r;
  }

  // ('.' integer)?
  private static boolean number_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_1")) return false;
    number_1_0(b, l + 1);
    return true;
  }

  // '.' integer
  private static boolean number_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier generics? '[' (calc (COMMA calc)*)? ']'
  public static boolean objectCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && objectCreation_1(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && objectCreation_3(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, OBJECT_CREATION, r);
    return r;
  }

  // generics?
  private static boolean objectCreation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_1")) return false;
    generics(b, l + 1);
    return true;
  }

  // (calc (COMMA calc)*)?
  private static boolean objectCreation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_3")) return false;
    objectCreation_3_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean objectCreation_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && objectCreation_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean objectCreation_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectCreation_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectCreation_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean objectCreation_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPERATOR+
  public static boolean operators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operators")) return false;
    if (!nextTokenIs(b, OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, OPERATOR)) break;
      if (!empty_element_parsed_guard_(b, "operators", c)) break;
    }
    exit_section_(b, m, OPERATORS, r);
    return r;
  }

  /* ********************************************************** */
  // varWithoutValue | var
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = varWithoutValue(b, l + 1);
    if (!r) r = var(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (parameter (COMMA parameter)*)?
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    parameterList_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // parameter (COMMA parameter)*
  private static boolean parameterList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameterList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean parameterList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_0_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameterList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ('/' identifier)+
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && path_1(b, l + 1);
    exit_section_(b, m, PATH, r);
    return r;
  }

  // ('/' identifier)+
  private static boolean path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' identifier
  private static boolean path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_INT | KEYWORD_DOUBLE | KEYWORD_FLOAT | KEYWORD_LONG | KEYWORD_SHORT | KEYWORD_BOOLEAN | CHAR | KEYWORD_BYTE
  public static boolean primitiveType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitiveType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, KEYWORD_INT);
    if (!r) r = consumeToken(b, KEYWORD_DOUBLE);
    if (!r) r = consumeToken(b, KEYWORD_FLOAT);
    if (!r) r = consumeToken(b, KEYWORD_LONG);
    if (!r) r = consumeToken(b, KEYWORD_SHORT);
    if (!r) r = consumeToken(b, KEYWORD_BOOLEAN);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, KEYWORD_BYTE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // docs? KEYWORD_DEF identifier generics? '=' '[' parameterList ']'
  public static boolean record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record")) return false;
    if (!nextTokenIs(b, "<record>", DOC, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD, "<record>");
    r = record_0(b, l + 1);
    r = r && consumeToken(b, KEYWORD_DEF);
    r = r && identifier(b, l + 1);
    r = r && record_3(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, "[");
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // docs?
  private static boolean record_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_0")) return false;
    docs(b, l + 1);
    return true;
  }

  // generics?
  private static boolean record_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_3")) return false;
    generics(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_RETURN calc
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && calc(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // identifier KEYWORD_FROM path (KEYWORD_AS identifier)?
  public static boolean singleUse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleUse")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, KEYWORD_FROM);
    r = r && path(b, l + 1);
    r = r && singleUse_3(b, l + 1);
    exit_section_(b, m, SINGLE_USE, r);
    return r;
  }

  // (KEYWORD_AS identifier)?
  private static boolean singleUse_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleUse_3")) return false;
    singleUse_3_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS identifier
  private static boolean singleUse_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleUse_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_AS);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | ifStatement | whileStatement | forStatement | var | returnStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, COMMENT);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = var(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_VAR | primitiveType | complexType | arrayType
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, KEYWORD_VAR);
    if (!r) r = primitiveType(b, l + 1);
    if (!r) r = complexType(b, l + 1);
    if (!r) r = arrayType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_USE (useFromPath | singleUse | multiUse)
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

  // useFromPath | singleUse | multiUse
  private static boolean use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1")) return false;
    boolean r;
    r = useFromPath(b, l + 1);
    if (!r) r = singleUse(b, l + 1);
    if (!r) r = multiUse(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // path (KEYWORD_AS identifier)?
  public static boolean useFromPath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useFromPath")) return false;
    if (!nextTokenIs(b, LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path(b, l + 1);
    r = r && useFromPath_1(b, l + 1);
    exit_section_(b, m, USE_FROM_PATH, r);
    return r;
  }

  // (KEYWORD_AS identifier)?
  private static boolean useFromPath_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useFromPath_1")) return false;
    useFromPath_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS identifier
  private static boolean useFromPath_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useFromPath_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_AS);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | integer | STRING | CHAR | call
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = number(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_CONST? type? identifier '=' calc
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = var_0(b, l + 1);
    r = r && var_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_CONST?
  private static boolean var_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_0")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  // type?
  private static boolean var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_CONST? type identifier
  public static boolean varWithoutValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varWithoutValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_WITHOUT_VALUE, "<var without value>");
    r = varWithoutValue_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_CONST?
  private static boolean varWithoutValue_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varWithoutValue_0")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  /* ********************************************************** */
  // KEYWORD_WHILE calc (methodCode | methodStatement)
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, KEYWORD_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_WHILE);
    r = r && calc(b, l + 1);
    r = r && whileStatement_2(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // methodCode | methodStatement
  private static boolean whileStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_2")) return false;
    boolean r;
    r = methodCode(b, l + 1);
    if (!r) r = methodStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // argument? (NEW_LINE argument?)* (main (NEW_LINE argument?)*)?
  static boolean xjlnFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0(b, l + 1);
    r = r && xjlnFile_1(b, l + 1);
    r = r && xjlnFile_2(b, l + 1);
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

  // (main (NEW_LINE argument?)*)?
  private static boolean xjlnFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_2")) return false;
    xjlnFile_2_0(b, l + 1);
    return true;
  }

  // main (NEW_LINE argument?)*
  private static boolean xjlnFile_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = main(b, l + 1);
    r = r && xjlnFile_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE argument?)*
  private static boolean xjlnFile_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xjlnFile_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_2_0_1", c)) break;
    }
    return true;
  }

  // NEW_LINE argument?
  private static boolean xjlnFile_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && xjlnFile_2_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument?
  private static boolean xjlnFile_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_2_0_1_0_1")) return false;
    argument(b, l + 1);
    return true;
  }

}
