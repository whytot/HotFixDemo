package com.bill.hotfixdemo.model;

/**
 * 内部类增加对外部类私有属性的引用
 *
 * @author Bill.WangBW
 */
public class ModifyMethod5ModelImpl implements BaseModel {
    private String text = new String("why-2");

    @Override
    public String getTitle() {
        return "内部类增加对外部类私有属性的引用";
    }

    @Override
    public String getResult() {
        return new InnerClz().t;
    }

    private class InnerClz {
        InnerClz() {
            modifyT();
        }

        String t = new String("why-1");

        void modifyT() {
//            t = ModifyMethod5ModelImpl.this.text;
        }
    }
}
