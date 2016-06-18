package com.example.lazyboy.recycle_view.Rest;

import com.example.lazyboy.recycle_view.BuildConfig;
import com.example.lazyboy.recycle_view.Rest.Response.MovieDetail;
import com.example.lazyboy.recycle_view.Rest.Service.MovieService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lazyboy on 6/18/2016.
 */
public class RetrofitManager {
    public static Retrofit retrofit =null;
    public static MovieService movieService= null;
    public  static RetrofitManager retrofitManager = null;

    private RetrofitManager(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder().baseUrl(BuildConfig.MOVIE_BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();

        movieService = retrofit.create(MovieService.class);
    }

    public static RetrofitManager getInstance(){
        if (retrofitManager == null){
            retrofitManager = new RetrofitManager();
        }
        return retrofitManager;

    }

    public void getMoviesDetail(String id, String api_key, Callback<MovieDetail> movieDetailCallback){

        Call<MovieDetail> movieDetailCall = movieService.getMovieDetail(id,api_key);
        movieDetailCall.enqueue(movieDetailCallback);
    }

}
