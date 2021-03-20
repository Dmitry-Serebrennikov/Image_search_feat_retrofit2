package com.example.image_search_feat_retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayAPI {
    @GET("/api")
    Call<List<Hit>> getAllData(@Query("key") String key);


}
