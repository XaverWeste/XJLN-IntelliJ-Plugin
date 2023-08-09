package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNType;
import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;;import java.util.Set;

public class XJLNSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("XJLN_Keyword", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("XJLN_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("XJLN_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("XJLN_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("XJLN_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey DOCUMENT = TextAttributesKey.createTextAttributesKey("XJLN_DOC", DefaultLanguageHighlighterColors.DOC_COMMENT);

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] IDENTIFIERS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] DOCUMENTS = new TextAttributesKey[]{DOCUMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private final Set<IElementType> keywordTypes = Set.of(XJLNTypes.PRIMITIVETYPE, XJLNTypes.KEYWORD_AS, XJLNTypes.KEYWORD_USE, XJLNTypes.KEYWORD_ABSTRACT, XJLNTypes.KEYWORD_RETURN, XJLNTypes.KEYWORD_END, XJLNTypes.KEYWORD_CONST, XJLNTypes.KEYWORD_FROM, XJLNTypes.KEYWORD_INNER, XJLNTypes.KEYWORD_VAR, XJLNTypes.KEYWORD_DEF, XJLNTypes.COMMA);

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new XJLNLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(tokenType.equals(XJLNTypes.KEYWORD_MAIN) || tokenType.equals(XJLNTypes.KEYWORD_INIT))
            return new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_MAIN", DefaultLanguageHighlighterColors.CONSTANT)};
        if(keywordTypes.contains(tokenType))
            return KEYWORDS;
        if(tokenType.equals(XJLNTypes.STRING) || tokenType.equals(XJLNTypes.CHAR))
            return STRINGS;
        if(tokenType.equals(XJLNTypes.DIGITS) || tokenType.equals(XJLNTypes.DIGITS_FLOATING_POINT))
            return NUMBERS;
        if(tokenType.equals(XJLNTypes.COMMENT))
            return COMMENTS;
        if(tokenType.equals(XJLNTypes.DOC))
            return DOCUMENTS;
        if(tokenType.equals(XJLNTypes.IDENTIFIER))
            return IDENTIFIERS;
        return EMPTY_KEYS;
    }
}
