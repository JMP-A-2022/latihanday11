package com.example.day11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LogoAdapter extends RecyclerView.Adapter<LogoAdapter.ViewHolder> {

    private final ArrayList<LogoActivity> logoActivity;

    public LogoAdapter(ArrayList<LogoActivity> logoActivity) {
        this.logoActivity = logoActivity;
    }

    @NonNull
    @Override
    public LogoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.activity_logo_adapter, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogoAdapter.ViewHolder holder, int position) {
        holder.logo.setImageResource(logoActivity.get(position).getLogo());
        holder.outlet.setText(logoActivity.get(position).getOutlet());
    }

    @Override
    public int getItemCount() {
        return logoActivity.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView outlet;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.Logo);
            outlet = itemView.findViewById(R.id.Nama);
        }
    }
}