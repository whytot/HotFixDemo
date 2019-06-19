package com.bill.hotfixdemo.bean;

public class SimpleT<T extends BaseBean> {
    protected T mBean;

    public SimpleT(T bean) {
        this.mBean = bean;
    }

    public T getResult() {
        return mBean;
    }
}
