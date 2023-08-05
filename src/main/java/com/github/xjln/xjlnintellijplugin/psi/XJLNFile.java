package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.XJLNFileType;
import com.github.xjln.xjlnintellijplugin.XJLNLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class XJLNFile extends PsiFileBase {

    public XJLNFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, XJLNLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return XJLNFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "XJLN File";
    }
}
