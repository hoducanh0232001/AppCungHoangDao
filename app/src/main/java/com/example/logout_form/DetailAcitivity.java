package com.example.logout_form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class DetailAcitivity extends BaseActivity{
    private TextView textView2 , textViewDetail, textViewDescription;
    ImageView imageViewDetail ;
    @Override
    protected int getLayoutID() {
        return R.layout.activity_detail; //lấy tên file xml để set giao diện

    }

    private void gobackMainAct(){
        Intent intent = new Intent();
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        finish();
    }

    @Override
    protected void initView() {

        Intent intent = getIntent();
       // String a = intent.getStringExtra("hoducanh"); // lấy dữ liệu từ key bên main
        Bundle bundle = getIntent().getExtras(); // gói dữ liệu thay cho intent
       String idItextViewDescription = bundle.getString("key_1"); //nhận dữ liệu từ key bên main
       // Log.i(TAG, idIvDetail + "");
         String idtextViewDetail = bundle.getString("key_2");
         int idimageViewDetail = bundle.getInt("key_3");
      //  Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
        //Log.i("hoducanh", "initView: "+a);
        textViewDetail = (TextView) findViewById(R.id.tv_title_detail_m002);
        textViewDescription = (TextView) findViewById(R.id.tv_detail_m002);
        imageViewDetail = (ImageView) findViewById(R.id.iv_detail_m002);

        textViewDescription.setText(idItextViewDescription); // key_1
        textViewDetail.setText(idtextViewDetail);     //key_2
        imageViewDetail.setBackgroundResource(idimageViewDetail);   //key_3

        textView2 = (TextView) findViewById(R.id.tv_quay_lai);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gobackMainAct();
            }
        });

    }
}
