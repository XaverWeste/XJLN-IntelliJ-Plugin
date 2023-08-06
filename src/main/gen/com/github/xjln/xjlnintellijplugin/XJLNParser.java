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
public class XJLNParser implements PsiParser, LightPsiParser {

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
  // useArg | mainArg | enum | clas | method | field
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = useArg(b, l + 1);
    if (!r) r = mainArg(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = clas(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = field(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' IDENTIFIER COMMA INT (COMMA INT)* ']'
  public static boolean arrayCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CREATION, "<array creation>");
    r = consumeToken(b, "[");
    r = r && consumeTokens(b, 0, IDENTIFIER, COMMA, INT);
    r = r && arrayCreation_4(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA INT)*
  private static boolean arrayCreation_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayCreation_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayCreation_4", c)) break;
    }
    return true;
  }

  // COMMA INT
  private static boolean arrayCreation_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // calcArg (OPPERATOR calcArg)*
  public static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC, "<calc>");
    r = calcArg(b, l + 1);
    r = r && calc_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OPPERATOR calcArg)*
  private static boolean calc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!calc_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calc_1", c)) break;
    }
    return true;
  }

  // OPPERATOR calcArg
  private static boolean calc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPPERATOR);
    r = r && calcArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT | DOUBLE | STRING | CHAR | call
  public static boolean calcArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_ARG, "<calc arg>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (methodCall | objectCreation | arrayCreation | IDENTIFIER) (':' (methodCall | IDENTIFIER))*
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = call_0(b, l + 1);
    r = r && call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // methodCall | objectCreation | arrayCreation | IDENTIFIER
  private static boolean call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0")) return false;
    boolean r;
    r = methodCall(b, l + 1);
    if (!r) r = objectCreation(b, l + 1);
    if (!r) r = arrayCreation(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  // (':' (methodCall | IDENTIFIER))*
  private static boolean call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_1", c)) break;
    }
    return true;
  }

  // ':' (methodCall | IDENTIFIER)
  private static boolean call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && call_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // methodCall | IDENTIFIER
  private static boolean call_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0_1")) return false;
    boolean r;
    r = methodCall(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // docs DEF IDENTIFIER '[' (('/') | (parameterList?))']' ('->' methodCall)? ('=>' objectCreation (COMMA objectCreation)*)? NEW_LINE (statement? NEW_LINE)* END
  public static boolean clas(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas")) return false;
    if (!nextTokenIs(b, "<clas>", DEF, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLAS, "<clas>");
    r = docs(b, l + 1);
    r = r && consumeTokens(b, 0, DEF, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && clas_4(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && clas_6(b, l + 1);
    r = r && clas_7(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && clas_9(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('/') | (parameterList?)
  private static boolean clas_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clas_4_0(b, l + 1);
    if (!r) r = clas_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/')
  private static boolean clas_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    exit_section_(b, m, null, r);
    return r;
  }

  // parameterList?
  private static boolean clas_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_4_1")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // ('->' methodCall)?
  private static boolean clas_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_6")) return false;
    clas_6_0(b, l + 1);
    return true;
  }

  // '->' methodCall
  private static boolean clas_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && methodCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=>' objectCreation (COMMA objectCreation)*)?
  private static boolean clas_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_7")) return false;
    clas_7_0(b, l + 1);
    return true;
  }

  // '=>' objectCreation (COMMA objectCreation)*
  private static boolean clas_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=>");
    r = r && objectCreation(b, l + 1);
    r = r && clas_7_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA objectCreation)*
  private static boolean clas_7_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_7_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clas_7_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clas_7_0_2", c)) break;
    }
    return true;
  }

  // COMMA objectCreation
  private static boolean clas_7_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_7_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && objectCreation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement? NEW_LINE)*
  private static boolean clas_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clas_9_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clas_9", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE
  private static boolean clas_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clas_9_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean clas_9_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clas_9_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (DOC (NEW_LINE DOC)* NEW_LINE)?
  public static boolean docs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs")) return false;
    Marker m = enter_section_(b, l, _NONE_, DOCS, "<docs>");
    docs_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // DOC (NEW_LINE DOC)* NEW_LINE
  private static boolean docs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOC);
    r = r && docs_0_1(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE DOC)*
  private static boolean docs_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!docs_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docs_0_1", c)) break;
    }
    return true;
  }

  // NEW_LINE DOC
  private static boolean docs_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docs_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEW_LINE, DOC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs DEF IDENTIFIER '=' IDENTIFIER ('|' IDENTIFIER)*
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, "<enum $>", DEF, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM, "<enum $>");
    r = docs(b, l + 1);
    r = r && consumeTokens(b, 0, DEF, IDENTIFIER);
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
  // INNER? CONNST? ((type IDENTIFIER ('=' calc)?) | (IDENTIFIER '=' calc))
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && field_1(b, l + 1);
    r = r && field_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INNER?
  private static boolean field_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_0")) return false;
    consumeToken(b, INNER);
    return true;
  }

  // CONNST?
  private static boolean field_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_1")) return false;
    consumeToken(b, CONNST);
    return true;
  }

  // (type IDENTIFIER ('=' calc)?) | (IDENTIFIER '=' calc)
  private static boolean field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_2_0(b, l + 1);
    if (!r) r = field_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type IDENTIFIER ('=' calc)?
  private static boolean field_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && field_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' calc)?
  private static boolean field_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2_0_2")) return false;
    field_2_0_2_0(b, l + 1);
    return true;
  }

  // '=' calc
  private static boolean field_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER '=' calc
  private static boolean field_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MAIN (('->' calc) | (NEW_LINE (statement NEW_LINE)* END))
  public static boolean mainArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg")) return false;
    if (!nextTokenIs(b, MAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAIN);
    r = r && mainArg_1(b, l + 1);
    exit_section_(b, m, MAIN_ARG, r);
    return r;
  }

  // ('->' calc) | (NEW_LINE (statement NEW_LINE)* END)
  private static boolean mainArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mainArg_1_0(b, l + 1);
    if (!r) r = mainArg_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '->' calc
  private static boolean mainArg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE (statement NEW_LINE)* END
  private static boolean mainArg_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && mainArg_1_1_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement NEW_LINE)*
  private static boolean mainArg_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mainArg_1_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mainArg_1_1_1", c)) break;
    }
    return true;
  }

  // statement NEW_LINE
  private static boolean mainArg_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mainArg_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docs DEF INNER? IDENTIFIER '(' parameterList? ')' ('::' IDENTIFIER)? ((('=' | '->') calc) | (NEW_LINE (statement? NEW_LINE)* END))
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, "<method>", DEF, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD, "<method>");
    r = docs(b, l + 1);
    r = r && consumeToken(b, DEF);
    r = r && method_2(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && method_5(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_7(b, l + 1);
    r = r && method_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INNER?
  private static boolean method_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_2")) return false;
    consumeToken(b, INNER);
    return true;
  }

  // parameterList?
  private static boolean method_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_5")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // ('::' IDENTIFIER)?
  private static boolean method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7")) return false;
    method_7_0(b, l + 1);
    return true;
  }

  // '::' IDENTIFIER
  private static boolean method_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('=' | '->') calc) | (NEW_LINE (statement? NEW_LINE)* END)
  private static boolean method_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_8_0(b, l + 1);
    if (!r) r = method_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' | '->') calc
  private static boolean method_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_8_0_0(b, l + 1);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '->'
  private static boolean method_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_0_0")) return false;
    boolean r;
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "->");
    return r;
  }

  // NEW_LINE (statement? NEW_LINE)* END
  private static boolean method_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && method_8_1_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement? NEW_LINE)*
  private static boolean method_8_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_8_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_8_1_1", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE
  private static boolean method_8_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_8_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean method_8_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_1_1_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' (calc (COMMA calc)*)? ')'
  public static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && methodCall_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean methodCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_2")) return false;
    methodCall_2_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean methodCall_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && methodCall_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean methodCall_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!methodCall_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "methodCall_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean methodCall_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '[' (calc (COMMA calc)*)? ']'
  public static boolean objectCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && objectCreation_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, OBJECT_CREATION, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean objectCreation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_2")) return false;
    objectCreation_2_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean objectCreation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && objectCreation_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean objectCreation_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!objectCreation_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "objectCreation_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean objectCreation_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field (COMMA field)*
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = field(b, l + 1);
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA field)*
  private static boolean parameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_1", c)) break;
    }
    return true;
  }

  // COMMA field
  private static boolean parameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && field(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | field | method
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, COMMENT);
    if (!r) r = field(b, l + 1);
    if (!r) r = method(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PRIMITIVETYPE | IDENTIFIER | ('[' IDENTIFIER ']') | VAR | ('{' IDENTIFIER (COMMA IDENTIFIER)*'}')
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, PRIMITIVETYPE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = type_2(b, l + 1);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = type_4(b, l + 1);
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

  // '{' IDENTIFIER (COMMA IDENTIFIER)*'}'
  private static boolean type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_4_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean type_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_4_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_4_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_4_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean type_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE (('{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*) | (IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?))
  public static boolean useArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && useArg_1(b, l + 1);
    exit_section_(b, m, USE_ARG, r);
    return r;
  }

  // ('{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*) | (IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?)
  private static boolean useArg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useArg_1_0(b, l + 1);
    if (!r) r = useArg_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*
  private static boolean useArg_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && useArg_1_0_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeTokens(b, 0, FROM, IDENTIFIER);
    r = r && useArg_1_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean useArg_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!useArg_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "useArg_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean useArg_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)*
  private static boolean useArg_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!useArg_1_0_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "useArg_1_0_6", c)) break;
    }
    return true;
  }

  // '/' IDENTIFIER
  private static boolean useArg_1_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?
  private static boolean useArg_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && useArg_1_1_1(b, l + 1);
    r = r && useArg_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)
  private static boolean useArg_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useArg_1_1_1_0(b, l + 1);
    if (!r) r = useArg_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)+
  private static boolean useArg_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = useArg_1_1_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!useArg_1_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "useArg_1_1_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' IDENTIFIER
  private static boolean useArg_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // FROM IDENTIFIER ("/" IDENTIFIER)*
  private static boolean useArg_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, IDENTIFIER);
    r = r && useArg_1_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("/" IDENTIFIER)*
  private static boolean useArg_1_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!useArg_1_1_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "useArg_1_1_1_1_2", c)) break;
    }
    return true;
  }

  // "/" IDENTIFIER
  private static boolean useArg_1_1_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS IDENTIFIER)?
  private static boolean useArg_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_2")) return false;
    useArg_1_1_2_0(b, l + 1);
    return true;
  }

  // AS IDENTIFIER
  private static boolean useArg_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "useArg_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMMENT | argument)? (NEW_LINE (COMMENT | argument)?)*
  static boolean xjlnFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0(b, l + 1);
    r = r && xjlnFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT | argument)?
  private static boolean xjlnFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0")) return false;
    xjlnFile_0_0(b, l + 1);
    return true;
  }

  // COMMENT | argument
  private static boolean xjlnFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = argument(b, l + 1);
    return r;
  }

  // (NEW_LINE (COMMENT | argument)?)*
  private static boolean xjlnFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!xjlnFile_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_1", c)) break;
    }
    return true;
  }

  // NEW_LINE (COMMENT | argument)?
  private static boolean xjlnFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && xjlnFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT | argument)?
  private static boolean xjlnFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1_0_1")) return false;
    xjlnFile_1_0_1_0(b, l + 1);
    return true;
  }

  // COMMENT | argument
  private static boolean xjlnFile_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = argument(b, l + 1);
    return r;
  }

}
