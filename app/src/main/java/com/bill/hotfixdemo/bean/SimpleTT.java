package com.bill.hotfixdemo.bean;

public class SimpleTT extends SimpleT<A> {
    public SimpleTT() {
        super(new A());
    }

    @Override
    public A getResult() {
        return mBean;
    }
}
