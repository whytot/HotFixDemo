package com.bill.hotfixdemo.model;

import android.util.Log;

import java.lang.reflect.Method;

/**
 * 修改被反射调用的非静态方法验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethod1ModelImpl implements BaseModel {
    private static final String TAG = "sophix.ModifyMethod1ModelImpl";

    @Override
    public String getTitle() {
        return "修改被反射调用的非静态方法";
    }

    @Override
    public String getResult() {
        String result;
        try {
            Class<?> clazz = Class.forName("com.bill.hotfixdemo.utils.ModifyMethod1Helper");
            Method method = clazz.getMethod("getText");
            result = (String) method.invoke(clazz.newInstance());
        } catch (Exception e) {
            result = e.getMessage();
            Log.e(TAG, "error", e);
        }
        return result;
    }
}
