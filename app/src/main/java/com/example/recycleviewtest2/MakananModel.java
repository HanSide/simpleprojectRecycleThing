package com.example.recycleviewtest2;

public class MakananModel {
    private String namaMakanan;
    private String hargaMakanan;
    private int gambarasal;
    private String deskMakanan;

    public MakananModel(String namaMakanan, String hargaMakanan, int gambarasal,String deskMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.gambarasal = gambarasal;
        this.deskMakanan = deskMakanan;
    }


    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public int getGambarasal() {
        return gambarasal;
    }


    public String getDeskMakanan() {
        return deskMakanan;
    }
}
