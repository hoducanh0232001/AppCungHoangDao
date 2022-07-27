package com.example.logout_form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class DetailAcitivity extends BaseActivity{
    private TextView textView2;
    @Override
    protected int getLayoutID() {
        return R.layout.activity_detail; //lấy tên file xml để set giao diện

    }

    private void gobackMainAct(){
        Intent intent = new Intent();
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView2 = (TextView) findViewById(R.id.tv_quay_lai);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gobackMainAct();
            }
        });
    }
}
