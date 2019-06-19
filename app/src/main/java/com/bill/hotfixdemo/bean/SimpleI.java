package com.bill.hotfixdemo.bean;

public abstract class SimpleI {

    public String getResult() {
        return onCreateText();
    }

    public abstract String onCreateText();
}
