package com.example.atomtourgideapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atomtourgideapp.Models.StuffModel;
import com.example.atomtourgideapp.R;

import java.util.ArrayList;

public class StuffFittingAdapter extends RecyclerView.Adapter<StuffFittingAdapter.ViewHolder> {
    ArrayList<StuffModel> item;
    Context context;
    public String decider;



    public StuffFittingAdapter(ArrayList<StuffModel> item, Context context,String decider) {
        this.item = item;
        this.context = context;
        this.decider = decider;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (decider) {
            case "food": {
                View view = LayoutInflater.from(context).inflate(R.layout.layout_food, parent, false);

                return new ViewHolder(view);
            }
            case "temple": {
                View view = LayoutInflater.from(context).inflate(R.layout.layout_temple, parent, false);
                return new ViewHolder(view);
            }
            case "tourist": {
                View view = LayoutInflater.from(context).inflate(R.layout.layout_tourist, parent, false);
                return new ViewHolder(view);
            }
            default:
                return null;
        }

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StuffModel model = item.get(position);
        switch (decider) {
            case "temple":
                holder.temple_image.setImageResource(model.getImage());
                holder.name.setText(model.getName());
                holder.description.setText(model.getDescription());
                break;
            case "food":
                holder.food_image.setImageResource(model.getImage());
                holder.food_title.setText(model.getName());
                holder.food_detail.setText(model.getDescription());
                break;
            case "tourist":
                holder.tPlace_name.setText(model.getName());
                holder.tPlace_image.setImageResource(model.getImage());
                holder.t_description.setText(model.getDescription());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return item.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView  temple_image,food_image,tPlace_image;
        TextView name,description ,food_title,food_detail,t_description,tPlace_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            temple_image = itemView.findViewById(R.id.image_st);
            name = itemView.findViewById(R.id.title_st);
            description = itemView.findViewById(R.id.desc_st);
            food_image =itemView.findViewById(R.id.food_image);
            food_title =itemView.findViewById(R.id.food_name);
            food_detail = itemView.findViewById(R.id.food_detail);
            tPlace_image = itemView.findViewById(R.id.t_image);
            t_description = itemView.findViewById(R.id.t_description);
            tPlace_name = itemView.findViewById(R.id.t_name);
        }
    }
    }



