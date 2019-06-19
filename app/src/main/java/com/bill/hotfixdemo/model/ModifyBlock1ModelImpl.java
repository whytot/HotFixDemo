package com.bill.hotfixdemo.model;

public class ModifyBlock1ModelImpl implements BaseModel {
    private static String TEST = "000";

    static {
        TEST = "why-1";
    }

    @Override
    public String getTitle() {
        return "修改静态代码块";
    }

    @Override
    public String getResult() {
        return TEST;
    }

}
