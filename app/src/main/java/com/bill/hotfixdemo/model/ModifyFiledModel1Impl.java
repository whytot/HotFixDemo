package com.bill.hotfixdemo.model;

public class ModifyFiledModel1Impl implements BaseModel {
    private String TEST = new String("why-1");

    @Override
    public String getTitle() {
        return "修改非static参数";
    }

    @Override
    public String getResult() {
        return TEST;
    }
}
