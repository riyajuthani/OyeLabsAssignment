package com.example.oyelabsassignment;

import android.graphics.drawable.Drawable;

public class GroceryItem {
    int gid;
    String gname;
    int GImagesrc;


    public GroceryItem(int gid, int gimagesrc, String gname) {
        this.gid = gid;
        this.gname = gname;
        GImagesrc = gimagesrc;

    }

    public int getId() {
        return gid;
    }

    public void setId(int id) {
        this.gid = id;
    }

    public int getImagesrc() {
        return GImagesrc;
    }

    public void setImagesrc(int imagesrc) {
        GImagesrc = imagesrc;
    }

    public String getName() {
        return gname;
    }

    public void setName(String name) {
        this.gname = name;
    }



}
