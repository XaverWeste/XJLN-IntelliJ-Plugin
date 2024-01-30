package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import java.util.Set;

public class XJLNSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("XJLN_Keyword", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("XJLN_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("XJLN_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("XJLN_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("XJLN_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] IDENTIFIERS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private final Set<IElementType> keywords = Set.of(XJLNTypes.KEYWORD_USE, XJLNTypes.KEYWORD_FROM, XJLNTypes.KEYWORD_AS, XJLNTypes.KEYWORD_DEF, XJLNTypes.KEYWORD_PUBLIC, XJLNTypes.KEYWORD_PROTECTED, XJLNTypes.KEYWORD_PRIVATE
            , XJLNTypes.KEYWORD_ABSTRACT, XJLNTypes.KEYWORD_FINAL, XJLNTypes.KEYWORD_SYNCHRONISED, XJLNTypes.KEYWORD_STATIC, XJLNTypes.KEYWORD_CLASS, XJLNTypes.KEYWORD_DATA, XJLNTypes.KEYWORD_TYPE, XJLNTypes.KEYWORD_INTERFACE, XJLNTypes.KEYWORD_CONST, XJLNTypes.KEYWORD_RETURN, XJLNTypes.KEYWORD_END
            , XJLNTypes.KEYWORD_IF, XJLNTypes.KEYWORD_ELSE, XJLNTypes.KEYWORD_WHILE, XJLNTypes.KEYWORD_INT, XJLNTypes.KEYWORD_DOUBLE
            , XJLNTypes.KEYWORD_FLOAT, XJLNTypes.KEYWORD_LONG, XJLNTypes.KEYWORD_SHORT, XJLNTypes.KEYWORD_BOOLEAN, XJLNTypes.KEYWORD_CHAR, XJLNTypes.KEYWORD_BYTE
            , XJLNTypes.EXTENDS, XJLNTypes.CONTAINS, XJLNTypes.IMPLEMENTS, XJLNTypes.COMMA);

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new XJLNLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if(tokenType == XJLNTypes.KEYWORD_INIT)
            return new TextAttributesKey[]{TextAttributesKey.createTextAttributesKey("XJLN_MAIN", DefaultLanguageHighlighterColors.CONSTANT)};
        if(tokenType == XJLNTypes.COMMENT)
            return COMMENTS;
        if(tokenType == XJLNTypes.STRING || tokenType == XJLNTypes.CHAR)
            return STRINGS;
        if(tokenType == XJLNTypes.IDENTIFIER )
            return IDENTIFIERS;
        if(tokenType == XJLNTypes.NUMBER)
            return NUMBERS;
        if(keywords.contains(tokenType))
            return KEYWORDS;
        return EMPTY_KEYS;
    }
}
