package com.example.retrofitdemo10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create()).build();
        APIInterface apiInterface=retrofit.create(APIInterface.class);
        Call<LoginBean> beanCall=apiInterface.getLogin("1111111");
        beanCall.enqueue(new Callback<LoginBean>() {
            @Override
            public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                Toast.makeText(MainActivity.this,"得到的东西"+response.body().getLogin(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<LoginBean> call, Throwable t) {

            }
        });
    }
}
