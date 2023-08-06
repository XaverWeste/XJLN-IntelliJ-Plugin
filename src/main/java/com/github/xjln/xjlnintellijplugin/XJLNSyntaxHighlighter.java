package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;;import java.util.Set;

public class XJLNSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_Keyword", DefaultLanguageHighlighterColors.KEYWORD)};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_STRING", DefaultLanguageHighlighterColors.STRING)};
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_NUMBER", DefaultLanguageHighlighterColors.NUMBER)};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)};
    private static final TextAttributesKey[] IDENTIFIERS = new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private final Set<IElementType> keywordTypes = Set.of(XJLNTypes.USE, XJLNTypes.FROM, XJLNTypes.AS, XJLNTypes.DEF, XJLNTypes.END, XJLNTypes.INNER, XJLNTypes.CONST, XJLNTypes.VAR, XJLNTypes.COMMA);

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new XJLNLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(keywordTypes.contains(tokenType))
            return KEYWORDS;
        if(tokenType.equals(XJLNTypes.STRING) || tokenType.equals(XJLNTypes.CHAR))
            return STRINGS;
        if(tokenType.equals(XJLNTypes.INT) || tokenType.equals(XJLNTypes.DOUBLE))
            return NUMBERS;
        if(tokenType.equals(XJLNTypes.COMMENT))
            return COMMENTS;
        if(tokenType.equals(XJLNTypes.IDENTIFIER))
            return IDENTIFIERS;
        return EMPTY_KEYS;
    }
}
