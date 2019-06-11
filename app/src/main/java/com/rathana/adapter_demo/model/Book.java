package com.rathana.adapter_demo.model;

import android.support.annotation.DrawableRes;

public class Book {

    @DrawableRes
    private int image;
    private String title;
    private int view;

    public Book() {
    }

    public Book(int image, String title, int view) {
        this.image = image;
        this.title = title;
        this.view = view;
    }

    public int getImage() {
        return image;
    }

    public void setImage(@DrawableRes int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
