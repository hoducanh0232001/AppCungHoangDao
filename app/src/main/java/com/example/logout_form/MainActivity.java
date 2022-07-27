package com.example.logout_form;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity {
 private TextView textView;
     @Override
    protected int getLayoutID() {
        return R.layout.activity_main; //lấy tên file xml để set giao diện

    }
    private void gotoDetail(){
        Intent intent =new Intent();                                  // khởi tạo
        intent.setClass(this,DetailAcitivity.class);       // set điểm đến của nó (khởi đầu , kết thúc)
        startActivity(intent);                                        //bắt đầu thực hiện lệnh chạy từ main đến detail
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right); // thực hiện 1 animation
        finish(); // kết thúc sự kiện
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_xem_them);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoDetail();
            }
        });

    }
}