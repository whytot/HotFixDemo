package com.bill.hotfixdemo.model;

/**
 * 修改方法返回值泛型验证热替换
 *
 * @author Bill.WangBW
 */
public class ModifyMethod8ModelImpl implements BaseModel {

    @Override
    public String getTitle() {
        return "修改被外部引用的内部类非私有方法";
    }

    @Override
    public String getResult() {
        return new InnerClz().t();
    }

    private class InnerClz {
        String t() {
            return "why-1";
        }
    }
}
