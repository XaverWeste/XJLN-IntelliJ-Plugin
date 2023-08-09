package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.XJLNFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;

public class XJLNElementFactory {

    public static XJLNFile createFile(Project project, String text) {
        String name = "dummy.xjln";
        return (XJLNFile) PsiFileFactory.getInstance(project).createFileFromText(name, XJLNFileType.INSTANCE, text);
    }
}
