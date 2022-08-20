package com.example.cobarecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {
    int [] arr;

    public RecyclerViewAdapter(int[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view,parent,false);
        myViewHolder myviewHoder = new myViewHolder(view);
        return myviewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.imageView.setImageResource(arr[position]);
        holder.textView.setText("Image Number " + position);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
