package com.example.hilmi.projectdoa.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hilmi.projectdoa.R;
import com.example.hilmi.projectdoa.adapter.AdzanAdapter;
import com.example.hilmi.projectdoa.model.AdzanModel;

import java.util.ArrayList;
import java.util.List;


public class AdzanFragment extends Fragment {
    private List<AdzanModel> home = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }


    private void homeCollection() {
        home.add(new AdzanModel("Imsak", "4.25 AM"));
        home.add(new AdzanModel("Subuh", "4.30 AM"));
        home.add(new AdzanModel("Dzuhur", "11.30 AM"));
        home.add(new AdzanModel("Ashar", "14.30 PM"));
        home.add(new AdzanModel("Maghrib", "17.45 PM"));
        home.add(new AdzanModel("Isya ", "19.10 PM"));
    }

    private RecyclerView recyclerView ;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //home
        recyclerView = view.findViewById(R.id.recylcer);

        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);


        AdzanAdapter adapter = new AdzanAdapter(home);
        recyclerView.setAdapter(adapter);
    homeCollection();
    }
}
