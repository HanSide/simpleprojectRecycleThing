package com.example.recycleviewtest2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.ViewHolder>  {

     ArrayList<MakananModel> listMakanan;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(MakananModel makananModel);
    }
    public AdapterMakanan(ArrayList<MakananModel> listMakanan, OnItemClickListener listener){
        this.listMakanan = listMakanan;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MakananModel item = listMakanan.get(position);
        holder.tvNamaMakanan.setText(item.getNamaMakanan());
        holder.tvHargaMakanan.setText(item.getHargaMakanan());
        holder.ivMakanan.setImageResource(item.getGambarasal());


        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
          TextView tvNamaMakanan,tvHargaMakanan,tvDeskripsiMakanan;
          ImageView ivMakanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaMakanan = itemView.findViewById(R.id.tvNamaMakanan);
            tvHargaMakanan = itemView.findViewById(R.id.tvHargaMakanan);
            ivMakanan = itemView.findViewById(R.id.ivMakanan);
            tvDeskripsiMakanan = itemView.findViewById(R.id.tvDeskripsiMakanan);
            }
    }
}
