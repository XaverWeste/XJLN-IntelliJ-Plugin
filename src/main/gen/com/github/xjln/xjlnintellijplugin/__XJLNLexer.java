/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.xjln.xjlnintellijplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_XJLNLexer.flex</tt>
 */
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
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\3\1\22\0\1\3\1\10\1\13\1\12\1\0\2\10\1\11\2\0\2\10\1\0\1\10"+
    "\1\6\1\10\12\5\2\0\3\10\2\0\32\4\3\0\1\10\2\0\1\23\1\26\1\30\1\24\1\16\1\17"+
    "\1\37\1\35\1\7\2\4\1\27\1\22\1\33\1\21\1\25\1\4\1\20\1\15\1\31\1\14\1\32\1"+
    "\36\1\4\1\34\1\4\1\0\1\10\10\0\1\1\242\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6"+
    "\1\1\1\7\1\1\15\4\2\5\1\10\1\4\1\0"+
    "\1\7\1\0\1\11\12\4\1\12\17\4\1\13\1\14"+
    "\1\15\4\4\1\16\5\4\1\17\15\4\1\20\4\4"+
    "\1\21\1\4\1\22\4\4\1\23\4\4\1\24\1\25"+
    "\2\4\1\26\1\27\4\4\1\30\1\31\1\32\7\4"+
    "\1\33\1\34\1\35\1\4\1\36\1\4\1\37\1\4"+
    "\1\40\1\41\6\4\1\42\1\4\1\43\2\4\1\44"+
    "\1\4\1\45\1\4\1\46\2\4\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
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
    "\0\0\0\40\0\40\0\100\0\140\0\200\0\240\0\300"+
    "\0\340\0\u0100\0\u0120\0\u0140\0\u0160\0\u0180\0\u01a0\0\u01c0"+
    "\0\u01e0\0\u0200\0\u0220\0\u0240\0\u0260\0\u0280\0\u02a0\0\u02c0"+
    "\0\u02e0\0\40\0\140\0\u0300\0\u0320\0\40\0\u0120\0\40"+
    "\0\u0340\0\u0360\0\u0380\0\u03a0\0\u03c0\0\u03e0\0\u0400\0\u0420"+
    "\0\u0440\0\u0460\0\140\0\u0480\0\u04a0\0\u04c0\0\u04e0\0\u0500"+
    "\0\u0520\0\u0540\0\u0560\0\u0580\0\u05a0\0\u05c0\0\u05e0\0\u0600"+
    "\0\u0620\0\u0640\0\u0660\0\40\0\140\0\u0680\0\u06a0\0\u06c0"+
    "\0\u06e0\0\140\0\u0700\0\u0720\0\u0740\0\u0760\0\u0780\0\140"+
    "\0\u07a0\0\u07c0\0\u07e0\0\u0800\0\u0820\0\u0840\0\u0860\0\u0880"+
    "\0\u08a0\0\u08c0\0\u08e0\0\u0900\0\u0920\0\140\0\u0940\0\u0960"+
    "\0\u0980\0\u09a0\0\140\0\u09c0\0\140\0\u09e0\0\u0a00\0\u0a20"+
    "\0\u0a40\0\140\0\u0a60\0\u0a80\0\u0aa0\0\u0ac0\0\140\0\140"+
    "\0\u0ae0\0\u0b00\0\140\0\140\0\u0b20\0\u0b40\0\u0b60\0\u0b80"+
    "\0\140\0\140\0\140\0\u0ba0\0\u0bc0\0\u0be0\0\u0c00\0\u0c20"+
    "\0\u0c40\0\u0c60\0\140\0\140\0\140\0\u0c80\0\140\0\u0ca0"+
    "\0\140\0\u0cc0\0\140\0\140\0\u0ce0\0\u0d00\0\u0d20\0\u0d40"+
    "\0\u0d60\0\u0d80\0\140\0\u0da0\0\140\0\u0dc0\0\u0de0\0\140"+
    "\0\u0e00\0\140\0\u0e20\0\140\0\u0e40\0\u0e60\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\2\5\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\4\5\1\30\1\5\43\0\1\4\40\0\2\5\1\0"+
    "\1\5\4\0\24\5\5\0\1\6\1\31\1\32\5\0"+
    "\1\32\1\0\1\32\4\0\1\32\2\0\1\32\14\0"+
    "\2\5\1\0\1\5\4\0\3\5\1\33\13\5\1\34"+
    "\4\5\10\0\1\10\27\0\1\35\2\0\35\35\2\12"+
    "\1\0\7\12\1\36\25\12\13\37\1\40\24\37\4\0"+
    "\2\5\1\0\1\5\4\0\1\5\1\41\22\5\4\0"+
    "\2\5\1\0\1\5\4\0\15\5\1\42\2\5\1\43"+
    "\1\44\2\5\4\0\2\5\1\0\1\5\4\0\13\5"+
    "\1\45\3\5\1\46\4\5\4\0\2\5\1\0\1\47"+
    "\4\0\4\5\1\50\6\5\1\51\10\5\4\0\2\5"+
    "\1\0\1\5\4\0\2\5\1\52\21\5\4\0\2\5"+
    "\1\0\1\5\4\0\1\5\1\53\10\5\1\54\11\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\55\2\5"+
    "\1\56\1\5\1\57\14\5\4\0\2\5\1\0\1\5"+
    "\4\0\1\60\3\5\1\61\17\5\4\0\2\5\1\0"+
    "\1\5\4\0\5\5\1\62\12\5\1\63\3\5\4\0"+
    "\2\5\1\0\1\5\4\0\5\5\1\64\16\5\4\0"+
    "\2\5\1\0\1\5\4\0\5\5\1\65\5\5\1\66"+
    "\5\5\1\67\2\5\4\0\2\5\1\0\1\5\4\0"+
    "\20\5\1\70\3\5\4\0\2\5\1\0\1\5\4\0"+
    "\21\5\1\71\2\5\5\0\1\31\1\0\1\32\5\0"+
    "\1\32\1\0\1\32\4\0\1\32\2\0\1\32\14\0"+
    "\2\5\1\0\1\72\4\0\15\5\1\73\6\5\11\0"+
    "\1\74\32\0\2\5\1\0\1\5\4\0\2\5\1\75"+
    "\21\5\4\0\2\5\1\0\1\5\4\0\7\5\1\76"+
    "\14\5\4\0\2\5\1\0\1\5\4\0\17\5\1\77"+
    "\4\5\4\0\2\5\1\0\1\5\4\0\5\5\1\100"+
    "\16\5\4\0\2\5\1\0\1\5\4\0\1\5\1\101"+
    "\22\5\4\0\2\5\1\0\1\5\4\0\10\5\1\102"+
    "\13\5\4\0\2\5\1\0\1\5\4\0\17\5\1\103"+
    "\4\5\4\0\2\5\1\0\1\5\4\0\5\5\1\104"+
    "\16\5\4\0\2\5\1\0\1\5\4\0\5\5\1\105"+
    "\16\5\4\0\2\5\1\0\1\5\4\0\15\5\1\106"+
    "\6\5\4\0\2\5\1\0\1\5\4\0\1\5\1\107"+
    "\22\5\4\0\2\5\1\0\1\5\4\0\3\5\1\110"+
    "\20\5\4\0\2\5\1\0\1\5\4\0\1\111\23\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\112\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\12\5\1\113\11\5"+
    "\4\0\2\5\1\0\1\114\4\0\5\5\1\115\16\5"+
    "\4\0\2\5\1\0\1\5\4\0\5\5\1\116\16\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\117\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\17\5\1\120\4\5"+
    "\4\0\2\5\1\0\1\5\4\0\17\5\1\121\4\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\122\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\123\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\11\5\1\124\12\5"+
    "\4\0\2\5\1\0\1\125\4\0\24\5\4\0\2\5"+
    "\1\0\1\5\4\0\15\5\1\126\6\5\4\0\2\5"+
    "\1\0\1\5\4\0\2\5\1\127\21\5\4\0\2\5"+
    "\1\0\1\5\4\0\15\5\1\130\6\5\4\0\2\5"+
    "\1\0\1\5\4\0\14\5\1\131\7\5\4\0\2\5"+
    "\1\0\1\5\4\0\4\5\1\132\17\5\4\0\2\5"+
    "\1\0\1\5\4\0\2\5\1\133\21\5\4\0\2\5"+
    "\1\0\1\5\4\0\7\5\1\134\14\5\4\0\2\5"+
    "\1\0\1\5\4\0\6\5\1\135\15\5\4\0\2\5"+
    "\1\0\1\5\4\0\7\5\1\136\14\5\4\0\2\5"+
    "\1\0\1\5\4\0\1\137\23\5\4\0\2\5\1\0"+
    "\1\5\4\0\15\5\1\140\6\5\4\0\2\5\1\0"+
    "\1\5\4\0\12\5\1\141\11\5\4\0\2\5\1\0"+
    "\1\5\4\0\7\5\1\142\14\5\4\0\2\5\1\0"+
    "\1\5\4\0\13\5\1\143\10\5\4\0\2\5\1\0"+
    "\1\5\4\0\16\5\1\144\5\5\4\0\2\5\1\0"+
    "\1\5\4\0\15\5\1\145\6\5\4\0\2\5\1\0"+
    "\1\5\4\0\13\5\1\146\10\5\4\0\2\5\1\0"+
    "\1\5\4\0\2\5\1\147\21\5\4\0\2\5\1\0"+
    "\1\5\4\0\23\5\1\150\4\0\2\5\1\0\1\5"+
    "\4\0\1\5\1\151\22\5\4\0\2\5\1\0\1\5"+
    "\4\0\1\5\1\152\22\5\4\0\2\5\1\0\1\5"+
    "\4\0\4\5\1\153\17\5\4\0\2\5\1\0\1\5"+
    "\4\0\2\5\1\154\21\5\4\0\2\5\1\0\1\5"+
    "\4\0\13\5\1\155\10\5\4\0\2\5\1\0\1\5"+
    "\4\0\4\5\1\156\17\5\4\0\2\5\1\0\1\157"+
    "\4\0\24\5\4\0\2\5\1\0\1\5\4\0\21\5"+
    "\1\160\2\5\4\0\2\5\1\0\1\5\4\0\15\5"+
    "\1\161\6\5\4\0\2\5\1\0\1\5\4\0\13\5"+
    "\1\162\10\5\4\0\2\5\1\0\1\5\4\0\15\5"+
    "\1\163\6\5\4\0\2\5\1\0\1\5\4\0\4\5"+
    "\1\164\17\5\4\0\2\5\1\0\1\5\4\0\4\5"+
    "\1\165\17\5\4\0\2\5\1\0\1\5\4\0\13\5"+
    "\1\166\10\5\4\0\2\5\1\0\1\167\4\0\24\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\170\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\171\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\172\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\173\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\1\5\1\174\22\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\175\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\3\5\1\176\20\5"+
    "\4\0\2\5\1\0\1\5\4\0\14\5\1\177\7\5"+
    "\4\0\2\5\1\0\1\5\4\0\4\5\1\200\17\5"+
    "\4\0\2\5\1\0\1\5\4\0\17\5\1\201\4\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\202\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\203\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\14\5\1\204\7\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\205\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\14\5\1\206\7\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\207\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\7\5\1\210\14\5"+
    "\4\0\2\5\1\0\1\5\4\0\5\5\1\211\16\5"+
    "\4\0\2\5\1\0\1\5\4\0\14\5\1\212\7\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\213\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\214\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\17\5\1\215\4\5"+
    "\4\0\2\5\1\0\1\5\4\0\14\5\1\216\7\5"+
    "\4\0\2\5\1\0\1\5\4\0\17\5\1\217\4\5"+
    "\4\0\2\5\1\0\1\5\4\0\15\5\1\220\6\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\221\21\5"+
    "\4\0\2\5\1\0\1\5\4\0\2\5\1\222\21\5"+
    "\4\0\2\5\1\0\1\223\4\0\24\5\4\0\2\5"+
    "\1\0\1\5\4\0\10\5\1\224\13\5\4\0\2\5"+
    "\1\0\1\5\4\0\1\5\1\225\22\5\4\0\2\5"+
    "\1\0\1\5\4\0\2\5\1\226\21\5\4\0\2\5"+
    "\1\0\1\5\4\0\10\5\1\227\13\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3712];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\26\1\1\11\2\1\1\0\1\11\1\0"+
    "\1\11\33\1\1\11\133\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
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


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
    //zzAtBOL = true;
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
  public IElementType advance() throws java.io.IOException {
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
          case 40: break;
          case 2: 
            { return NEW_LINE;
            } 
            // fall through
          case 41: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 42: break;
          case 4: 
            { return IDENTIFIER;
            } 
            // fall through
          case 43: break;
          case 5: 
            { return NUMBER;
            } 
            // fall through
          case 44: break;
          case 6: 
            { return OPERATOR;
            } 
            // fall through
          case 45: break;
          case 7: 
            { return COMMENT;
            } 
            // fall through
          case 46: break;
          case 8: 
            { return KEYWORD_IF;
            } 
            // fall through
          case 47: break;
          case 9: 
            { return STRING;
            } 
            // fall through
          case 48: break;
          case 10: 
            { return KEYWORD_AS;
            } 
            // fall through
          case 49: break;
          case 11: 
            { return KEYWORD_INT;
            } 
            // fall through
          case 50: break;
          case 12: 
            { return CHAR;
            } 
            // fall through
          case 51: break;
          case 13: 
            { return KEYWORD_USE;
            } 
            // fall through
          case 52: break;
          case 14: 
            { return KEYWORD_END;
            } 
            // fall through
          case 53: break;
          case 15: 
            { return KEYWORD_DEF;
            } 
            // fall through
          case 54: break;
          case 16: 
            { return KEYWORD_INIT;
            } 
            // fall through
          case 55: break;
          case 17: 
            { return KEYWORD_ELSE;
            } 
            // fall through
          case 56: break;
          case 18: 
            { return KEYWORD_FROM;
            } 
            // fall through
          case 57: break;
          case 19: 
            { return KEYWORD_DATA;
            } 
            // fall through
          case 58: break;
          case 20: 
            { return KEYWORD_BYTE;
            } 
            // fall through
          case 59: break;
          case 21: 
            { return KEYWORD_LONG;
            } 
            // fall through
          case 60: break;
          case 22: 
            { return KEYWORD_CHAR;
            } 
            // fall through
          case 61: break;
          case 23: 
            { return KEYWORD_TYPE;
            } 
            // fall through
          case 62: break;
          case 24: 
            { return KEYWORD_SHORT;
            } 
            // fall through
          case 63: break;
          case 25: 
            { return KEYWORD_FINAL;
            } 
            // fall through
          case 64: break;
          case 26: 
            { return KEYWORD_FLOAT;
            } 
            // fall through
          case 65: break;
          case 27: 
            { return KEYWORD_CONST;
            } 
            // fall through
          case 66: break;
          case 28: 
            { return KEYWORD_CLASS;
            } 
            // fall through
          case 67: break;
          case 29: 
            { return KEYWORD_WHILE;
            } 
            // fall through
          case 68: break;
          case 30: 
            { return KEYWORD_STATIC;
            } 
            // fall through
          case 69: break;
          case 31: 
            { return KEYWORD_RETURN;
            } 
            // fall through
          case 70: break;
          case 32: 
            { return KEYWORD_DOUBLE;
            } 
            // fall through
          case 71: break;
          case 33: 
            { return KEYWORD_PUBLIC;
            } 
            // fall through
          case 72: break;
          case 34: 
            { return KEYWORD_PRIVATE;
            } 
            // fall through
          case 73: break;
          case 35: 
            { return KEYWORD_BOOLEAN;
            } 
            // fall through
          case 74: break;
          case 36: 
            { return KEYWORD_ABSTRACT;
            } 
            // fall through
          case 75: break;
          case 37: 
            { return KEYWORD_INTERFACE;
            } 
            // fall through
          case 76: break;
          case 38: 
            { return KEYWORD_PROTECTED;
            } 
            // fall through
          case 77: break;
          case 39: 
            { return KEYWORD_SYNCHRONISED;
            } 
            // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
