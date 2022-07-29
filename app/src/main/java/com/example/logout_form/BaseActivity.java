package com.example.logout_form;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    // tạo sự kiện
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        initView();
    }
    //tìm id
    @Override
    public <T extends View> T findViewById(int id) {
        return findViewById(id, null);
    }

    protected <T extends View> T findViewById(int id, BaseActivity baseAct) {
        View v = super.findViewById(id);
        if (baseAct != null) {
            v.setOnClickListener(baseAct);
        }
        return super.findViewById(id);
    }

    protected void initView() {
        //do nothing
    }

    protected abstract int getLayoutID();

    @Override
    public void onClick(View view) {
    }

}

