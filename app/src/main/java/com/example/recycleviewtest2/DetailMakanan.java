package com.example.recycleviewtest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {


    TextView tvNamaMakananDetail,tvHargaMakananDetail,tvDeskripsiMakananDetail;
    ImageView ivMakananDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvHargaMakananDetail = findViewById(R.id.tvHargaMakananDetail);
        ivMakananDetail = findViewById(R.id.ivMakananDetail);
        tvDeskripsiMakananDetail = findViewById(R.id.tvDeskripsiMakananDetail);


        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("nama");
        String hargaMakanan = intent.getStringExtra("harga");
        int gambarResId = intent.getIntExtra("gambar", 0);
        String deskMakanan = intent.getStringExtra("desk");


        tvNamaMakananDetail.setText(namaMakanan);
        tvHargaMakananDetail.setText(hargaMakanan);
        ivMakananDetail.setImageResource(gambarResId);
        tvDeskripsiMakananDetail.setText(deskMakanan);




        }
    };
