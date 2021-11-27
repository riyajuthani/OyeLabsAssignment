package com.example.oyelabsassignment;

import android.graphics.drawable.Drawable;

public class BestsellingItem {
    int bsid;
    String bsname;
    Drawable bsImagesrc;
    String bsprice;
    String bsquantity;

    public BestsellingItem(int bsid, String bsname, Drawable bsimagesrc, String bsprice, String bsquantity) {
        this.bsid = bsid;
        this.bsname = bsname;
        bsImagesrc = bsimagesrc;
        this.bsprice = bsprice;
        this.bsquantity = bsquantity;
    }

    public int getId() {
        return bsid;
    }

    public void setId(int id) {
        this.bsid = id;
    }

    public String getName() {
        return bsname;
    }

    public void setName(String name) {
        this.bsname = name;
    }

    public Drawable getImagesrc() {
        return bsImagesrc;
    }

    public void setImagesrc(Drawable imagesrc) {
        bsImagesrc = imagesrc;
    }

    public String getPrice() {
        return bsprice;
    }

    public void setPrice(String price) {
        this.bsprice = price;
    }

    public String getQuantity() {
        return bsquantity;
    }

    public void setQuantity(String quantity) {
        this.bsquantity = quantity;
    }
}
