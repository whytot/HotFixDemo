package com.bill.hotfixdemo.model;

/**
 * 修改非静态方法验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethodModelImpl implements BaseModel {
    @Override
    public String getTitle() {
        return "修改非静态方法";
    }

    /**
     * 由于此处比较简单，直接修改此方法的返回值
     */
    @Override
    public String getResult() {
        return "why-1";
    }
}
