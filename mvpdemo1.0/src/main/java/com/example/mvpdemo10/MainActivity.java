package com.example.mvpdemo10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private String path="https://news-at.zhihu.com/api/4/news/latest";
    private List<MenuInfo.StoriesBean> list;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.myView);
        getDate();
    }

    private void getDate() {
        OkHttpClient client=new OkHttpClient.Builder().build();
        Request request=new Request.Builder().url(path).build();
        Call call=client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String str=response.body().string();
                Gson gson=new Gson();
                MenuInfo menuInfo=gson.fromJson(str,MenuInfo.class);
                list=menuInfo.getStories();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        lv.setAdapter(new MyAdapter(list,MainActivity.this));
                    }
                });
            }
        });
     }
}
