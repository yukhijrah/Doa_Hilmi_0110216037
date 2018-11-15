package com.example.hilmi.projectdoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hilmi.projectdoa.adapter.ContainerAdapter;
import com.example.hilmi.projectdoa.fragment.AdzanFragment;
import com.example.hilmi.projectdoa.fragment.DoaFragment;
import com.example.hilmi.projectdoa.fragment.ProfileFragment;


public class MainActivity extends AppCompatActivity {
    private ViewPager vpMain;
    private Button btnHome, btnDoa, btnProfile;

    private ContainerAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);


        //casting object(view)
        vpMain = (ViewPager) findViewById(R.id.view_pager_main);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnDoa = (Button) findViewById(R.id.btn_doa);
        btnProfile = (Button) findViewById(R.id.btn_profile);

        setContainerPrepared(); //panggil method untuk prep fagment container
        onButtonClicked(); // panggil method agar button bisa di click
    }

    private void setContainerPrepared(){
        adapter = new ContainerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AdzanFragment(), getString(R.string.btn_adzan));
        adapter.addFragment(new DoaFragment(), getString(R.string.btn_doa));
        adapter.addFragment(new ProfileFragment(), getString(R.string.btn_profile));
        vpMain.setAdapter(adapter);
    }

    private void onButtonClicked(){

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(0);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(1);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpMain.setCurrentItem(2);
            }
        });
    }
}
