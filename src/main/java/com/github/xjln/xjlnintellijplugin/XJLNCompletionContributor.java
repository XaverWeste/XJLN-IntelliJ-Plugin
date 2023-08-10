package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class XJLNCompletionContributor extends CompletionContributor {

    public XJLNCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(XJLNTypes.IDENTIFIER),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                    }
                }
        );
    }
}
