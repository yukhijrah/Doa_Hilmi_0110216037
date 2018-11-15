package com.example.hilmi.projectdoa.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.hilmi.projectdoa.R;
import com.example.hilmi.projectdoa.holder.AdzanHolder;
import com.example.hilmi.projectdoa.model.AdzanModel;

import java.util.List;

public class AdzanAdapter extends RecyclerView.Adapter<AdzanHolder>{

    private List<AdzanModel> home;
    public AdzanAdapter(List<AdzanModel> home) {
        this.home=home;
    }

    @Override
    public AdzanHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdzanHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adzan,parent,false));
    }

    @Override
    public void onBindViewHolder(AdzanHolder holder, int position) {
        holder.jadwalSholat.setText(home.get(position).getJadwal());
        holder.waktuSholat.setText(home.get(position).getWaktu());
    }

    @Override
    public int getItemCount() {
        return home.size();
    }
}
