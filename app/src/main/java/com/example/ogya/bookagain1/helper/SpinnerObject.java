package com.example.ogya.bookagain1.helper;

/**
 * Created by OGYA on 4/17/2017.
 */

public class SpinnerObject {
    private int id;
    private String name;

    public SpinnerObject(int paramId, String paramName) {
        this.id = paramId;
        this.name = paramName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}
