package com.example.kodepos2.presenter;

import com.example.kodepos2.model.Kodepos;

import java.util.List;

public interface MainView {

    void onSucces(List<Kodepos> articlesItemList);

    void onError(String errorMessage);

    void onFailure(String failureMessage);
}


