package com.bill.hotfixdemo.model;

public class ModifyClass3ModelImpl implements BaseModel {
    private static final String TEST = "why-1";

    @Override
    public String getTitle() {
        return "修改类结构，末尾加参数";
    }

    @Override
    public String getResult() {
        String result = TEST;
//        if (Boolean.valueOf("true")) {
//            result = TEST1;
//        }
        return result;
    }
    /**
     * 测试时请打开此参数，和上面的调用
     */
//    private static final String TEST1 = "why-2";
}