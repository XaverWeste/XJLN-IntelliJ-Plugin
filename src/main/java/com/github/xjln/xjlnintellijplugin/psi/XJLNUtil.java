package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.XJLNFileType;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNPsiImplUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class XJLNUtil {

    public static List<XJLNEnum> findEnums(Project project, String key) {
        List<XJLNEnum> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(XJLNFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            XJLNFile simpleFile = (XJLNFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                XJLNEnum[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, XJLNEnum.class);
                if (properties != null)
                    for (XJLNEnum property : properties)
                        if (key.equals(XJLNPsiImplUtil.getEnumName(property).getText()))
                            result.add(property);
            }
        }
        return result;
    }

    public static List<XJLNEnum> findEnums(Project project) {
        List<XJLNEnum> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(XJLNFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            XJLNFile simpleFile = (XJLNFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                XJLNEnum[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, XJLNEnum.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }
}
