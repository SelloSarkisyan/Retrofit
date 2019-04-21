package com.example.lenovo.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.lenovo.retrofit.response.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestRetrofitActivity extends AppCompatActivity {
  RetrofitInterface rInterface=RetrofitServiceGenerator.createService( RetrofitInterface.class );

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.test_retrofit_activity );
    rInterface.getMovies("interstellar","70ad462a").enqueue( new Callback<Example>() {


      @Override
      public void onResponse(Call<Example> call, Response<Example> response) {
        String s=response.body().getActors();
        Log.e( "mylog",""+s );

      }

      @Override
      public void onFailure(Call<Example> call, Throwable t) {

      }
    } );
    //rInterface.getMovies().execute().body().getValue();

  }
}
