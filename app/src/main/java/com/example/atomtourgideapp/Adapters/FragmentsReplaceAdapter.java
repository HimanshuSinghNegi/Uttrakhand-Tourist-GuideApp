package com.example.atomtourgideapp.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.atomtourgideapp.Fragments.FoodFragment;
import com.example.atomtourgideapp.Fragments.TempleFragment;
import com.example.atomtourgideapp.Fragments.TouristPlaceFragment;
import com.example.atomtourgideapp.Fragments.UttrakhandDetailFragment;

public class FragmentsReplaceAdapter extends FragmentPagerAdapter {
    public FragmentsReplaceAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        //using switch here  to replace or exchange the fragments in MainActivity
        switch (position) {
            // using cases to replace fragments according postions
            case 1:
                return new TempleFragment();
            case 2:
                return  new TouristPlaceFragment();
            case 3:
                return new FoodFragment();

            default:
                return new UttrakhandDetailFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    // we have to explicitly import  this method here to give the tittle to the page

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //creating a string for tab titles
        String title =null;
            if (position == 0) { title = "Detail"; }
            else if (position == 1) { title = "Temple"; }

            else if (position == 2) { title = "Tourist Place";}

            else if (position == 3){title = "Food/Cuisine";}
            return title;
        }
}
