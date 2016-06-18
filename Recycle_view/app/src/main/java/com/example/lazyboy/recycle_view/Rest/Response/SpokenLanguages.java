package com.example.lazyboy.recycle_view.Rest.Response;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class SpokenLanguages {
    private static String iso_639_1;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SpokenLanguages.name = name;
    }

    public static String getIso_639_1() {
        return iso_639_1;
    }

    public static void setIso_639_1(String iso_639_1) {
        SpokenLanguages.iso_639_1 = iso_639_1;
    }

    private static String name;

}
