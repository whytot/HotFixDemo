package com.bill.hotfixdemo.model;

/**
 * 内部类增加对外部类非私有属性的引用
 *
 * @author Bill.WangBW
 */
public class ModifyMethod6ModelImpl implements BaseModel {
    String text = new String("why-2");

    @Override
    public String getTitle() {
        return "内部类增加对外部类非私有属性的引用";
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
//            t = ModifyMethod6ModelImpl.this.text;
        }
    }
}
