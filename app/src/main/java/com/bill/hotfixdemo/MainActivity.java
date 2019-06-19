package com.bill.hotfixdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bill.hotfixdemo.ui.SimpleAdapter;
import com.taobao.sophix.SophixManager;

/**
 * @author Bill.WangBW
 */
public class MainActivity extends AppCompatActivity {
    private SimpleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mAdapter = new SimpleAdapter();
        recyclerView.setAdapter(mAdapter);
    }

    public void onClick3(View view) {
//        SophixManager.getInstance().queryAndLoadNewPatch();
    }

    public void onClick4(View view) {
//        SophixManager.getInstance().cleanPatches();
    }
}
