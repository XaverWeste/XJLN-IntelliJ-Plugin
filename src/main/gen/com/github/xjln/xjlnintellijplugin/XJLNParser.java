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
  // COMMENT | NEW_LINE | use | main | enum | class | method | field
  static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, NEW_LINE);
    if (!r) r = use(b, l + 1);
    if (!r) r = main(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = class_$(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = field(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '[' IDENTIFIER COMMA INT (COMMA INT)* ']'
  static boolean arrayCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayCreation")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeTokens(b, 0, IDENTIFIER, COMMA, INT);
    r = r && arrayCreation_4(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
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
  static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calcArg(b, l + 1);
    r = r && calc_1(b, l + 1);
    exit_section_(b, m, null, r);
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
  static boolean calcArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg")) return false;
    boolean r;
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = call(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (methodCall | objectCreation | arrayCreation | IDENTIFIER) (':' (methodCall | IDENTIFIER))*
  static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = call_0(b, l + 1);
    r = r && call_1(b, l + 1);
    exit_section_(b, m, null, r);
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
  // DEF IDENTIFIER '[' (('/') | (parameterList?))']' ('->' methodCall)? ('=>' objectCreation (COMMA objectCreation)*)? NEW_LINE (statement? NEW_LINE)* END
  static boolean class_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_$")) return false;
    if (!nextTokenIs(b, DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && class_3(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && class_5(b, l + 1);
    r = r && class_6(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    r = r && class_8(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/') | (parameterList?)
  private static boolean class_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_3_0(b, l + 1);
    if (!r) r = class_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/')
  private static boolean class_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    exit_section_(b, m, null, r);
    return r;
  }

  // parameterList?
  private static boolean class_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_3_1")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // ('->' methodCall)?
  private static boolean class_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_5")) return false;
    class_5_0(b, l + 1);
    return true;
  }

  // '->' methodCall
  private static boolean class_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && methodCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=>' objectCreation (COMMA objectCreation)*)?
  private static boolean class_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_6")) return false;
    class_6_0(b, l + 1);
    return true;
  }

  // '=>' objectCreation (COMMA objectCreation)*
  private static boolean class_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=>");
    r = r && objectCreation(b, l + 1);
    r = r && class_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA objectCreation)*
  private static boolean class_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_6_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_6_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_6_0_2", c)) break;
    }
    return true;
  }

  // COMMA objectCreation
  private static boolean class_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && objectCreation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement? NEW_LINE)*
  private static boolean class_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!class_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_8", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE
  private static boolean class_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_8_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean class_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_8_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DEF IDENTIFIER '=' IDENTIFIER ('|' IDENTIFIER)*
  static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enum_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('|' IDENTIFIER)*
  private static boolean enum_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_4", c)) break;
    }
    return true;
  }

  // '|' IDENTIFIER
  private static boolean enum_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INNER? CONNST? ((type IDENTIFIER ('=' calc)?) | (IDENTIFIER '=' calc))
  static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_0(b, l + 1);
    r = r && field_1(b, l + 1);
    r = r && field_2(b, l + 1);
    exit_section_(b, m, null, r);
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
  static boolean main(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main")) return false;
    if (!nextTokenIs(b, MAIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAIN);
    r = r && main_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('->' calc) | (NEW_LINE (statement NEW_LINE)* END)
  private static boolean main_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = main_1_0(b, l + 1);
    if (!r) r = main_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '->' calc
  private static boolean main_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "->");
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE (statement NEW_LINE)* END
  private static boolean main_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && main_1_1_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement NEW_LINE)*
  private static boolean main_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!main_1_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "main_1_1_1", c)) break;
    }
    return true;
  }

  // statement NEW_LINE
  private static boolean main_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "main_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEF INNER? IDENTIFIER '(' parameterList? ')' ('::' IDENTIFIER)? ((('=' | '->') calc) | (NEW_LINE (statement? NEW_LINE)* END))
  static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEF);
    r = r && method_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && method_4(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_6(b, l + 1);
    r = r && method_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INNER?
  private static boolean method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1")) return false;
    consumeToken(b, INNER);
    return true;
  }

  // parameterList?
  private static boolean method_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_4")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // ('::' IDENTIFIER)?
  private static boolean method_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_6")) return false;
    method_6_0(b, l + 1);
    return true;
  }

  // '::' IDENTIFIER
  private static boolean method_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('=' | '->') calc) | (NEW_LINE (statement? NEW_LINE)* END)
  private static boolean method_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_7_0(b, l + 1);
    if (!r) r = method_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('=' | '->') calc
  private static boolean method_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_7_0_0(b, l + 1);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '->'
  private static boolean method_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_0_0")) return false;
    boolean r;
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "->");
    return r;
  }

  // NEW_LINE (statement? NEW_LINE)* END
  private static boolean method_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && method_7_1_1(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement? NEW_LINE)*
  private static boolean method_7_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_7_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_7_1_1", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE
  private static boolean method_7_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_7_1_1_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean method_7_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_7_1_1_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER '(' (calc (COMMA calc)*)? ')'
  static boolean methodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "methodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && methodCall_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
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
  static boolean objectCreation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objectCreation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "[");
    r = r && objectCreation_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
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
  static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field(b, l + 1);
    r = r && parameterList_1(b, l + 1);
    exit_section_(b, m, null, r);
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
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = field(b, l + 1);
    if (!r) r = method(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | ('[' IDENTIFIER ']') | VAR | ('{' IDENTIFIER (COMMA IDENTIFIER)*'}')
  static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = type_1(b, l + 1);
    if (!r) r = consumeToken(b, VAR);
    if (!r) r = type_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' IDENTIFIER ']'
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' IDENTIFIER (COMMA IDENTIFIER)*'}'
  private static boolean type_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_3_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean type_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_3_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean type_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE (('{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*) | (IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?))
  static boolean use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && use_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*) | (IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?)
  private static boolean use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_1_0(b, l + 1);
    if (!r) r = use_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' IDENTIFIER (COMMA IDENTIFIER)* '}' FROM IDENTIFIER ('/' IDENTIFIER)*
  private static boolean use_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && use_1_0_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeTokens(b, 0, FROM, IDENTIFIER);
    r = r && use_1_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean use_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean use_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)*
  private static boolean use_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_0_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_1_0_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_1_0_6", c)) break;
    }
    return true;
  }

  // '/' IDENTIFIER
  private static boolean use_1_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER (('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)) (AS IDENTIFIER)?
  private static boolean use_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && use_1_1_1(b, l + 1);
    r = r && use_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)+ | (FROM IDENTIFIER ("/" IDENTIFIER)*)
  private static boolean use_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_1_1_1_0(b, l + 1);
    if (!r) r = use_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('/' IDENTIFIER)+
  private static boolean use_1_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_1_1_1_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!use_1_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_1_1_1_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' IDENTIFIER
  private static boolean use_1_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // FROM IDENTIFIER ("/" IDENTIFIER)*
  private static boolean use_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FROM, IDENTIFIER);
    r = r && use_1_1_1_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("/" IDENTIFIER)*
  private static boolean use_1_1_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!use_1_1_1_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "use_1_1_1_1_2", c)) break;
    }
    return true;
  }

  // "/" IDENTIFIER
  private static boolean use_1_1_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS IDENTIFIER)?
  private static boolean use_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_2")) return false;
    use_1_1_2_0(b, l + 1);
    return true;
  }

  // AS IDENTIFIER
  private static boolean use_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((NEW_LINE* argument?)+)?
  static boolean xjlnFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile")) return false;
    xjlnFile_0(b, l + 1);
    return true;
  }

  // (NEW_LINE* argument?)+
  private static boolean xjlnFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!xjlnFile_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE* argument?
  private static boolean xjlnFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xjlnFile_0_0_0(b, l + 1);
    r = r && xjlnFile_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE*
  private static boolean xjlnFile_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(b, "xjlnFile_0_0_0", c)) break;
    }
    return true;
  }

  // argument?
  private static boolean xjlnFile_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xjlnFile_0_0_1")) return false;
    argument(b, l + 1);
    return true;
  }

}
