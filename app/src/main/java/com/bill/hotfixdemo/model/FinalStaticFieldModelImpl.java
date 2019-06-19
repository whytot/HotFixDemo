package com.bill.hotfixdemo.model;

/**
 * 修改final static 原始类型验证热替换
 *
 * @author Bill.WangBW
 */
public class FinalStaticFieldModelImpl implements BaseModel {
    private static final int TEST = 1;

    @Override
    public String getTitle() {
        return "修改final static 原始类型";
    }

    @Override
    public String getResult() {
        return "why-" + TEST;
    }
}
