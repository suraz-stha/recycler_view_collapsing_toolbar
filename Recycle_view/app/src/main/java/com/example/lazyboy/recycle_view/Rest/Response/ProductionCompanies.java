package com.example.lazyboy.recycle_view.Rest.Response;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class ProductionCompanies {
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ProductionCompanies.name = name;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        ProductionCompanies.id = id;
    }

    private static String name;
    private static String id;
}
