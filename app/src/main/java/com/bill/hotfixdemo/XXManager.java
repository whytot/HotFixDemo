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

    void showSomeThing() {
        showSomeThing1();
    }

    private void showSomeThing1() {
        Toast.makeText(App.getInstance(), "XXManager.showSomeThing1", Toast.LENGTH_LONG).show();
    }

    private void showSomeThing2() {
        Toast.makeText(App.getInstance(), "XXManager.showSomeThing2", Toast.LENGTH_LONG).show();
    }
}
