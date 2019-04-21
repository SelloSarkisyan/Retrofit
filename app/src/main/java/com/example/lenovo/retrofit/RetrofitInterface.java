package com.example.lenovo.retrofit;

import com.example.lenovo.retrofit.response.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
  @GET("?")
  Call<Example> getMovies(@Query( "t" )String t, @Query( "apikey" ) String apikey);
}
