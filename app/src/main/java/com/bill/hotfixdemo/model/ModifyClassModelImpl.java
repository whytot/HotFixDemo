package com.bill.hotfixdemo.model;

public class ModifyClassModelImpl implements BaseModel {
    private static final String TEST = "why-1";
    private static final String TEST1 = "why-2";

    @Override
    public String getTitle() {
        return "修改类结构，中间加方法";
    }

    @Override
    public String getResult() {
        String result = getResult1();
//        if (Boolean.valueOf("true")) {
//            result = getResult0();
//        }
        return result;
    }

    /**
     * 测试时请打开此方法，和上面的调用
     */
//    private String getResult0() {
//        return TEST1;
//    }
    private String getResult1() {
        return TEST;
    }
}
