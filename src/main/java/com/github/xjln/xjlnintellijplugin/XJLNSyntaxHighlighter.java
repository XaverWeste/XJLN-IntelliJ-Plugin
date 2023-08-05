package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class XJLNSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey[] CHARACTERS = new TextAttributesKey[]{createTextAttributesKey("XJLN_STRING", DefaultLanguageHighlighterColors.STRING), createTextAttributesKey("XJLN_CHAR", DefaultLanguageHighlighterColors.STRING)};
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[]{createTextAttributesKey("XJLN_INT", DefaultLanguageHighlighterColors.NUMBER),createTextAttributesKey("XJLN_DOUBLE", DefaultLanguageHighlighterColors.NUMBER)};
    private static final TextAttributesKey[] KEYS = new TextAttributesKey[]{createTextAttributesKey("XJLN_KEY", DefaultLanguageHighlighterColors.KEYWORD)};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{createTextAttributesKey("XJLN_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new XJLNLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        System.out.println(tokenType.toString());
        if(tokenType.equals(XJLNTypes.COMMENT))
            return COMMENT_KEYS;
        if(tokenType.equals(XJLNTypes.STRING) || tokenType.equals(XJLNTypes.CHAR))
            return CHARACTERS;
        if(tokenType.equals(XJLNTypes.INT) || tokenType.equals(XJLNTypes.DOUBLE))
            return NUMBERS;
        if(tokenType.equals(XJLNTypes.IDENTIFIER))
            return KEYS;
        return EMPTY_KEYS;
    }
}
