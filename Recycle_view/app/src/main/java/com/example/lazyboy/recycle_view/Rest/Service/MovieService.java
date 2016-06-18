package com.example.lazyboy.recycle_view.Rest.Service;

import com.example.lazyboy.recycle_view.Rest.Response.MovieDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by lazyboy on 6/18/2016.
 */
public interface MovieService {
    @GET("3/movie/")
    Call<MovieDetail> getMovieDetail(@Path("movie_id") String id,@Path("api_key") String api_key);
}
