package com.bill.hotfixdemo.model;

/**
 * 修改方法返回值泛型验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethod9ModelImpl implements BaseModel {
    private String text() {
        return "why-1";
    }

    @Override
    public String getTitle() {
        return "修改被内部引用的外部类私有方法";
    }

    @Override
    public String getResult() {
        return new InnerClz().t;
    }

    private class InnerClz {
        String t = ModifyMethod9ModelImpl.this.text();
    }
}
