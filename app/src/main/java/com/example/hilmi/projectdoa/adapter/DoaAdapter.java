package com.example.hilmi.projectdoa.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hilmi.projectdoa.DetailActivity;
import com.example.hilmi.projectdoa.R;
import com.example.hilmi.projectdoa.holder.DoaHolder;
import com.example.hilmi.projectdoa.model.DoaModel;

import java.util.ArrayList;
import java.util.List;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<DoaModel> doa = new ArrayList<>();
    public DoaAdapter(List<DoaModel> doa) {
        this.doa = doa;
    }

    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,parent,false);
        final DoaHolder holderdoa = new DoaHolder(itemView);
        holderdoa.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int position = holderdoa.getAdapterPosition();
                Intent intent = new Intent(holderdoa.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doa.get(position));

                holderdoa.itemView.getContext().startActivity(intent);
            }
        });
        return holderdoa;
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        holder.title.setText(doa.get(position).getDoaTitle());
        holder.subtitle.setText(doa.get(position).getDoaSubtitle());
    }

    @Override
    public int getItemCount() {
        return doa.size();
    }
}
