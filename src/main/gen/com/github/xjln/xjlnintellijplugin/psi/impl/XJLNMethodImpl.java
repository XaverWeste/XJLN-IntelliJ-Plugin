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

public class XJLNMethodImpl extends ASTWrapperPsiElement implements XJLNMethod {

  public XJLNMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitMethod(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNCalc getCalc() {
    return findChildByClass(XJLNCalc.class);
  }

  @Override
  @NotNull
  public XJLNDocs getDocs() {
    return findNotNullChildByClass(XJLNDocs.class);
  }

  @Override
  @Nullable
  public XJLNParameterList getParameterList() {
    return findChildByClass(XJLNParameterList.class);
  }

  @Override
  @NotNull
  public List<XJLNStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNStatement.class);
  }

}
