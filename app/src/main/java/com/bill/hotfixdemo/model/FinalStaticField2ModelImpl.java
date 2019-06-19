package com.bill.hotfixdemo.model;

/**
 * 修改final static 引用类型验证热替换
 *
 * @author Bill.WangBW
 */
public class FinalStaticField2ModelImpl implements BaseModel {
    private static final Integer TEST = Integer.valueOf(1);

    @Override
    public String getTitle() {
        return "修改final static 引用类型";
    }

    @Override
    public String getResult() {
        return "why-" + TEST;
    }
}
