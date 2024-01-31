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
  // KEYWORD_DEF access_modifier? KEYWORD_ABSTRACT IDENTIFIER generics? "(" parameterlist? ")" ("::" datatype)?
  public static boolean abstract_method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && abstract_method_1(b, l + 1);
    r = r && consumeTokens(b, 0, KEYWORD_ABSTRACT, IDENTIFIER);
    r = r && abstract_method_4(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && abstract_method_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && abstract_method_8(b, l + 1);
    exit_section_(b, m, ABSTRACT_METHOD, r);
    return r;
  }

  // access_modifier?
  private static boolean abstract_method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_1")) return false;
    access_modifier(b, l + 1);
    return true;
  }

  // generics?
  private static boolean abstract_method_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_4")) return false;
    generics(b, l + 1);
    return true;
  }

  // parameterlist?
  private static boolean abstract_method_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_6")) return false;
    parameterlist(b, l + 1);
    return true;
  }

  // ("::" datatype)?
  private static boolean abstract_method_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_8")) return false;
    abstract_method_8_0(b, l + 1);
    return true;
  }

  // "::" datatype
  private static boolean abstract_method_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_method_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && datatype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // IDENTIFIER
  public static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ALIAS, r);
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
  // ("{" (value (COMMA value)*)? "}") | ("[" datatype (COMMA (NUMBER | calc))* "]")
  public static boolean arr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARR, "<arr>");
    r = arr_0(b, l + 1);
    if (!r) r = arr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "{" (value (COMMA value)*)? "}"
  private static boolean arr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && arr_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (value (COMMA value)*)?
  private static boolean arr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_0_1")) return false;
    arr_0_1_0(b, l + 1);
    return true;
  }

  // value (COMMA value)*
  private static boolean arr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && arr_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean arr_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arr_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arr_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA value
  private static boolean arr_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" datatype (COMMA (NUMBER | calc))* "]"
  private static boolean arr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && datatype(b, l + 1);
    r = r && arr_1_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA (NUMBER | calc))*
  private static boolean arr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arr_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arr_1_2", c)) break;
    }
    return true;
  }

  // COMMA (NUMBER | calc)
  private static boolean arr_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && arr_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | calc
  private static boolean arr_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arr_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, NUMBER);
    if (!r) r = calc(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // "[" datatype "]"
  public static boolean arrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_TYPE, "<array type>");
    r = consumeToken(b, "[");
    r = r && datatype(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // calcArg (OPERATOR calcArg)*
  public static boolean calc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC, "<calc>");
    r = calcArg(b, l + 1);
    r = r && calc_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OPERATOR calcArg)*
  private static boolean calc_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!calc_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calc_1", c)) break;
    }
    return true;
  }

  // OPERATOR calcArg
  private static boolean calc_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR);
    r = r && calcArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("(" calc ")") | value | call | arr
  public static boolean calcArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_ARG, "<calc arg>");
    r = calcArg_0(b, l + 1);
    if (!r) r = value(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = arr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" calc ")"
  private static boolean calcArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calcArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KEYWORD_THIS | (IDENTIFIER ("<" class_name (COMMA class_name)* ">")? (("[" (calc (COMMA calc)*)? "]") | ("(" (calc (COMMA calc)*)? ")"))?)) (":" callArg)*
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    if (!nextTokenIs(b, "<call>", IDENTIFIER, KEYWORD_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = call_0(b, l + 1);
    r = r && call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_THIS | (IDENTIFIER ("<" class_name (COMMA class_name)* ">")? (("[" (calc (COMMA calc)*)? "]") | ("(" (calc (COMMA calc)*)? ")"))?)
  private static boolean call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_THIS);
    if (!r) r = call_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER ("<" class_name (COMMA class_name)* ">")? (("[" (calc (COMMA calc)*)? "]") | ("(" (calc (COMMA calc)*)? ")"))?
  private static boolean call_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && call_0_1_1(b, l + 1);
    r = r && call_0_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("<" class_name (COMMA class_name)* ">")?
  private static boolean call_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_1")) return false;
    call_0_1_1_0(b, l + 1);
    return true;
  }

  // "<" class_name (COMMA class_name)* ">"
  private static boolean call_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && class_name(b, l + 1);
    r = r && call_0_1_1_0_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA class_name)*
  private static boolean call_0_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_0_1_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_0_1_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean call_0_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (("[" (calc (COMMA calc)*)? "]") | ("(" (calc (COMMA calc)*)? ")"))?
  private static boolean call_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2")) return false;
    call_0_1_2_0(b, l + 1);
    return true;
  }

  // ("[" (calc (COMMA calc)*)? "]") | ("(" (calc (COMMA calc)*)? ")")
  private static boolean call_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = call_0_1_2_0_0(b, l + 1);
    if (!r) r = call_0_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "[" (calc (COMMA calc)*)? "]"
  private static boolean call_0_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && call_0_1_2_0_0_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean call_0_1_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_0_1")) return false;
    call_0_1_2_0_0_1_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean call_0_1_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && call_0_1_2_0_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean call_0_1_2_0_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_0_1_2_0_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_0_1_2_0_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean call_0_1_2_0_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" (calc (COMMA calc)*)? ")"
  private static boolean call_0_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && call_0_1_2_0_1_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean call_0_1_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_1_1")) return false;
    call_0_1_2_0_1_1_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean call_0_1_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && call_0_1_2_0_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean call_0_1_2_0_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_0_1_2_0_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_0_1_2_0_1_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean call_0_1_2_0_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_0_1_2_0_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (":" callArg)*
  private static boolean call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_1", c)) break;
    }
    return true;
  }

  // ":" callArg
  private static boolean call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && callArg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER ("(" (calc (COMMA calc)*)? ")")?) | NUMBER | ("(" calc ")")
  public static boolean callArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_ARG, "<call arg>");
    r = callArg_0(b, l + 1);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = callArg_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER ("(" (calc (COMMA calc)*)? ")")?
  private static boolean callArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && callArg_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("(" (calc (COMMA calc)*)? ")")?
  private static boolean callArg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1")) return false;
    callArg_0_1_0(b, l + 1);
    return true;
  }

  // "(" (calc (COMMA calc)*)? ")"
  private static boolean callArg_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && callArg_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (calc (COMMA calc)*)?
  private static boolean callArg_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1_0_1")) return false;
    callArg_0_1_0_1_0(b, l + 1);
    return true;
  }

  // calc (COMMA calc)*
  private static boolean callArg_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc(b, l + 1);
    r = r && callArg_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA calc)*
  private static boolean callArg_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!callArg_0_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "callArg_0_1_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA calc
  private static boolean callArg_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_0_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "(" calc ")"
  private static boolean callArg_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callArg_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && calc(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_CLASS (KEYWORD_ABSTRACT | KEYWORD_FINAL)* clazz_name generics? extends? contains? implements? "{" NEW_LINE ((field | abstract_method | method | init | COMMENT)? NEW_LINE)* "}"
  public static boolean clazz(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && clazz_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_CLASS);
    r = r && clazz_3(b, l + 1);
    r = r && clazz_name(b, l + 1);
    r = r && clazz_5(b, l + 1);
    r = r && clazz_6(b, l + 1);
    r = r && clazz_7(b, l + 1);
    r = r && clazz_8(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, NEW_LINE);
    r = r && clazz_11(b, l + 1);
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

  // generics?
  private static boolean clazz_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_5")) return false;
    generics(b, l + 1);
    return true;
  }

  // extends?
  private static boolean clazz_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_6")) return false;
    extends_$(b, l + 1);
    return true;
  }

  // contains?
  private static boolean clazz_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_7")) return false;
    contains(b, l + 1);
    return true;
  }

  // implements?
  private static boolean clazz_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_8")) return false;
    implements_$(b, l + 1);
    return true;
  }

  // ((field | abstract_method | method | init | COMMENT)? NEW_LINE)*
  private static boolean clazz_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_11")) return false;
    while (true) {
      int c = current_position_(b);
      if (!clazz_11_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_11", c)) break;
    }
    return true;
  }

  // (field | abstract_method | method | init | COMMENT)? NEW_LINE
  private static boolean clazz_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clazz_11_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (field | abstract_method | method | init | COMMENT)?
  private static boolean clazz_11_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_11_0_0")) return false;
    clazz_11_0_0_0(b, l + 1);
    return true;
  }

  // field | abstract_method | method | init | COMMENT
  private static boolean clazz_11_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_11_0_0_0")) return false;
    boolean r;
    r = field(b, l + 1);
    if (!r) r = abstract_method(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = init(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean clazz_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLAZZ_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_CONTAINS class_name | ("{" (class_name (COMMA class_name)*)? "}")
  public static boolean contains(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTAINS, "<contains>");
    r = contains_0(b, l + 1);
    if (!r) r = contains_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_CONTAINS class_name
  private static boolean contains_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_CONTAINS);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" (class_name (COMMA class_name)*)? "}"
  private static boolean contains_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && contains_1_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (class_name (COMMA class_name)*)?
  private static boolean contains_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_1_1")) return false;
    contains_1_1_0(b, l + 1);
    return true;
  }

  // class_name (COMMA class_name)*
  private static boolean contains_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && contains_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA class_name)*
  private static boolean contains_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!contains_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "contains_1_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean contains_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contains_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // data_type_def KEYWORD_CONST? KEYWORD_DATA clazz_name generics? "=" "[" parameterlist? "]"
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_type_def(b, l + 1);
    r = r && data_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_DATA);
    r = r && clazz_name(b, l + 1);
    r = r && data_4(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && consumeToken(b, "[");
    r = r && data_7(b, l + 1);
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

  // generics?
  private static boolean data_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_4")) return false;
    generics(b, l + 1);
    return true;
  }

  // parameterlist?
  private static boolean data_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_7")) return false;
    parameterlist(b, l + 1);
    return true;
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
  // (IDENTIFIER ("<" class_name (COMMA class_name)* ">")?) | KEYWORD_INT | KEYWORD_SHORT | KEYWORD_LONG | KEYWORD_FLOAT | KEYWORD_DOUBLE | KEYWORD_BOOLEAN | KEYWORD_CHAR | KEYWORD_BYTE | arrayType
  public static boolean datatype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATATYPE, "<datatype>");
    r = datatype_0(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_INT);
    if (!r) r = consumeToken(b, KEYWORD_SHORT);
    if (!r) r = consumeToken(b, KEYWORD_LONG);
    if (!r) r = consumeToken(b, KEYWORD_FLOAT);
    if (!r) r = consumeToken(b, KEYWORD_DOUBLE);
    if (!r) r = consumeToken(b, KEYWORD_BOOLEAN);
    if (!r) r = consumeToken(b, KEYWORD_CHAR);
    if (!r) r = consumeToken(b, KEYWORD_BYTE);
    if (!r) r = arrayType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER ("<" class_name (COMMA class_name)* ">")?
  private static boolean datatype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && datatype_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("<" class_name (COMMA class_name)* ">")?
  private static boolean datatype_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype_0_1")) return false;
    datatype_0_1_0(b, l + 1);
    return true;
  }

  // "<" class_name (COMMA class_name)* ">"
  private static boolean datatype_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && class_name(b, l + 1);
    r = r && datatype_0_1_0_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA class_name)*
  private static boolean datatype_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!datatype_0_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "datatype_0_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean datatype_0_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datatype_0_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_ELSE (KEYWORD_IF calc)? ((LAMBDA statement (NEW_LINE else)?) | (statement_block (else | KEYWORD_END)))
  public static boolean else_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_$")) return false;
    if (!nextTokenIs(b, KEYWORD_ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_ELSE);
    r = r && else_1(b, l + 1);
    r = r && else_2(b, l + 1);
    exit_section_(b, m, ELSE, r);
    return r;
  }

  // (KEYWORD_IF calc)?
  private static boolean else_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_1")) return false;
    else_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_IF calc
  private static boolean else_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IF);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LAMBDA statement (NEW_LINE else)?) | (statement_block (else | KEYWORD_END))
  private static boolean else_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = else_2_0(b, l + 1);
    if (!r) r = else_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LAMBDA statement (NEW_LINE else)?
  private static boolean else_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAMBDA);
    r = r && statement(b, l + 1);
    r = r && else_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE else)?
  private static boolean else_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2_0_2")) return false;
    else_2_0_2_0(b, l + 1);
    return true;
  }

  // NEW_LINE else
  private static boolean else_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && else_$(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement_block (else | KEYWORD_END)
  private static boolean else_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_block(b, l + 1);
    r = r && else_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // else | KEYWORD_END
  private static boolean else_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_2_1_1")) return false;
    boolean r;
    r = else_$(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_END);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_EXTENDS class_name
  public static boolean extends_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extends_$")) return false;
    if (!nextTokenIs(b, KEYWORD_EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_EXTENDS);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, EXTENDS, r);
    return r;
  }

  /* ********************************************************** */
  // access_modifier? KEYWORD_STATIC? KEYWORD_CONST? datatype ("<" class_name (COMMA class_name)* ">")? IDENTIFIER ("=" value)?
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD, "<field>");
    r = field_0(b, l + 1);
    r = r && field_1(b, l + 1);
    r = r && field_2(b, l + 1);
    r = r && datatype(b, l + 1);
    r = r && field_4(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && field_6(b, l + 1);
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

  // KEYWORD_CONST?
  private static boolean field_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_2")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  // ("<" class_name (COMMA class_name)* ">")?
  private static boolean field_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4")) return false;
    field_4_0(b, l + 1);
    return true;
  }

  // "<" class_name (COMMA class_name)* ">"
  private static boolean field_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    r = r && class_name(b, l + 1);
    r = r && field_4_0_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA class_name)*
  private static boolean field_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_4_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_4_0_2", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean field_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ("=" value)?
  private static boolean field_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_6")) return false;
    field_6_0(b, l + 1);
    return true;
  }

  // "=" value
  private static boolean field_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_name alias
  public static boolean generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, m, GENERIC, r);
    return r;
  }

  /* ********************************************************** */
  // "<" generic (COMMA generic)* ">"
  public static boolean generics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERICS, "<generics>");
    r = consumeToken(b, "<");
    r = r && generic(b, l + 1);
    r = r && generics_2(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA generic)*
  private static boolean generics_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generics_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generics_2", c)) break;
    }
    return true;
  }

  // COMMA generic
  private static boolean generics_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generics_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && generic(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IF calc ((LAMBDA statement (NEW_LINE else)?) | (statement_block (else | KEYWORD_END)))
  public static boolean if_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_$")) return false;
    if (!nextTokenIs(b, KEYWORD_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IF);
    r = r && calc(b, l + 1);
    r = r && if_2(b, l + 1);
    exit_section_(b, m, IF, r);
    return r;
  }

  // (LAMBDA statement (NEW_LINE else)?) | (statement_block (else | KEYWORD_END))
  private static boolean if_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_2_0(b, l + 1);
    if (!r) r = if_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LAMBDA statement (NEW_LINE else)?
  private static boolean if_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAMBDA);
    r = r && statement(b, l + 1);
    r = r && if_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NEW_LINE else)?
  private static boolean if_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2_0_2")) return false;
    if_2_0_2_0(b, l + 1);
    return true;
  }

  // NEW_LINE else
  private static boolean if_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && else_$(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement_block (else | KEYWORD_END)
  private static boolean if_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_block(b, l + 1);
    r = r && if_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // else | KEYWORD_END
  private static boolean if_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_2_1_1")) return false;
    boolean r;
    r = else_$(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD_END);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_IMPLEMENTS class_name | ("{" (class_name (COMMA class_name)*)? "}")
  public static boolean implements_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPLEMENTS, "<implements $>");
    r = implements_0(b, l + 1);
    if (!r) r = implements_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_IMPLEMENTS class_name
  private static boolean implements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_IMPLEMENTS);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "{" (class_name (COMMA class_name)*)? "}"
  private static boolean implements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && implements_1_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // (class_name (COMMA class_name)*)?
  private static boolean implements_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_1_1")) return false;
    implements_1_1_0(b, l + 1);
    return true;
  }

  // class_name (COMMA class_name)*
  private static boolean implements_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && implements_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA class_name)*
  private static boolean implements_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_1_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!implements_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "implements_1_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean implements_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implements_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_INIT "[" parameterlist? "]" (method_short | method_long)
  public static boolean init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init")) return false;
    if (!nextTokenIs(b, KEYWORD_INIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_INIT);
    r = r && consumeToken(b, "[");
    r = r && init_2(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && init_4(b, l + 1);
    exit_section_(b, m, INIT, r);
    return r;
  }

  // parameterlist?
  private static boolean init_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_2")) return false;
    parameterlist(b, l + 1);
    return true;
  }

  // method_short | method_long
  private static boolean init_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_4")) return false;
    boolean r;
    r = method_short(b, l + 1);
    if (!r) r = method_long(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? KEYWORD_ABSTRACT? KEYWORD_INTERFACE clazz_name generics? "{" NEW_LINE ((abstract_method | COMMENT)? NEW_LINE)* "}"
  public static boolean interface_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_$")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && interface_1(b, l + 1);
    r = r && interface_2(b, l + 1);
    r = r && consumeToken(b, KEYWORD_INTERFACE);
    r = r && clazz_name(b, l + 1);
    r = r && interface_5(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && consumeToken(b, NEW_LINE);
    r = r && interface_8(b, l + 1);
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

  // generics?
  private static boolean interface_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_5")) return false;
    generics(b, l + 1);
    return true;
  }

  // ((abstract_method | COMMENT)? NEW_LINE)*
  private static boolean interface_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_8", c)) break;
    }
    return true;
  }

  // (abstract_method | COMMENT)? NEW_LINE
  private static boolean interface_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_8_0_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (abstract_method | COMMENT)?
  private static boolean interface_8_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_8_0_0")) return false;
    interface_8_0_0_0(b, l + 1);
    return true;
  }

  // abstract_method | COMMENT
  private static boolean interface_8_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_8_0_0_0")) return false;
    boolean r;
    r = abstract_method(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_DEF access_modifier? (KEYWORD_STATIC | KEYWORD_SYNCHRONISED)* (IDENTIFIER | OPERATOR) generics? "(" parameterlist? ")" ("::" datatype)? (method_mult | method_short | method_long)
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_DEF);
    r = r && method_1(b, l + 1);
    r = r && method_2(b, l + 1);
    r = r && method_3(b, l + 1);
    r = r && method_4(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && method_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_8(b, l + 1);
    r = r && method_9(b, l + 1);
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

  // IDENTIFIER | OPERATOR
  private static boolean method_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_3")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, OPERATOR);
    return r;
  }

  // generics?
  private static boolean method_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_4")) return false;
    generics(b, l + 1);
    return true;
  }

  // parameterlist?
  private static boolean method_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_6")) return false;
    parameterlist(b, l + 1);
    return true;
  }

  // ("::" datatype)?
  private static boolean method_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8")) return false;
    method_8_0(b, l + 1);
    return true;
  }

  // "::" datatype
  private static boolean method_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && datatype(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // method_mult | method_short | method_long
  private static boolean method_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_9")) return false;
    boolean r;
    r = method_mult(b, l + 1);
    if (!r) r = method_short(b, l + 1);
    if (!r) r = method_long(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NEW_LINE (statement NEW_LINE+)* KEYWORD_END
  public static boolean method_long(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_long")) return false;
    if (!nextTokenIs(b, NEW_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && method_long_1(b, l + 1);
    r = r && consumeToken(b, KEYWORD_END);
    exit_section_(b, m, METHOD_LONG, r);
    return r;
  }

  // (statement NEW_LINE+)*
  private static boolean method_long_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_long_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_long_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_long_1", c)) break;
    }
    return true;
  }

  // statement NEW_LINE+
  private static boolean method_long_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_long_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && method_long_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW_LINE+
  private static boolean method_long_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_long_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(b, "method_long_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "{" NEW_LINE method_mult_arg+ "}"
  public static boolean method_mult(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_MULT, "<method mult>");
    r = consumeToken(b, "{");
    r = r && consumeToken(b, NEW_LINE);
    r = r && method_mult_2(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // method_mult_arg+
  private static boolean method_mult_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_mult_arg(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!method_mult_arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_mult_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "(" ((OPERATOR? value) (COMMA (OPERATOR? value))*)? ")" method_short | method_long NEW_LINE
  public static boolean method_mult_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_MULT_ARG, "<method mult arg>");
    r = method_mult_arg_0(b, l + 1);
    if (!r) r = method_mult_arg_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "(" ((OPERATOR? value) (COMMA (OPERATOR? value))*)? ")" method_short
  private static boolean method_mult_arg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && method_mult_arg_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_short(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((OPERATOR? value) (COMMA (OPERATOR? value))*)?
  private static boolean method_mult_arg_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1")) return false;
    method_mult_arg_0_1_0(b, l + 1);
    return true;
  }

  // (OPERATOR? value) (COMMA (OPERATOR? value))*
  private static boolean method_mult_arg_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_mult_arg_0_1_0_0(b, l + 1);
    r = r && method_mult_arg_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR? value
  private static boolean method_mult_arg_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_mult_arg_0_1_0_0_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR?
  private static boolean method_mult_arg_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_0_0")) return false;
    consumeToken(b, OPERATOR);
    return true;
  }

  // (COMMA (OPERATOR? value))*
  private static boolean method_mult_arg_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!method_mult_arg_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_mult_arg_0_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA (OPERATOR? value)
  private static boolean method_mult_arg_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && method_mult_arg_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR? value
  private static boolean method_mult_arg_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_mult_arg_0_1_0_1_0_1_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPERATOR?
  private static boolean method_mult_arg_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_0_1_0_1_0_1_0")) return false;
    consumeToken(b, OPERATOR);
    return true;
  }

  // method_long NEW_LINE
  private static boolean method_mult_arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_mult_arg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method_long(b, l + 1);
    r = r && consumeToken(b, NEW_LINE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("=" | LAMBDA) statement
  public static boolean method_short(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_short")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_SHORT, "<method short>");
    r = method_short_0(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "=" | LAMBDA
  private static boolean method_short_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_short_0")) return false;
    boolean r;
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, LAMBDA);
    return r;
  }

  /* ********************************************************** */
  // "{" class_name (COMMA class_name)* "}" KEYWORD_FROM path
  public static boolean multi_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_USE, "<multi use>");
    r = consumeToken(b, "{");
    r = r && class_name(b, l + 1);
    r = r && multi_use_2(b, l + 1);
    r = r && consumeToken(b, "}");
    r = r && consumeToken(b, KEYWORD_FROM);
    r = r && path(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA class_name)*
  private static boolean multi_use_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multi_use_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multi_use_2", c)) break;
    }
    return true;
  }

  // COMMA class_name
  private static boolean multi_use_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_use_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // datatype IDENTIFIER
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = datatype(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameter (COMMA parameter)*
  public static boolean parameterlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterlist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETERLIST, "<parameterlist>");
    r = parameter(b, l + 1);
    r = r && parameterlist_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA parameter)*
  private static boolean parameterlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterlist_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterlist_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterlist_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameterlist_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterlist_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
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
  // ((class_name KEYWORD_FROM path) | path) (KEYWORD_AS alias)?
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

  // (class_name KEYWORD_FROM path) | path
  private static boolean single_use_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_use_0_0(b, l + 1);
    if (!r) r = path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // class_name KEYWORD_FROM path
  private static boolean single_use_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && consumeToken(b, KEYWORD_FROM);
    r = r && path(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_AS alias)?
  private static boolean single_use_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_1")) return false;
    single_use_1_0(b, l + 1);
    return true;
  }

  // KEYWORD_AS alias
  private static boolean single_use_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_use_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_AS);
    r = r && alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KEYWORD_RETURN calc) | var | calc | if | while
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = var(b, l + 1);
    if (!r) r = calc(b, l + 1);
    if (!r) r = if_$(b, l + 1);
    if (!r) r = while_$(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_RETURN calc
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_RETURN);
    r = r && calc(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEW_LINE (statement? NEW_LINE+)*
  public static boolean statement_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block")) return false;
    if (!nextTokenIs(b, NEW_LINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    r = r && statement_block_1(b, l + 1);
    exit_section_(b, m, STATEMENT_BLOCK, r);
    return r;
  }

  // (statement? NEW_LINE+)*
  private static boolean statement_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_block_1", c)) break;
    }
    return true;
  }

  // statement? NEW_LINE+
  private static boolean statement_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_block_1_0_0(b, l + 1);
    r = r && statement_block_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement?
  private static boolean statement_block_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_1_0_0")) return false;
    statement(b, l + 1);
    return true;
  }

  // NEW_LINE+
  private static boolean statement_block_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_block_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW_LINE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, NEW_LINE)) break;
      if (!empty_element_parsed_guard_(b, "statement_block_1_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // data_type_def KEYWORD_TYPE clazz_name "=" type_value ("|" type_value)*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, KEYWORD_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_type_def(b, l + 1);
    r = r && consumeToken(b, KEYWORD_TYPE);
    r = r && clazz_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && type_value(b, l + 1);
    r = r && type_5(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // ("|" type_value)*
  private static boolean type_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_5", c)) break;
    }
    return true;
  }

  // "|" type_value
  private static boolean type_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && type_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean type_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_value")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE_VALUE, r);
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
  // CHAR | NUMBER | STRING | KEYWORD_NULL | call
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, KEYWORD_NULL);
    if (!r) r = call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_CONST? datatype? IDENTIFIER ("=" (arr | calc))?
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR, "<var>");
    r = var_0(b, l + 1);
    r = r && var_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && var_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_CONST?
  private static boolean var_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_0")) return false;
    consumeToken(b, KEYWORD_CONST);
    return true;
  }

  // datatype?
  private static boolean var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1")) return false;
    datatype(b, l + 1);
    return true;
  }

  // ("=" (arr | calc))?
  private static boolean var_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_3")) return false;
    var_3_0(b, l + 1);
    return true;
  }

  // "=" (arr | calc)
  private static boolean var_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && var_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arr | calc
  private static boolean var_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_3_0_1")) return false;
    boolean r;
    r = arr(b, l + 1);
    if (!r) r = calc(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_WHILE calc ((statement_block KEYWORD_END) | (LAMBDA statement))
  public static boolean while_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_$")) return false;
    if (!nextTokenIs(b, KEYWORD_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_WHILE);
    r = r && calc(b, l + 1);
    r = r && while_2(b, l + 1);
    exit_section_(b, m, WHILE, r);
    return r;
  }

  // (statement_block KEYWORD_END) | (LAMBDA statement)
  private static boolean while_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = while_2_0(b, l + 1);
    if (!r) r = while_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement_block KEYWORD_END
  private static boolean while_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_block(b, l + 1);
    r = r && consumeToken(b, KEYWORD_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // LAMBDA statement
  private static boolean while_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LAMBDA);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
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
