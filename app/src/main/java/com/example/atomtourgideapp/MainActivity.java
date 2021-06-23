package com.example.atomtourgideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.atomtourgideapp.Adapters.FragmentsReplaceAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tablayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find the viewpager and Tablayout
        //viewpager
        viewPager = findViewById(R.id.viewpager);
        //tablayout
        tablayout = findViewById(R.id.tab_layout);

        //inflating viewpager  and setting adapter in tablayout
        viewPager.setAdapter(new FragmentsReplaceAdapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewPager);

    }
}