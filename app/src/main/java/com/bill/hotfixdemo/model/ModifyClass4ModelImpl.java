package com.bill.hotfixdemo.model;

import com.bill.hotfixdemo.bean.SimpleI;
import com.bill.hotfixdemo.bean.SimpleTT;

public class ModifyClass4ModelImpl implements BaseModel {
    private static final String TEST = "why-1";

    @Override
    public String getTitle() {
        return "中间增加内部类";
    }

    @Override
    public String getResult() {
        String text;
        text = new SimpleI() {
            @Override
            public String onCreateText() {
                return "why-1";
            }
        }.getResult();
//        if (Boolean.valueOf("true")) {
//            text = new SimpleI() {
//                @Override
//                public String onCreateText() {
//                    return "why-1";
//                }
//            }.getResult();
//        }
        if (Boolean.valueOf("true")) {
            text = new SimpleI() {
                @Override
                public String onCreateText() {
                    return "why-1";
                }
            }.getResult();
        }
        return text;
    }
}
