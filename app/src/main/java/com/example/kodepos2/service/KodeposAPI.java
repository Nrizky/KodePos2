package com.example.kodepos2.service;

import com.example.kodepos2.model.Kodepos;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KodeposAPI {

    @GET("https://kodepos-2d475.firebaseio.com/")
    Call<Kodepos>getResult();

    Call<Kodepos> get(String source, String apiKey);
}
