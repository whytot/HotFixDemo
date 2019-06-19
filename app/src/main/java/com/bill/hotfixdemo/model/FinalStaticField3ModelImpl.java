package com.bill.hotfixdemo.model;

/**
 * 修改final static 引用类型的String验证热替换
 *
 * @author Bill.WangBW
 */
public class FinalStaticField3ModelImpl implements BaseModel {
    private static final String TEST = new String("why-1");

    @Override
    public String getTitle() {
        return "修改final static 引用类型的String";
    }

    @Override
    public String getResult() {
        return TEST;
    }
}
