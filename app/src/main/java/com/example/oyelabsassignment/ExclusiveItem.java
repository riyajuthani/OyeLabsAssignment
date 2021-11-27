package com.example.oyelabsassignment;

import android.graphics.drawable.Drawable;

public class ExclusiveItem {
    int id;
    String name;
    Drawable Imagesrc;
    String description;
    String price;
    String quantity;

    public ExclusiveItem(int id, String name, Drawable imagesrc, String description, String price, String quantity) {
        this.id = id;
        this.name = name;
        Imagesrc = imagesrc;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImagesrc() {
        return Imagesrc;
    }

    public void setImagesrc(Drawable imagesrc) {
        Imagesrc = imagesrc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
