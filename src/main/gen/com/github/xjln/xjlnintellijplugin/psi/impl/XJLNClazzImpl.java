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

public class XJLNClazzImpl extends ASTWrapperPsiElement implements XJLNClazz {

  public XJLNClazzImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitClazz(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XJLNClassArgument> getClassArgumentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNClassArgument.class);
  }

  @Override
  @Nullable
  public XJLNDocs getDocs() {
    return findChildByClass(XJLNDocs.class);
  }

  @Override
  @Nullable
  public XJLNGenerics getGenerics() {
    return findChildByClass(XJLNGenerics.class);
  }

  @Override
  @NotNull
  public XJLNIdentifier getIdentifier() {
    return findNotNullChildByClass(XJLNIdentifier.class);
  }

  @Override
  @Nullable
  public XJLNInit getInit() {
    return findChildByClass(XJLNInit.class);
  }

  @Override
  @NotNull
  public List<XJLNObjectCreation> getObjectCreationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNObjectCreation.class);
  }

  @Override
  @NotNull
  public XJLNParameterList getParameterList() {
    return findNotNullChildByClass(XJLNParameterList.class);
  }

}
