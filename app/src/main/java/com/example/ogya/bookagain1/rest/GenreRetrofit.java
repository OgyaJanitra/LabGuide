package com.example.ogya.bookagain1.rest;

/**
 * Created by OGYA on 4/17/2017.
 */

public class GenreRetrofit {
    private int id;
    private String nama_kategori;
    private String desc_kategori;

    public GenreRetrofit() {

    }

    public String getDesc_kategori() {
        return desc_kategori;
    }

    public void setDesc_kategori(String desc_kategori) {
        this.desc_kategori = desc_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}