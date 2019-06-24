package com.bill.hotfixdemo.model;

public class ModifyFiledModel2Impl implements BaseModel {
    private String TEST = "why-1";

    @Override
    public String getTitle() {
        return "修改非static参数(非引用的String)";
    }

    @Override
    public String getResult() {
        return TEST;
    }
}
