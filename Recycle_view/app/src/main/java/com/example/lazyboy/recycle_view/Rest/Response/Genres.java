package com.example.lazyboy.recycle_view.Rest.Response;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class Genres {
    private static  String id ;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Genres.name = name;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Genres.id = id;
    }

    private static  String name;
}
