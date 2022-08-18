package com.fitrizuyinanurazizah.aplikasirecycleview;

public class TreasureModel {
    public String image;
    public String nama;

    public TreasureModel(String image, String nama) {
        this.image = image;
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
