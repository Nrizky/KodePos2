package com.example.kodepos2.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.kodepos2.R;
import com.example.kodepos2.adapter.MainAdapter;
import com.example.kodepos2.model.Kodepos;
import com.example.kodepos2.presenter.MainView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private com.example.kodepos2.presenter.MainPresenter mainPresenter;
    private Object Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec_artikel);
        mainPresenter = new com.example.kodepos2.presenter.MainPresenter(this, this);

    }

    @Override
    public void onSucces(List<Kodepos> kodepos) {
        adapter = new MainAdapter(getApplicationContext(), kodepos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyAll();
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }
}
