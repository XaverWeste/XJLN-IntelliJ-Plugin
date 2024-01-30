package com.github.xjln.xjlnintellijplugin;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NewXJLNFile extends CreateFileFromTemplateAction {
    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory psiDirectory, @NotNull CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle("New XJLN File");
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory psiDirectory, @NonNls @NotNull String s, @NonNls String s1) {
        return null;
    }

    @Override
    protected PsiFile createFileFromTemplate(String name, FileTemplate template, PsiDirectory dir){
        return super.createFileFromTemplate(name, template, dir);
    }
}
