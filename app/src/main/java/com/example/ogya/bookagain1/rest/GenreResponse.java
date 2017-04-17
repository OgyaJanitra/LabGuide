package com.example.ogya.bookagain1.rest;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by OGYA on 4/17/2017.
 */

public class GenreResponse {
    @SerializedName("result")
    private String result;
    @SerializedName("category")
    private List<GenreRetrofit> genre;

    public List<GenreRetrofit> getGenre() {
        return genre;
    }

    public void setGenre(List<GenreRetrofit> genre) {
        this.genre = genre;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}