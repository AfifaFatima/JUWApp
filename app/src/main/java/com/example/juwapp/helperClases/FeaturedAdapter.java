package com.example.juwapp.helperClases;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.juwapp.R;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedHolder> {

    ArrayList<FeaturedHelperClass> featuredList;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredList) {
        this.featuredList = featuredList;
    }

    @NonNull
    @Override
    public FeaturedAdapter.FeaturedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design, parent, false);
        FeaturedHolder featuredHolder = new FeaturedHolder(view);
        return featuredHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedAdapter.FeaturedHolder holder, int position) {

        FeaturedHelperClass featuredHelperClass = featuredList.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());

    }

    @Override
    public int getItemCount() {
        return featuredList.size();
    }


    public static class FeaturedHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;

        public FeaturedHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.featured_img);
            title = itemView.findViewById(R.id.featured_title);

        }
    }

}
