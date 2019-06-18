package com.bill.hotfixdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author Bill.WangBW
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        Toast.makeText(this, R.string.test_text, Toast.LENGTH_LONG).show();
    }

    public void onClick2(View view) {
        XXManager.getInstance().showSomeThing();
    }

    public void onClickQ(View view) {
        Toast.makeText(this, XXManager.getInstance().getSomething(), Toast.LENGTH_LONG).show();
    }
}
