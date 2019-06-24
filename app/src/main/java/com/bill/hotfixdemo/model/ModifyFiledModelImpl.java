package com.bill.hotfixdemo.model;

public class ModifyFiledModelImpl implements BaseModel {
    private static String TEST = new String("why-1");

    @Override
    public String getTitle() {
        return "修改static参数";
    }

    @Override
    public String getResult() {
        return TEST;
    }
}
