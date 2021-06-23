package com.example.atomtourgideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atomtourgideapp.Adapters.StuffFittingAdapter;
import com.example.atomtourgideapp.Models.StuffModel;
import com.example.atomtourgideapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class TouristPlaceFragment extends Fragment {

    RecyclerView touristRv;
    ArrayList<StuffModel> item;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_tourist_place, container, false);

        touristRv = view.findViewById(R.id.touristRv);
        item = new ArrayList<>();
        item.add(new StuffModel(R.drawable.nanai,"1. Nanital",R.string.nanital));
        item.add(new StuffModel(R.drawable.musso,"2. Mussoori",R.string.mush));
        item.add(new StuffModel(R.drawable.dehra,"3. Dehradun",R.string.dehra));
        item.add(new StuffModel(R.drawable.rishi,"4. Rishikesh",R.string.rishi));
        item.add(new StuffModel(R.drawable.auli,"5. Auli",R.string.auli));



        StuffFittingAdapter adapter = new StuffFittingAdapter(item,getContext(),"tourist");



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        touristRv.setLayoutManager(linearLayoutManager);


        touristRv.setAdapter(adapter);


        return  view;
    }
}