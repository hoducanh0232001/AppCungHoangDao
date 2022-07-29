package com.example.logout_form;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

public class MainActivity extends BaseActivity {
    private int temp;
 private TextView textView , textViewTitleDetail,textViewDetail;
 private ImageView  imageViewDetail, imageViewThienBinh,imageViewSongNgu,imageViewMaKet, imageViewBaoBinh, imageViewCuGiai, imageViewXuNu
         ,imageViewNhanMa, imageViewSuTu, imageViewKimNguu, imageViewSongTu, imageViewBachDuong, imageViewBoCap;


        Drawable imgThienBinh, imgSongNgu, imgMaKet, imgBaoBinh, imgCuGiai, imgXuNu, imgNhanMa, imgSuTu, imgKimNguu, imgSongTu, imgBachDuong, imgBoCap;
     @Override
    protected int getLayoutID() {
        return R.layout.activity_main; //lấy tên file xml để set giao diện

    }
    private void gotoDetail(){
        Intent intent =new Intent();                                  // khởi tạo
        intent.setClass(this,DetailAcitivity.class);       // set điểm đến của nó (khởi đầu , kết thúc)
      //  intent.putExtra("hoducanh","Hello");            //set key và value
        Bundle bundle = new Bundle();               //dùng bundle tăng bảo mật hơn
        bundle.putString("key_1", textViewDetail.getText().toString());  // set key và value
        bundle.putString("key_2", textViewTitleDetail.getText().toString());
        bundle.putInt("key_3",temp);
        intent.putExtras(bundle); // đóng gói r gửi
        startActivity(intent);                                        //bắt đầu thực hiện lệnh chạy từ main đến detail
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right); // thực hiện 1 animation
        finish(); // kết thúc sự kiện
    }

    @Override
    protected void initView() {
         textViewTitleDetail=(TextView) findViewById(R.id.tv_title_detail);
         textViewDetail= (TextView) findViewById(R.id.tv_detail);
         imageViewDetail= (ImageView) findViewById(R.id.iv_detail);

                // CUNG THIEN BINH
      //  imgThienBinh = AppCompatResources.getDrawable(this, R.drawable.ic_thien_binh);
         imageViewThienBinh = (ImageView) findViewById(R.id.iv_thien_binh);
         imageViewThienBinh.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 temp = R.drawable.ic_thien_binh;
                 textViewTitleDetail.setText(R.string.thien_binh_title1);
                 textViewDetail.setText(R.string.thien_binh_text);
              //   imageViewDetail.setImageDrawable(imgThienBinh);
                 imageViewDetail.setBackgroundResource(R.drawable.ic_thien_binh);
             }
         });
                //CUNG SONG NGU
                temp = R.drawable.ic_song_ngu;
         imgSongNgu = AppCompatResources.getDrawable(this, R.drawable.ic_song_ngu);
         imageViewSongNgu =(ImageView) findViewById(R.id.iv_song_ngu);
         imageViewSongNgu.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 textViewTitleDetail.setText(R.string.song_ngu_title1);
                 textViewDetail.setText(R.string.song_ngu_text);
                 imageViewDetail.setImageDrawable(imgSongNgu);
             }
         });
                // CUNG MA KET
        temp = R.drawable.ic_ma_ket;
        imgMaKet = AppCompatResources.getDrawable(this, R.drawable.ic_ma_ket);
        imageViewMaKet = (ImageView) findViewById(R.id.iv_ma_ket);
        imageViewMaKet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.ma_ket_title1);
                textViewDetail.setText(R.string.ma_ket_text);
                imageViewDetail.setImageDrawable(imgMaKet);
            }
        });
                // CUNG BAO BINH
        temp = R.drawable.ic_bao_binh;
        imgBaoBinh = AppCompatResources.getDrawable(this, R.drawable.ic_bao_binh);
        imageViewBaoBinh = (ImageView) findViewById(R.id.iv_bao_binh);
        imageViewBaoBinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.bao_binh_title1);
                textViewDetail.setText(R.string.bao_binh_text);
                imageViewDetail.setImageDrawable(imgBaoBinh);
            }
        });
            //CUNG CU GIAI
        temp = R.drawable.ic_cu_giai;
        imgCuGiai = AppCompatResources.getDrawable(this, R.drawable.ic_cu_giai);
        imageViewCuGiai = (ImageView) findViewById(R.id.iv_cu_giai);
        imageViewCuGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.cu_giai_title1);
                textViewDetail.setText(R.string.cu_giai_text);
                imageViewDetail.setImageDrawable(imgCuGiai);
            }
        });
        // CUNG XU NU
        temp = R.drawable.ic_xu_nu;
        imgXuNu = AppCompatResources.getDrawable(this, R.drawable.ic_xu_nu);
        imageViewXuNu = (ImageView) findViewById(R.id.iv_xu_nu);
        imageViewXuNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.xu_nu_title1);
                textViewDetail.setText(R.string.xu_nu_text);
                imageViewDetail.setImageDrawable(imgXuNu);
            }
        });
                //CUNG NHAN MA
        temp = R.drawable.ic_nhan_ma;
        imgNhanMa = AppCompatResources.getDrawable(this, R.drawable.ic_nhan_ma);
        imageViewNhanMa = (ImageView) findViewById(R.id.iv_nhan_ma);
        imageViewNhanMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.nhan_ma_title1);
                textViewDetail.setText(R.string.nhan_ma_text);
                imageViewDetail.setImageDrawable(imgNhanMa);
            }
        });

            // CUNG SU TU
        temp = R.drawable.ic_su_tu;
        imgSuTu = AppCompatResources.getDrawable(this, R.drawable.ic_su_tu);
        imageViewSuTu = (ImageView) findViewById(R.id.iv_su_tu);
        imageViewSuTu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.su_tu_title1);
                textViewDetail.setText(R.string.su_tu_text);
                imageViewDetail.setImageDrawable(imgSuTu);
            }
        });
            //CUNG KIM NGUU
        temp = R.drawable.ic_kim_nguu;
        imgKimNguu = AppCompatResources.getDrawable(this, R.drawable.ic_kim_nguu);
        imageViewKimNguu = (ImageView) findViewById(R.id.iv_kim_nguu);
        imageViewKimNguu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.kim_nguu_title1);
                textViewDetail.setText(R.string.kim_nguu_text);
                imageViewDetail.setImageDrawable(imgKimNguu);
            }
        });

        //CUNG SONG TU
        temp = R .drawable.ic_song_tu;
        imgSongTu = AppCompatResources.getDrawable(this, R.drawable.ic_song_tu);
        imageViewSongTu = (ImageView) findViewById(R.id.iv_song_tu);
        imageViewSongTu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.song_tu_title1);
                textViewDetail.setText(R.string.song_tu_text);
                imageViewDetail.setImageDrawable(imgSongTu);
            }
        });
        //CUNG BACH DUONG
        temp = R.drawable.ic_bach_duong;
        imgBachDuong = AppCompatResources.getDrawable(this, R.drawable.ic_bach_duong);
        imageViewBachDuong = (ImageView) findViewById(R.id.iv_bach_duong);
        imageViewBachDuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.bach_duong_title1);
                textViewDetail.setText(R.string.bach_duong_text);
                imageViewDetail.setImageDrawable(imgBachDuong);
            }
        });
        // CUNG BO CAP
        temp = R.drawable.ic_bocap;
        imgBoCap = AppCompatResources.getDrawable(this, R.drawable.ic_bocap);
        imageViewBoCap = (ImageView) findViewById(R.id.iv_bo_cap);
        imageViewBoCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewTitleDetail.setText(R.string.bo_cap_title1);
                textViewDetail.setText(R.string.bo_cap_text);
                imageViewDetail.setImageDrawable(imgBoCap);
            }
        });

        // BUTTON XEM THEM
        textView = (TextView) findViewById(R.id.tv_xem_them);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoDetail();
            }
        });
    }

}