package com.example.atomtourgideapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atomtourgideapp.Adapters.StuffFittingAdapter;
import com.example.atomtourgideapp.Models.StuffModel;
import com.example.atomtourgideapp.R;

import java.util.ArrayList;

public class TempleFragment extends Fragment {

    RecyclerView templeRv;
    ArrayList<StuffModel> item;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temple, container, false);
        //recyclerview
        templeRv = view.findViewById(R.id.temple_Rv);
        //ArrayList
        item = new ArrayList<>();
        item.add(new StuffModel(R.drawable.kedar1,"KEDARNATH",R.string.kedar));
        item.add(new StuffModel(R.drawable.tungnath,"TUNGNATH",R.string.tungnath));
        item.add(new StuffModel(R.drawable.nandadevi,"NANDA DEVI",R.string.nanda_devi));
        item.add(new StuffModel(R.drawable.dharidevi,"DHARI DEVI",R.string.dhari_devi));
        item.add(new StuffModel(R.drawable.chandidevi,"CHANDI DEVI",R.string.chandi_devi));

        //adapter
        StuffFittingAdapter adapter = new StuffFittingAdapter(item, getContext(),"temple");

        //Linear layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        templeRv.setLayoutManager(linearLayoutManager);
        templeRv.setAdapter(adapter);


    return view;
    }
}