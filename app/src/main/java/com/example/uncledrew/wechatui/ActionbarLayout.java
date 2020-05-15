package com.example.uncledrew.wechatui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ActionbarLayout extends LinearLayout {
    public ActionbarLayout(Context context,AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.my_actionbar,this);
        ImageView search = findViewById(R.id.search_bar);
        ImageView add = findViewById(R.id.add_bar);
        search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"search",Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"add",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
