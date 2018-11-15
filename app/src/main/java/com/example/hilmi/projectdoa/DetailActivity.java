package com.example.hilmi.projectdoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.hilmi.projectdoa.model.DoaModel;


public class DetailActivity extends AppCompatActivity {
    TextView doaTitle, doaSubtitle, doaSurah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        doaTitle = (TextView) findViewById(R.id.doaTitle);
        doaSubtitle = (TextView) findViewById(R.id.doaSubtitle);
        doaSurah = (TextView) findViewById(R.id.doaSurah);


        DoaModel doa = (DoaModel) getIntent().getSerializableExtra("id_doa");

        doaTitle.setText(doa.getDoaTitle());
        doaSubtitle.setText(doa.getDoaSubtitle());
        doaSurah.setText(doa.getDoaSurah());

    }
}
