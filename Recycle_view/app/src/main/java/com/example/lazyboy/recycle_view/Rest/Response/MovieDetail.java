package com.example.lazyboy.recycle_view.Rest.Response;

import java.util.ArrayList;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class MovieDetail {
    private boolean adult ;
    private static String backdrop_path;
    private static String belongs_to_collection;
    private static String budget;
    private static String homepage;
    private static String id;
    private static String imdb_id;
    private static String original_language;
    private static String original_title;
    private static String overview;
    private static String popularity;
    private static String poster_path;
    private static String release_date;
    private static String revenue;
    private static String runtime;
    private static String status;
    private static String tagline;
    private static String title;
    private static String video;
    private static String vote_average;
    private static String vote_count;

    private ArrayList<Genres> genresArrayList = new ArrayList<>();
    private ArrayList<ProductionCompanies> productionCompaniesArrayList = new ArrayList<>();
    private ArrayList<ProductionCompanies> productionCompaniesgenresArrayList = new ArrayList<>();
    private ArrayList<SpokenLanguages> spokenLanguagesArrayList = new ArrayList<>();


    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public static String getBackdrop_path() {
        return backdrop_path;
    }

    public static void setBackdrop_path(String backdrop_path) {
        MovieDetail.backdrop_path = backdrop_path;
    }

    public static String getBelongs_to_collection() {
        return belongs_to_collection;
    }

    public static void setBelongs_to_collection(String belongs_to_collection) {
        MovieDetail.belongs_to_collection = belongs_to_collection;
    }

    public static String getBudget() {
        return budget;
    }

    public static void setBudget(String budget) {
        MovieDetail.budget = budget;
    }

    public static String getHomepage() {
        return homepage;
    }

    public static void setHomepage(String homepage) {
        MovieDetail.homepage = homepage;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        MovieDetail.id = id;
    }

    public static String getImdb_id() {
        return imdb_id;
    }

    public static void setImdb_id(String imdb_id) {
        MovieDetail.imdb_id = imdb_id;
    }

    public static String getOriginal_language() {
        return original_language;
    }

    public static void setOriginal_language(String original_language) {
        MovieDetail.original_language = original_language;
    }

    public static String getOriginal_title() {
        return original_title;
    }

    public static void setOriginal_title(String original_title) {
        MovieDetail.original_title = original_title;
    }

    public static String getOverview() {
        return overview;
    }

    public static void setOverview(String overview) {
        MovieDetail.overview = overview;
    }

    public static String getPopularity() {
        return popularity;
    }

    public static void setPopularity(String popularity) {
        MovieDetail.popularity = popularity;
    }

    public static String getPoster_path() {
        return poster_path;
    }

    public static void setPoster_path(String poster_path) {
        MovieDetail.poster_path = poster_path;
    }

    public static String getRelease_date() {
        return release_date;
    }

    public static void setRelease_date(String release_date) {
        MovieDetail.release_date = release_date;
    }

    public static String getRevenue() {
        return revenue;
    }

    public static void setRevenue(String revenue) {
        MovieDetail.revenue = revenue;
    }

    public static String getRuntime() {
        return runtime;
    }

    public static void setRuntime(String runtime) {
        MovieDetail.runtime = runtime;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        MovieDetail.status = status;
    }

    public static String getTagline() {
        return tagline;
    }

    public static void setTagline(String tagline) {
        MovieDetail.tagline = tagline;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        MovieDetail.title = title;
    }

    public static String getVideo() {
        return video;
    }

    public static void setVideo(String video) {
        MovieDetail.video = video;
    }

    public static String getVote_average() {
        return vote_average;
    }

    public static void setVote_average(String vote_average) {
        MovieDetail.vote_average = vote_average;
    }

    public static String getVote_count() {
        return vote_count;
    }

    public static void setVote_count(String vote_count) {
        MovieDetail.vote_count = vote_count;
    }

    public ArrayList<Genres> getGenresArrayList() {
        return genresArrayList;
    }

    public void setGenresArrayList(ArrayList<Genres> genresArrayList) {
        this.genresArrayList = genresArrayList;
    }

    public ArrayList<ProductionCompanies> getProductionCompaniesArrayList() {
        return productionCompaniesArrayList;
    }

    public void setProductionCompaniesArrayList(ArrayList<ProductionCompanies> productionCompaniesArrayList) {
        this.productionCompaniesArrayList = productionCompaniesArrayList;
    }

    public ArrayList<ProductionCompanies> getProductionCompaniesgenresArrayList() {
        return productionCompaniesgenresArrayList;
    }

    public void setProductionCompaniesgenresArrayList(ArrayList<ProductionCompanies> productionCompaniesgenresArrayList) {
        this.productionCompaniesgenresArrayList = productionCompaniesgenresArrayList;
    }

    public ArrayList<SpokenLanguages> getSpokenLanguagesArrayList() {
        return spokenLanguagesArrayList;
    }

    public void setSpokenLanguagesArrayList(ArrayList<SpokenLanguages> spokenLanguagesArrayList) {
        this.spokenLanguagesArrayList = spokenLanguagesArrayList;
    }
}
