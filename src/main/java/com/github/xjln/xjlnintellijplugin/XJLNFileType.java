package com.github.xjln.xjlnintellijplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class XJLNFileType extends LanguageFileType {

    public static final XJLNFileType INSTANCE = new XJLNFileType();

    protected XJLNFileType() {
        super(XJLNLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "XJLN File";
    }

    @Override
    public @NotNull String getDescription() {
        return "XJLN language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "xjln";
    }

    @Override
    public Icon getIcon() {
        return XJLNIcon.FILE;
    }
}
