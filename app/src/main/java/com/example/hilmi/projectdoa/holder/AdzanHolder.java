package com.example.hilmi.projectdoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hilmi.projectdoa.R;


public class AdzanHolder extends RecyclerView.ViewHolder {
    public TextView jadwalSholat, waktuSholat ;

    public AdzanHolder(View itemView) {
        super(itemView);

        jadwalSholat = (TextView) itemView.findViewById(R.id.jadwal_sholat);
        waktuSholat = (TextView) itemView.findViewById(R.id.waktu_sholat);
    }
}
