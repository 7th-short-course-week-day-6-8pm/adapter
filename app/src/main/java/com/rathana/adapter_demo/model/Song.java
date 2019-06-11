package com.rathana.adapter_demo.model;

public class Song {

    private int id;
    private String title;
    private String singer;

    public Song(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
