package com.bill.hotfixdemo.model;

import android.support.annotation.NonNull;

import com.bill.hotfixdemo.bean.A;
import com.bill.hotfixdemo.bean.SimpleT;

/**
 * 修改方法返回值泛型验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethod2ModelImpl implements BaseModel {

    @Override
    public String getTitle() {
        return "修改方法返回值泛型";
    }

    @Override
    public String getResult() {
        SimpleT s = getSimpleT();
        return s.getResult().getResult();
    }

    @NonNull
    private SimpleT<A> getSimpleT() {
        return new SimpleT<>(new A());
    }
}
