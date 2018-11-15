package com.example.hilmi.projectdoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hilmi.projectdoa.R;

/**
 * Created by hilmi on 15/11/18.
 */

public class DoaHolder extends RecyclerView.ViewHolder {
    public TextView title, subtitle ;

    public DoaHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.doaTitle);
        subtitle = (TextView) itemView.findViewById(R.id.doaSubtitle);
    }
}
