package com.example.atomtourgideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atomtourgideapp.Adapters.StuffFittingAdapter;
import com.example.atomtourgideapp.Models.StuffModel;
import com.example.atomtourgideapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    RecyclerView foodRv;
    ArrayList<StuffModel> item;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        //finding the recylcerview
        foodRv = view.findViewById(R.id.foodRv);
        item = new ArrayList<>();

        //adding data into array list
        item.add(new StuffModel(R.drawable.kapaa,"Kapaa",R.string.kapaa));
        item.add(new StuffModel(R.drawable.aaloogutke,"Aloo - Gutke",R.string.aloo_gutke));
        item.add(new StuffModel(R.drawable.phaanu,"Phaanu",R.string.phaanu));
        item.add(new StuffModel(R.drawable.chainsoo,"Chainsoo",R.string.chainsoo));
        item.add(new StuffModel(R.drawable.baadi,"Baadi",R.string.baadi));


        //setting adapter
        StuffFittingAdapter adapter = new StuffFittingAdapter(item,getContext(),"food");

        foodRv.setNestedScrollingEnabled(false);

        //Setting linearLayout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        foodRv.setLayoutManager(linearLayoutManager);
        //now setting adapter
        foodRv.setAdapter(adapter);

        return view;
    }
}