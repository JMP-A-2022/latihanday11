package com.example.praktikumrecyleview;

public class KlubModel {
    private String namaKlub;
    private int logoKlub;

    public KlubModel(String namaKlub, int logoKlub) {
        this.namaKlub = namaKlub;
        this.logoKlub = logoKlub;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

    public int getLogoKlub() {
        return logoKlub;
    }

    public void setLogoKlub(int logoKlub) {
        this.logoKlub = logoKlub;
    }
}
