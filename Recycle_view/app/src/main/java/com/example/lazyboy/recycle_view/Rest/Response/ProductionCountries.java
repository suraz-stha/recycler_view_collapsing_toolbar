package com.example.lazyboy.recycle_view.Rest.Response;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class ProductionCountries {
    private static String iso_3166_1;

    public static String getIso_3166_1() {
        return iso_3166_1;
    }

    public static void setIso_3166_1(String iso_3166_1) {
        ProductionCountries.iso_3166_1 = iso_3166_1;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ProductionCountries.name = name;
    }

    private static String name;

}
