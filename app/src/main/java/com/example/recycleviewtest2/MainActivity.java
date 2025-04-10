package com.example.recycleviewtest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  AdapterMakanan.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            ArrayList<MakananModel> ListMakanan = new ArrayList<>();
            ListMakanan.add(new MakananModel("Ayam Bakar", "15.000",R.drawable.ayambakar,"Ayam bakar adalah hidangan khas Indonesia yang dibuat dengan ayam yang dimarinasi dalam bumbu rempah khas, kemudian dipanggang atau dibakar hingga berwarna keemasan dan memiliki aroma yang menggugah selera. Bumbunya biasanya terdiri dari campuran kecap manis, bawang putih, bawang merah, ketumbar, kunyit, jahe, dan serai, yang meresap ke dalam daging sehingga menghasilkan cita rasa gurih, manis, dan sedikit smokey. Ayam bakar sering disajikan dengan nasi hangat, sambal, lalapan segar, serta tambahan seperti tahu dan tempe goreng, menjadikannya hidangan yang lezat dan menggugah selera."));
            ListMakanan.add(new MakananModel("Nasi Goreng", "16.000", R.drawable.nasigoreng,"Nasi goreng adalah hidangan khas Indonesia yang terdiri dari nasi yang digoreng dengan bumbu seperti bawang putih, bawang merah, kecap manis, garam, dan lada, serta sering ditambahkan dengan telur, ayam, udang, atau daging lainnya. Rasanya yang gurih, sedikit manis, dan aromanya yang khas membuat nasi goreng menjadi makanan favorit banyak orang. Hidangan ini biasanya disajikan dengan acar, kerupuk, dan irisan mentimun atau tomat untuk menambah kesegaran. Dengan variasi yang beragam di setiap daerah, nasi goreng menjadi salah satu kuliner paling populer di Indonesia dan dunia"));
            ListMakanan.add(new MakananModel("Sop Daging", "20.000", R.drawable.sop,"Sop daging adalah hidangan berkuah yang terbuat dari potongan daging sapi yang dimasak hingga empuk dengan berbagai rempah seperti bawang putih, bawang merah, merica, dan pala. Kuahnya yang bening dan gurih memberikan cita rasa yang lezat dan menyegarkan. Biasanya, sop daging disajikan dengan tambahan sayuran seperti wortel, kentang, dan daun seledri, serta ditaburi bawang goreng untuk menambah aroma dan rasa yang khas."));
            ListMakanan.add(new MakananModel("Rendang","20.000",R.drawable.rendang,"Rendang adalah masakan khas Minangkabau, Indonesia, yang terkenal dengan cita rasanya yang kaya dan gurih. Hidangan ini terbuat dari daging sapi yang dimasak dalam santan dan bumbu rempah-rempah seperti serai, lengkuas, cabai, dan kunyit dalam waktu yang lama hingga kuahnya mengering dan meresap ke dalam daging. Proses memasaknya yang lambat menghasilkan tekstur daging yang empuk dan bumbu yang meresap sempurna. Rendang sering disajikan dengan nasi hangat dan menjadi salah satu hidangan yang diakui sebagai makanan terenak di dunia."));
            ListMakanan.add(new MakananModel("Es Teh","3.000",R.drawable.esteh,"Es teh adalah minuman sederhana yang menyegarkan, terbuat dari teh yang diseduh lalu didinginkan dengan tambahan es batu. Minuman ini bisa dinikmati dalam berbagai varian, seperti es teh manis dengan gula atau es teh tawar tanpa pemanis. Rasanya yang segar dan ringan membuat es teh menjadi minuman favorit untuk menemani berbagai hidangan, terutama saat cuaca panas."));

            AdapterMakanan adapter = new AdapterMakanan(ListMakanan,this);
            recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(MakananModel makananModel) {
        Intent in =  new Intent(MainActivity.this, DetailMakanan.class);
        in.putExtra("nama",makananModel.getNamaMakanan());
        in.putExtra("harga",makananModel.getHargaMakanan());
        in.putExtra("gambar",makananModel.getGambarasal());
        in.putExtra("desk",makananModel.getDeskMakanan());

        startActivity(in);
    }
}