package com.example.retrofitdemo11;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xujin on 2017/11/7.
 */

public interface News {
    //Url: https://news-at.zhihu.com/api/4/news/latest
    @GET(" ")
    Call<MenuInfo> getItem();
}
