package com.github.xjln.xjlnintellijplugin;

import com.intellij.lang.Language;

public class XJLNLanguage extends Language {

    public static final XJLNLanguage INSTANCE = new XJLNLanguage();

    private XJLNLanguage() {
        super("XJLN");
    }
}
