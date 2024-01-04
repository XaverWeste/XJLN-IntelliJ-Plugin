// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.xjln.xjlnintellijplugin.psi.*;

public class XJLNInterfaceImpl extends ASTWrapperPsiElement implements XJLNInterface {

  public XJLNInterfaceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitInterface(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XJLNAbstractMethod> getAbstractMethodList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNAbstractMethod.class);
  }

  @Override
  @Nullable
  public XJLNAccessModifier getAccessModifier() {
    return findChildByClass(XJLNAccessModifier.class);
  }

  @Override
  @NotNull
  public XJLNClazzName getClazzName() {
    return findNotNullChildByClass(XJLNClazzName.class);
  }

}
