package com.bill.hotfixdemo.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bill.hotfixdemo.XXManager;
import com.bill.hotfixdemo.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {
    private List<BaseModel> data;

    public SimpleAdapter() {
        data = new ArrayList<>();
    }

    public void reload() {
        if (data.isEmpty()) {
            data = XXManager.getInstance().getBaseModels();
        } else {
            data.clear();
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.two_line_list_item, viewGroup, false);
        return new SimpleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder simpleViewHolder, int i) {
        simpleViewHolder.title.setText(data.get(i).getTitle());
        simpleViewHolder.content.setText("\t" + data.get(i).getResult());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView content;

        SimpleViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(android.R.id.text1);
            content = itemView.findViewById(android.R.id.text2);
        }
    }
}
