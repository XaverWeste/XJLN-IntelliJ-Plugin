package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.XJLNFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;

public class XJLNElementFactory {
    public static XJLNProperty createProperty(Project project, String name) {
        final XJLNFile file = createFile(project, name);
        return (XJLNProperty) file.getFirstChild();
    }

    public static XJLNFile createFile(Project project, String text) {
        String name = "dummy.xjln";
        return (XJLNFile) PsiFileFactory.getInstance(project).createFileFromText(name, XJLNFileType.INSTANCE, text);
    }

    public static XJLNProperty createProperty(Project project, String name, String value) {
        final XJLNFile file = createFile(project, name + " = " + value);
        return (XJLNProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final XJLNFile file = createFile(project, "\n");
        return file.getFirstChild();
    }
}
