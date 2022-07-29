package com.example.logout_form;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

public class SplashActivity extends BaseActivity {
    @Override
    protected int getLayoutID() {
        return R.layout.activity_splash;
    }
    // ánh xạ hành động thực hiện trong activity
    @Override
    protected void initView() { //delay để chuyển từ splash sang main activity
        new Handler().postDelayed(new Runnable() {     //xét độ delay (đơn vị ms)
            @Override
            public void run() {
                gotoMainAct();
            }
        },5000);

    }

    private void gotoMainAct() {
        Intent intent =new Intent();                                  // khởi tạo
        intent.setClass(this,MainActivity.class);       // set điểm đến của nó (khởi đầu , kết thúc)
        startActivity(intent);                                        //bắt đầu thực hiện lệnh chạy từ splah đến main
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right); // thực hiện 1 animation
        finish(); // kết thúc sự kiện
    }
}
