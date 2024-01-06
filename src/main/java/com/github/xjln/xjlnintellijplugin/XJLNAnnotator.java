package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.*;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNArgumentImpl;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNInterfaceImpl;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNTypeImpl;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNUseImpl;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(element instanceof XJLNFile) {
            ArrayList<String> classes = findClasses((XJLNFile) element, holder);
            HashMap<String, String> uses = checkUses((XJLNFile) element, holder, classes);
            checkTypes((XJLNFile) element, holder);
            checkInterfaces((XJLNFile) element, holder, uses, classes);
        }
    }

    private void checkInterfaces(XJLNFile file, AnnotationHolder holder, HashMap<String, String> uses, ArrayList<String> classes){
        for(PsiElement element:file.getChildren()) {
            if (element instanceof XJLNArgumentImpl && element.getChildren()[0] instanceof XJLNInterfaceImpl) {
                XJLNInterfaceImpl clazz = (XJLNInterfaceImpl) element.getChildren()[0];

                ArrayList<String> methods = new ArrayList<>();
                for(XJLNAbstractMethod method:clazz.getAbstractMethodList()){
                    if(methods.contains(method.getIdentifier().getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, "Method is already defined").range(method).create();
                    else
                        methods.add(method.getIdentifier().getText());
                }
            }
        }
    }

    private void checkTypes(XJLNFile file, AnnotationHolder holder){
        for(PsiElement element:file.getChildren()) {
            if (element instanceof XJLNArgumentImpl && element.getChildren()[0] instanceof XJLNTypeImpl) {
                XJLNTypeImpl type = (XJLNTypeImpl) element.getChildren()[0];
                ArrayList<String> values = new ArrayList<>();

                for(XJLNTypeValue value:type.getTypeValueList()){
                    if(values.contains(value.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, "Value is already defined").range(value).create();
                    else
                        values.add(value.getText());
                }
            }
        }
    }

    private HashMap<String, String> checkUses(XJLNFile file, AnnotationHolder holder, ArrayList<String> classes){
        ArrayList<XJLNUseImpl> statements = new ArrayList<>();
        for(PsiElement element:file.getChildren())
            if(element instanceof XJLNArgumentImpl && element.getChildren()[0] instanceof XJLNUseImpl)
                statements.add((XJLNUseImpl) element.getChildren()[0]);

        HashMap<String, String> uses = new HashMap<>();

        for(XJLNUseImpl statement:statements){
            if(statement.getMultiUse() != null){
                List<XJLNClassName> names = statement.getMultiUse().getClassNameList();
                XJLNPath path = statement.getMultiUse().getPath();

                for(XJLNClassName name:names){
                    if(classes.contains(name.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, "Class is already defined").range(name).create();
                    else if(uses.containsKey(name.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, name.getText() + " is already defined").range(name).create();

                    String className = path.getText() + "/" + name.getText();

                    if(uses.containsValue(className))
                        holder.newAnnotation(HighlightSeverity.WEAK_WARNING, className + " is already been used").range(name).create();

                    uses.put(name.getText(), className);

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
                    if(classes.contains(alias.getText()))
                        holder.newAnnotation(HighlightSeverity.WARNING, "Class is already defined").range(alias).create();
                    else if(uses.containsKey(alias.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, alias.getText() + " is already defined").range(alias).create();

                    nameString = alias.getText();
                }else
                    if(classes.contains(nameString))
                        holder.newAnnotation(HighlightSeverity.WARNING, "Class is already defined").range(name == null ? path : name).create();
                    if(uses.containsKey(nameString))
                        holder.newAnnotation(HighlightSeverity.ERROR, nameString + " is already defined").range(name == null ? path : name).create();

                if(uses.containsValue(pathString))
                    holder.newAnnotation(HighlightSeverity.WEAK_WARNING, pathString + " is already been used").range(path).create();

                uses.put(nameString, pathString);

                if(classNotExist(pathString))
                    holder.newAnnotation(HighlightSeverity.ERROR, pathString + " did not exist").range(name == null ? path : name).create();
            }
        }

        return uses;
    }

    private ArrayList<String> findClasses(XJLNFile file, AnnotationHolder holder){
        ArrayList<String> classes = new ArrayList<>();

        for(PsiElement element : file.getChildren()){
            if (element instanceof XJLNArgumentImpl) {
                PsiElement first = element.getChildren()[0];

                XJLNClazzName name = null;
                if(first instanceof XJLNClazz)
                    name = ((XJLNClazz) first).getClazzName();
                else if(first instanceof XJLNType)
                    name = ((XJLNType) first).getClazzName();
                else if(first instanceof XJLNData)
                    name = ((XJLNData) first).getClazzName();
                else if(first instanceof XJLNInterface)
                    name = ((XJLNInterface) first).getClazzName();

                if(name != null) {
                    if (classes.contains(name.getText()))
                        holder.newAnnotation(HighlightSeverity.ERROR, "Class is already defined").range(name).create();
                    else
                        classes.add(name.getText());
                }
            }
        }

        return classes;
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
