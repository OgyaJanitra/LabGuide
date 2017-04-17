package com.example.ogya.bookagain1.model;

import android.database.Cursor;

import com.example.ogya.bookagain1.database.Reusable;

/**
 * Created by OGYA on 4/17/2017.
 */

public class Category {
    private int category_id;
    private String category_name;
    private String category_desc;

    public Category(Cursor cursor) {
        this.category_id = cursor.getInt(cursor.getColumnIndex(Reusable.COL_CATEGORY_ID));
        this.category_name = cursor.getString(cursor.getColumnIndex(Reusable.COL_CATEGORY_NAME));
        this.category_desc = cursor.getString(cursor
                .getColumnIndex(Reusable.COL_CATEGORY_DESC));
    }

    public Category() {

    }

    public String getCategory_desc() {
        return category_desc;
    }

    public void setCategory_desc(String category_desc) {
        this.category_desc = category_desc;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
