package com.example.ogya.bookagain1.rest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by OGYA on 4/17/2017.
 */

public class GeneralResponse {
    @SerializedName("Result")
    private String result;
    @SerializedName("Message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
