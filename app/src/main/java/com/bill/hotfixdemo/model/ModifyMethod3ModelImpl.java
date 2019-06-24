package com.bill.hotfixdemo.model;

import android.util.Log;
import android.widget.Toast;

import com.bill.hotfixdemo.App;

/**
 * 外部类增加对内部类私有属性的引用
 *
 * @author Bill.WangBW
 */
public class ModifyMethod3ModelImpl implements BaseModel {

    @Override
    public String getTitle() {
        return "外部类增加对内部类私有属性的引用";
    }

    @Override
    public String getResult() {
        InnerClz innerClz = new InnerClz();
//        return innerClz.t;
        return "why-1";
    }

    class InnerClz {
        static final String TAG = "sophix.InnerClz";

        InnerClz() {
            showT();
        }

        private String t = new String("why-2");

        void showT() {
            Log.e(TAG, t);
        }
    }
}
