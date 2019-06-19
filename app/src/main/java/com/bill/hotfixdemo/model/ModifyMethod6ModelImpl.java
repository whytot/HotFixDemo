package com.bill.hotfixdemo.model;

/**
 * 修改方法返回值泛型验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethod6ModelImpl implements BaseModel {
    String text = "why-1";

    @Override
    public String getTitle() {
        return "修改被内部引用的外部类非私有字段";
    }

    @Override
    public String getResult() {
        return new InnerClz().t;
    }

    private class InnerClz {
        String t = ModifyMethod6ModelImpl.this.text;
    }
}
