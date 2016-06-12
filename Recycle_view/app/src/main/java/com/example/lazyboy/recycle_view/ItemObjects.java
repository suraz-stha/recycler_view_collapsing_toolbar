package com.example.lazyboy.recycle_view;

/**
 * Created by lazyboy on 3/23/2016.
 */
public class ItemObjects {
    private String Name;
    private int Photo;

    public ItemObjects(String name, int photo) {
        Name = name;
        Photo = photo;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
