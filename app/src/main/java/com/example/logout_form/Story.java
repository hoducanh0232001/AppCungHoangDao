package com.example.logout_form;

import java.io.Serializable;

public class Story implements Serializable {

    private String textViewDetail;
    private String textViewTitleDetail;
    private int temp;

    public Story() {
    }

    public String getTextViewDetail() {
        return textViewDetail;
    }

    public void setTextViewDetail(String textViewDetail) {
        this.textViewDetail = textViewDetail;
    }

    public String getTextViewTitleDetail() {
        return textViewTitleDetail;
    }

    public void setTextViewTitleDetail(String textViewTitleDetail) {
        this.textViewTitleDetail = textViewTitleDetail;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
