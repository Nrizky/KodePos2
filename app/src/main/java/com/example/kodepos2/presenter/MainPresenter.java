package com.example.pelatihan3.presenter;

import android.content.Context;
import android.util.Log;

import com.example.kodepos2.model.Kodepos;
import com.example.kodepos2.presenter.MainView;
import com.example.kodepos2.service.BaseApp;
import com.example.kodepos2.service.KodeposAPI;
import com.example.kodepos2.view.MainActivity;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter {
    private Context context;
    private MainView mainView;

    public MainPresenter (Context context, MainView mainView){
        this.context = context;
        this.mainView = mainView;

    }
    public void loadArtikel(String source, String apiKey){
        BaseApp.service.get(source, apiKey).enqueue(new Callback<Kodepos>() {
            @Override
            public void onResponse(Call<Kodepos> call, Response<Kodepos> response) {
                if (response.isSuccessful()){
                    mainView.onSucces(response.body().getKodepos());
                } else {
                    mainView.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<Kodepos> call, Throwable t) {
                mainView.onFailure(t.getMessage());
            }
        });
    }
}
