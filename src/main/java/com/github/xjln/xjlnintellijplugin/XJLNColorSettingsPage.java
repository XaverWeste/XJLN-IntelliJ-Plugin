package com.github.xjln.xjlnintellijplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class XJLNColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", XJLNSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Comment", XJLNSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("String", XJLNSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", XJLNSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Identifier", XJLNSyntaxHighlighter.IDENTIFIER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return XJLNIcon.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new XJLNSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "use java/lang/System as system\n\nmain -> system:out:println(\"Hello World!\")\n\n#calculates the fibonacci numbers\ndef fib(int n) :: int\n    if (n == 0) | (n == 1) -> return 1\n    return fib(n - 1) + fib(n - 2)\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "XJLN";
    }
}
