package com.example.retrofitdemo11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
/*
*未能实现请求数据
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://news-at.zhihu.com/api/4/news/latest/")//retrofit 2.0以后baseUrl必须以/结束
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        News news = retrofit.create(News.class); //获得接口对象
        Call<MenuInfo> call = news.getItem();
        call.enqueue(new Callback<MenuInfo>() {
            @Override
            public void onResponse(Call<MenuInfo> call, Response<MenuInfo> response) {
                if (response != null) {
                    MenuInfo str = response.body();
                    Toast.makeText(MainActivity.this, "得到数据了" + str, Toast.LENGTH_LONG);
                }
            }

            @Override
            public void onFailure(Call<MenuInfo> call, Throwable t) {
                Toast.makeText(MainActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
