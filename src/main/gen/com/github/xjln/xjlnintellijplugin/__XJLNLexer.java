// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: __XJLNLexer.flex

package com.github.xjln.xjlnintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;


public class __XJLNLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\3\3\22\0\1\1\1\4\1\5"+
    "\1\6\1\0\2\4\1\7\2\0\2\4\1\10\1\11"+
    "\1\12\1\4\12\13\2\0\2\4\1\14\2\0\32\15"+
    "\3\0\1\4\2\0\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\2\15\1\27\1\30\1\31"+
    "\1\32\1\33\1\15\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\15\1\0\1\4\10\0\1\3"+
    "\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\1"+
    "\1\6\1\4\1\7\20\10\1\0\1\11\1\5\1\0"+
    "\1\12\1\0\1\7\1\10\1\13\16\10\1\14\16\10"+
    "\1\15\1\7\7\10\1\16\2\10\1\17\6\10\1\20"+
    "\13\10\1\21\3\10\1\22\1\23\3\10\1\24\1\10"+
    "\1\25\3\10\1\26\1\10\1\27\1\10\1\30\1\31"+
    "\7\10\1\32\1\33\3\10\1\34\1\35\3\10\1\36"+
    "\1\37\6\10\1\40\2\10\1\41\3\10\1\42\5\10"+
    "\1\43\1\44\1\45\2\10\1\46\1\10\1\47\2\10"+
    "\1\50\2\10\1\51\1\52\5\10\1\53\1\54\1\10"+
    "\1\55\2\10\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\44\0\154\0\220\0\264\0\330"+
    "\0\44\0\374\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4"+
    "\0\u01f8\0\u021c\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\u02f4"+
    "\0\u0318\0\u033c\0\u0360\0\220\0\44\0\44\0\u0384\0\154"+
    "\0\u03a8\0\44\0\u03cc\0\u0144\0\u03f0\0\u0414\0\u0438\0\u045c"+
    "\0\u0480\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\u0534\0\u0558\0\u057c"+
    "\0\u05a0\0\u05c4\0\u0144\0\u05e8\0\u060c\0\u0630\0\u0654\0\u0678"+
    "\0\u069c\0\u06c0\0\u06e4\0\u0708\0\u072c\0\u0750\0\u0774\0\u0798"+
    "\0\u07bc\0\44\0\u07e0\0\u0804\0\u0828\0\u084c\0\u0870\0\u0894"+
    "\0\u08b8\0\u08dc\0\u0144\0\u0900\0\u0924\0\u0144\0\u0948\0\u096c"+
    "\0\u0990\0\u09b4\0\u09d8\0\u09fc\0\u0a20\0\u0a44\0\u0a68\0\u0a8c"+
    "\0\u0ab0\0\u0ad4\0\u0af8\0\u0b1c\0\u0b40\0\u0b64\0\u0b88\0\u0bac"+
    "\0\u0144\0\u0bd0\0\u0bf4\0\u0c18\0\u0144\0\u0144\0\u0c3c\0\u0c60"+
    "\0\u0c84\0\u0144\0\u0ca8\0\u0144\0\u0ccc\0\u0cf0\0\u0d14\0\u0144"+
    "\0\u0d38\0\u0144\0\u0d5c\0\u0144\0\u0144\0\u0d80\0\u0da4\0\u0dc8"+
    "\0\u0dec\0\u0e10\0\u0e34\0\u0e58\0\u0144\0\u0144\0\u0e7c\0\u0ea0"+
    "\0\u0ec4\0\u0144\0\u0144\0\u0ee8\0\u0f0c\0\u0f30\0\u0144\0\u0144"+
    "\0\u0f54\0\u0f78\0\u0f9c\0\u0fc0\0\u0fe4\0\u1008\0\u0144\0\u102c"+
    "\0\u1050\0\u0144\0\u1074\0\u1098\0\u10bc\0\u0144\0\u10e0\0\u1104"+
    "\0\u1128\0\u114c\0\u1170\0\u0144\0\u0144\0\u0144\0\u1194\0\u11b8"+
    "\0\u0144\0\u11dc\0\u0144\0\u1200\0\u1224\0\u0144\0\u1248\0\u126c"+
    "\0\u0144\0\u0144\0\u1290\0\u12b4\0\u12d8\0\u12fc\0\u1320\0\u0144"+
    "\0\u0144\0\u1344\0\u0144\0\u1368\0\u138c\0\u0144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\1\13\1\5\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\2\14\1\23\1\24\1\14"+
    "\1\25\1\14\1\26\1\27\1\30\1\31\1\32\1\14"+
    "\1\33\2\14\45\0\1\3\46\0\1\5\4\0\1\5"+
    "\2\0\1\5\27\0\5\34\1\35\36\34\2\7\1\0"+
    "\3\7\1\36\35\7\2\37\2\0\40\37\4\0\1\5"+
    "\4\0\1\5\2\0\1\40\41\0\1\41\1\13\5\0"+
    "\1\42\1\0\1\42\2\0\2\42\5\0\1\42\21\0"+
    "\1\14\1\0\27\14\13\0\1\14\1\0\2\14\1\43"+
    "\15\14\1\44\6\14\13\0\1\14\1\0\15\14\1\45"+
    "\10\14\1\46\13\0\1\14\1\0\10\14\1\47\1\14"+
    "\1\50\2\14\1\51\11\14\13\0\1\14\1\0\1\14"+
    "\1\52\3\14\1\53\7\14\1\54\11\14\13\0\1\14"+
    "\1\0\12\14\1\55\1\14\1\56\10\14\1\57\1\14"+
    "\13\0\1\14\1\0\11\14\1\60\1\61\4\14\1\62"+
    "\7\14\13\0\1\14\1\0\6\14\1\63\4\14\1\64"+
    "\1\65\12\14\13\0\1\14\1\0\15\14\1\66\11\14"+
    "\13\0\1\14\1\0\22\14\1\67\4\14\13\0\1\14"+
    "\1\0\17\14\1\70\2\14\1\71\4\14\13\0\1\14"+
    "\1\0\5\14\1\72\21\14\13\0\1\14\1\0\10\14"+
    "\1\73\10\14\1\74\4\14\1\75\13\0\1\14\1\0"+
    "\10\14\1\76\15\14\1\77\13\0\1\14\1\0\20\14"+
    "\1\100\6\14\13\0\1\14\1\0\10\14\1\101\16\14"+
    "\7\0\1\102\47\0\1\103\43\0\1\14\1\0\20\14"+
    "\1\104\6\14\13\0\1\14\1\0\15\14\1\105\11\14"+
    "\13\0\1\14\1\0\21\14\1\106\5\14\13\0\1\14"+
    "\1\0\1\14\1\107\25\14\13\0\1\14\1\0\1\14"+
    "\1\110\25\14\13\0\1\14\1\0\14\14\1\111\12\14"+
    "\13\0\1\14\1\0\21\14\1\112\5\14\13\0\1\14"+
    "\1\0\6\14\1\113\20\14\13\0\1\14\1\0\22\14"+
    "\1\114\4\14\13\0\1\14\1\0\20\14\1\115\6\14"+
    "\13\0\1\14\1\0\4\14\1\116\22\14\13\0\1\14"+
    "\1\0\21\14\1\117\5\14\13\0\1\14\1\0\14\14"+
    "\1\120\12\14\13\0\1\14\1\0\15\14\1\121\11\14"+
    "\13\0\1\14\1\0\15\14\1\122\11\14\13\0\1\14"+
    "\1\0\16\14\1\123\10\14\13\0\1\14\1\0\11\14"+
    "\1\124\7\14\1\125\5\14\13\0\1\14\1\0\14\14"+
    "\1\126\12\14\13\0\1\14\1\0\12\14\1\127\14\14"+
    "\13\0\1\14\1\0\11\14\1\130\3\14\1\131\11\14"+
    "\13\0\1\14\1\0\2\14\1\132\24\14\13\0\1\14"+
    "\1\0\21\14\1\133\5\14\13\0\1\14\1\0\15\14"+
    "\1\134\11\14\13\0\1\14\1\0\1\14\1\135\25\14"+
    "\13\0\1\14\1\0\14\14\1\136\12\14\13\0\1\14"+
    "\1\0\11\14\1\137\15\14\13\0\1\14\1\0\16\14"+
    "\1\140\10\14\13\0\1\14\1\0\5\14\1\141\21\14"+
    "\13\0\1\14\1\0\11\14\1\142\15\14\12\0\1\41"+
    "\6\0\1\42\1\0\1\42\2\0\2\42\5\0\1\42"+
    "\21\0\1\14\1\0\21\14\1\143\5\14\13\0\1\14"+
    "\1\0\12\14\1\144\14\14\13\0\1\14\1\0\5\14"+
    "\1\145\21\14\13\0\1\14\1\0\17\14\1\146\7\14"+
    "\13\0\1\14\1\0\20\14\1\147\6\14\13\0\1\14"+
    "\1\0\20\14\1\150\1\151\5\14\13\0\1\14\1\0"+
    "\1\14\1\152\25\14\13\0\1\14\1\0\2\14\1\153"+
    "\24\14\13\0\1\14\1\0\5\14\1\154\21\14\13\0"+
    "\1\14\1\0\5\14\1\155\21\14\13\0\1\14\1\0"+
    "\1\14\1\156\25\14\13\0\1\14\1\0\1\14\1\157"+
    "\25\14\13\0\1\14\1\0\13\14\1\160\13\14\13\0"+
    "\1\14\1\0\12\14\1\161\14\14\13\0\1\14\1\0"+
    "\21\14\1\162\5\14\13\0\1\14\1\0\5\14\1\163"+
    "\21\14\13\0\1\14\1\0\7\14\1\164\17\14\13\0"+
    "\1\14\1\0\12\14\1\165\14\14\13\0\1\14\1\0"+
    "\23\14\1\166\3\14\13\0\1\14\1\0\21\14\1\167"+
    "\5\14\13\0\1\14\1\0\12\14\1\170\14\14\13\0"+
    "\1\14\1\0\22\14\1\171\4\14\13\0\1\14\1\0"+
    "\17\14\1\172\7\14\13\0\1\14\1\0\21\14\1\173"+
    "\5\14\13\0\1\14\1\0\3\14\1\174\23\14\13\0"+
    "\1\14\1\0\20\14\1\175\6\14\13\0\1\14\1\0"+
    "\5\14\1\176\21\14\13\0\1\14\1\0\12\14\1\177"+
    "\14\14\13\0\1\14\1\0\17\14\1\200\7\14\13\0"+
    "\1\14\1\0\5\14\1\201\21\14\13\0\1\14\1\0"+
    "\20\14\1\202\6\14\13\0\1\14\1\0\21\14\1\203"+
    "\5\14\13\0\1\14\1\0\1\14\1\204\25\14\13\0"+
    "\1\14\1\0\12\14\1\205\14\14\13\0\1\14\1\0"+
    "\14\14\1\206\12\14\13\0\1\14\1\0\12\14\1\207"+
    "\14\14\13\0\1\14\1\0\21\14\1\210\5\14\13\0"+
    "\1\14\1\0\5\14\1\211\21\14\13\0\1\14\1\0"+
    "\17\14\1\212\7\14\13\0\1\14\1\0\1\14\1\213"+
    "\25\14\13\0\1\14\1\0\5\14\1\214\21\14\13\0"+
    "\1\14\1\0\11\14\1\215\15\14\13\0\1\14\1\0"+
    "\17\14\1\216\7\14\13\0\1\14\1\0\21\14\1\217"+
    "\5\14\13\0\1\14\1\0\11\14\1\220\15\14\13\0"+
    "\1\14\1\0\10\14\1\221\16\14\13\0\1\14\1\0"+
    "\5\14\1\222\21\14\13\0\1\14\1\0\1\14\1\223"+
    "\25\14\13\0\1\14\1\0\1\14\1\224\25\14\13\0"+
    "\1\14\1\0\11\14\1\225\15\14\13\0\1\14\1\0"+
    "\5\14\1\226\21\14\13\0\1\14\1\0\4\14\1\227"+
    "\22\14\13\0\1\14\1\0\13\14\1\230\13\14\13\0"+
    "\1\14\1\0\6\14\1\231\20\14\13\0\1\14\1\0"+
    "\21\14\1\232\5\14\13\0\1\14\1\0\3\14\1\233"+
    "\23\14\13\0\1\14\1\0\3\14\1\234\23\14\13\0"+
    "\1\14\1\0\14\14\1\235\12\14\13\0\1\14\1\0"+
    "\3\14\1\236\23\14\13\0\1\14\1\0\17\14\1\237"+
    "\7\14\13\0\1\14\1\0\3\14\1\240\23\14\13\0"+
    "\1\14\1\0\14\14\1\241\12\14\13\0\1\14\1\0"+
    "\14\14\1\242\12\14\13\0\1\14\1\0\20\14\1\243"+
    "\6\14\13\0\1\14\1\0\5\14\1\244\21\14\13\0"+
    "\1\14\1\0\1\14\1\245\25\14\13\0\1\14\1\0"+
    "\5\14\1\246\21\14\13\0\1\14\1\0\21\14\1\247"+
    "\5\14\13\0\1\14\1\0\15\14\1\250\11\14\13\0"+
    "\1\14\1\0\21\14\1\251\5\14\13\0\1\14\1\0"+
    "\20\14\1\252\6\14\13\0\1\14\1\0\14\14\1\253"+
    "\12\14\13\0\1\14\1\0\3\14\1\254\23\14\13\0"+
    "\1\14\1\0\5\14\1\255\21\14\13\0\1\14\1\0"+
    "\14\14\1\256\12\14\13\0\1\14\1\0\21\14\1\257"+
    "\5\14\13\0\1\14\1\0\5\14\1\260\21\14\13\0"+
    "\1\14\1\0\4\14\1\261\22\14\13\0\1\14\1\0"+
    "\11\14\1\262\15\14\13\0\1\14\1\0\20\14\1\263"+
    "\6\14\13\0\1\14\1\0\20\14\1\264\6\14\13\0"+
    "\1\14\1\0\5\14\1\265\21\14\13\0\1\14\1\0"+
    "\4\14\1\266\22\14";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5040];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\4\1\1\11\22\1\1\0"+
    "\2\11\1\0\1\1\1\0\1\11\37\1\1\11\164\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[182];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public __XJLNLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public __XJLNLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 47: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 48: break;
          case 3:
            { return NEW_LINE;
            }
          // fall through
          case 49: break;
          case 4:
            { return OPERATOR;
            }
          // fall through
          case 50: break;
          case 5:
            { return COMMENT;
            }
          // fall through
          case 51: break;
          case 6:
            { return COMMA;
            }
          // fall through
          case 52: break;
          case 7:
            { return NUMBER;
            }
          // fall through
          case 53: break;
          case 8:
            { return IDENTIFIER;
            }
          // fall through
          case 54: break;
          case 9:
            { return STRING;
            }
          // fall through
          case 55: break;
          case 10:
            { return LAMBDA;
            }
          // fall through
          case 56: break;
          case 11:
            { return KEYWORD_AS;
            }
          // fall through
          case 57: break;
          case 12:
            { return KEYWORD_IF;
            }
          // fall through
          case 58: break;
          case 13:
            { return CHAR;
            }
          // fall through
          case 59: break;
          case 14:
            { return KEYWORD_DEF;
            }
          // fall through
          case 60: break;
          case 15:
            { return KEYWORD_END;
            }
          // fall through
          case 61: break;
          case 16:
            { return KEYWORD_INT;
            }
          // fall through
          case 62: break;
          case 17:
            { return KEYWORD_USE;
            }
          // fall through
          case 63: break;
          case 18:
            { return KEYWORD_BYTE;
            }
          // fall through
          case 64: break;
          case 19:
            { return KEYWORD_CHAR;
            }
          // fall through
          case 65: break;
          case 20:
            { return KEYWORD_DATA;
            }
          // fall through
          case 66: break;
          case 21:
            { return KEYWORD_ELSE;
            }
          // fall through
          case 67: break;
          case 22:
            { return KEYWORD_FROM;
            }
          // fall through
          case 68: break;
          case 23:
            { return KEYWORD_INIT;
            }
          // fall through
          case 69: break;
          case 24:
            { return KEYWORD_LONG;
            }
          // fall through
          case 70: break;
          case 25:
            { return KEYWORD_NULL;
            }
          // fall through
          case 71: break;
          case 26:
            { return KEYWORD_THIS;
            }
          // fall through
          case 72: break;
          case 27:
            { return KEYWORD_TYPE;
            }
          // fall through
          case 73: break;
          case 28:
            { return KEYWORD_CLASS;
            }
          // fall through
          case 74: break;
          case 29:
            { return KEYWORD_CONST;
            }
          // fall through
          case 75: break;
          case 30:
            { return KEYWORD_FINAL;
            }
          // fall through
          case 76: break;
          case 31:
            { return KEYWORD_FLOAT;
            }
          // fall through
          case 77: break;
          case 32:
            { return KEYWORD_SHORT;
            }
          // fall through
          case 78: break;
          case 33:
            { return KEYWORD_WHILE;
            }
          // fall through
          case 79: break;
          case 34:
            { return KEYWORD_DOUBLE;
            }
          // fall through
          case 80: break;
          case 35:
            { return KEYWORD_PUBLIC;
            }
          // fall through
          case 81: break;
          case 36:
            { return KEYWORD_RETURN;
            }
          // fall through
          case 82: break;
          case 37:
            { return KEYWORD_STATIC;
            }
          // fall through
          case 83: break;
          case 38:
            { return KEYWORD_BOOLEAN;
            }
          // fall through
          case 84: break;
          case 39:
            { return KEYWORD_EXTENDS;
            }
          // fall through
          case 85: break;
          case 40:
            { return KEYWORD_PRIVATE;
            }
          // fall through
          case 86: break;
          case 41:
            { return KEYWORD_ABSTRACT;
            }
          // fall through
          case 87: break;
          case 42:
            { return KEYWORD_CONTAINS;
            }
          // fall through
          case 88: break;
          case 43:
            { return KEYWORD_INTERFACE;
            }
          // fall through
          case 89: break;
          case 44:
            { return KEYWORD_PROTECTED;
            }
          // fall through
          case 90: break;
          case 45:
            { return KEYWORD_IMPLEMENTS;
            }
          // fall through
          case 91: break;
          case 46:
            { return KEYWORD_SYNCHRONISED;
            }
          // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
