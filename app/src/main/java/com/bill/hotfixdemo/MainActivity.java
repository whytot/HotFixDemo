package com.bill.hotfixdemo;

import android.Manifest;
import android.os.Build;
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

    public void onClick3(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION_STORAGE);
        } else {
            TinkerManager.getInstance().onReceiveUpgradePatch();
        }
    }

    public void onClick4(View view) {
        TinkerManager.getInstance().cleanPatch();
    }

    private static final int REQUEST_PERMISSION_STORAGE = 2;

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION_STORAGE) {
            TinkerManager.getInstance().onReceiveUpgradePatch();
        }
    }
}
