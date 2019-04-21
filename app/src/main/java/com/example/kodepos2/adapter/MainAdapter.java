package com.example.kodepos2.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;


import com.example.kodepos2.R;
import com.example.kodepos2.model.Kodepos;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Holder> {
    private List<Kodepos> kodepos;
    private Context context;
    public MainAdapter(Context context, List<Kodepos> kodepos) {
        this.context = context;
        this.kodepos = kodepos;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_artikel, parent, false);
        return new Holder(view);
    }


    @Override
    public void onBindViewHolder(MainAdapter.Holder holder, final int
            position) {
//        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return kodepos.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        private TextView tvNama;
        private TextView tvKode;

        public Holder(View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv1);
            tvKode = itemView.findViewById(R.id.tv_overview);
        }

    }
}