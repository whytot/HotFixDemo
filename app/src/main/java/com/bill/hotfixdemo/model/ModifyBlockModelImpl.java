package com.bill.hotfixdemo.model;

public class ModifyBlockModelImpl implements BaseModel {
    private static String TEST = "000";

    {
        TEST = "why-1";
    }

    @Override
    public String getTitle() {
        return "修改非静态代码块";
    }

    @Override
    public String getResult() {
        return TEST;
    }

}
