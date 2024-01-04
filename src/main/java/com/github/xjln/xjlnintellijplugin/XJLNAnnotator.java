package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.*;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNArgumentImpl;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNUseImpl;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(element instanceof XJLNFile)
            checkUses((XJLNFile) element, holder);
    }

    private void checkUses(XJLNFile file, AnnotationHolder holder){
        ArrayList<XJLNUseImpl> statements = new ArrayList<>();
        for(PsiElement element:file.getChildren())
            if(element instanceof XJLNArgumentImpl && element.getChildren()[0] instanceof XJLNUseImpl)
                statements.add((XJLNUseImpl) element.getChildren()[0]);

        ArrayList<String> aliases = new ArrayList<>();
        ArrayList<String> uses = new ArrayList<>();

        for(XJLNUseImpl statement:statements){
            if(statement.getMultiUse() != null){
                List<XJLNClassName> names = statement.getMultiUse().getClassNameList();
                XJLNPath path = statement.getMultiUse().getPath();

                for(XJLNClassName name:names){
                    if(aliases.contains(name.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, name.getText() + " is already defined").range(name).create();
                    else
                        aliases.add(name.getText());

                    String className = path.getText() + "/" + name.getText();

                    if(uses.contains(className))
                        holder.newAnnotation(HighlightSeverity.WEAK_WARNING, className + " is already been used").range(name).create();
                    else
                        uses.add(className);

                    if(classNotExist(className))
                        holder.newAnnotation(HighlightSeverity.ERROR, className + " did not exist").range(name).create();
                }
            }else{
                assert statement.getSingleUse() != null;

                XJLNPath path = statement.getSingleUse().getPath();
                XJLNClassName name = statement.getSingleUse().getClassName();
                XJLNAlias alias = statement.getSingleUse().getAlias();

                String nameString = name == null ? null : name.getText();
                String pathString = path.getText();

                if(nameString == null){
                    String[] args = pathString.split("/");
                    nameString = args[args.length - 1];
                }else
                    pathString = pathString + "/" + nameString;

                if(alias != null){
                    if(aliases.contains(alias.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, alias.getText() + " is already defined").range(alias).create();
                    else
                        aliases.add(alias.getText());
                }else{
                    if(aliases.contains(nameString))
                        holder.newAnnotation(HighlightSeverity.ERROR, nameString + " is already defined").range(name == null ? path : name).create();
                    else
                        aliases.add(nameString);
                }

                if(uses.contains(pathString))
                    holder.newAnnotation(HighlightSeverity.WEAK_WARNING, pathString + " is already been used").range(path).create();
                else
                    uses.add(pathString);

                if(classNotExist(pathString))
                    holder.newAnnotation(HighlightSeverity.ERROR, pathString + " did not exist").range(name == null ? path : name).create();
            }
        }
    }

    private boolean classNotExist(String name){
        try{
            Class.forName(name.replace("/", "."));
        }catch (ClassNotFoundException ignored){
            return true;
        }

        return false;
    }
}
