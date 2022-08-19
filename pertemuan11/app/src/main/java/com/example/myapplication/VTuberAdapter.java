package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.*;

public class VTuberAdapter extends RecyclerView.Adapter<VTuberAdapter.ViewHolder> {
    private Context context;
    private List<VTuberData> items;

    public VTuberAdapter(Context context, List<VTuberData> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.vtuber_data, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VTuberAdapter.ViewHolder holder, int position) {
        VTuberData item = items.get(position);
        holder.name.setText(item.getName());
        Picasso.get().load(item.getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameVTuber);
            image = itemView.findViewById(R.id.imageVTuber);
        }
    }
}