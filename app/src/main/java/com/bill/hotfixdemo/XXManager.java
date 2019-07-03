package com.bill.hotfixdemo;

import android.widget.Toast;

/**
 * @author Bill.WangBW
 */
public class XXManager {

    private static XXManager xXManagerInstance;

    private XXManager() {
    }

    static synchronized XXManager getInstance() {
        if (xXManagerInstance == null) {
            xXManagerInstance = new XXManager();
        }
        return xXManagerInstance;
    }

    String getSomething() {
        return new InnerClass("s1", "s2").s1;
    }

    void showSomeThing() {
        showSomeThing1();
    }

    private void showSomeThing1() {
        Toast.makeText(SampleApplicationLike.getApplicationInstance().getApplication(), "XXManager.showSomeThing1", Toast.LENGTH_LONG).show();
    }

    private void showSomeThing2() {
        Toast.makeText(SampleApplicationLike.getApplicationInstance().getApplication(), "XXManager.showSomeThing2", Toast.LENGTH_LONG).show();
    }

    class InnerClass {
        private String s1;
        private String s2;

        private InnerClass(String s1, String s2) {
            this.s1 = s1;
            this.s2 = s2;
        }
    }
}
