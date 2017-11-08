package com.example.retrofitdemo10;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by xujin on 2017/11/7.
 */

public interface APIInterface {
    @GET("users/{username}")
    Call<LoginBean> getLogin(@Path("username")String user);
}
