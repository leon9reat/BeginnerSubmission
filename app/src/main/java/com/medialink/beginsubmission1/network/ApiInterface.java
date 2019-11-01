package com.medialink.beginsubmission1.network;

import com.medialink.beginsubmission1.model.ReceipeRespon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://api.spoonacular.com/recipes/";

    @GET("random")
    Call<ReceipeRespon> getRandom(@Query("apiKey") String apiKey,
                                  @Query("limitLicense") boolean limitLicense,
                                  @Query("tags") String tags,
                                  @Query("number") int number);
}
