package com.example.dailynewsdemo10;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.dailynewsdemo10.Adapters.Fragment02_Adapter01;
import com.example.dailynewsdemo10.Bean.MenuInfo02;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.gson.Gson;
import com.youth.banner.Banner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by xujin on 2017/11/2.
 * Retrofit+OkHttp
 */

public class Fragment02 extends Fragment {
    private List<MenuInfo02.StoriesBean> list;
    private String path = "https://news-at.zhihu.com/api/4/news/latest";
    private ListView lv;
    private Banner mBanner;
    private List<String> imgList=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(getActivity());
        View view = inflater.inflate(R.layout.fragment02, container, false);
        lv = view.findViewById(R.id.fragment02_myView);
        mBanner = view.findViewById(R.id.fragment02_myBanner);

        getImg();
        getBannerImg();
        return view;
    }
  public void   getBannerImg(){
        imgList.add("https://pic4.zhimg.com/v2-a884ce435d514a873468caf52c189dd3.jpg");
        imgList.add("https://pic4.zhimg.com/v2-a8c6c4f041f7f2090023d1334c69104f.jpg");
        imgList.add("https://pic3.zhimg.com/v2-be40c4fffc53782760721d4d9f2dd9e2.jpg");
        imgList.add("https://pic4.zhimg.com/v2-a397da91d13e4d96f28429e6111a1bf7.jpg");
        imgList.add("https://pic3.zhimg.com/v2-97c251c7808aa77c33d85918664b96ce.jpg");
      mBanner.setImageLoader(new GlideImageLoader());
      mBanner.setImages(imgList);
      mBanner.start();

  }

    private void getImg() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url(path).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String str = response.body().string();
                Gson gson = new Gson();
                MenuInfo02 menuInfo02 = gson.fromJson(str, MenuInfo02.class);
                list = menuInfo02.getStories();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        lv.setAdapter(new Fragment02_Adapter01(list, getActivity()));
                    }
                });

            }
        });
    }
}
