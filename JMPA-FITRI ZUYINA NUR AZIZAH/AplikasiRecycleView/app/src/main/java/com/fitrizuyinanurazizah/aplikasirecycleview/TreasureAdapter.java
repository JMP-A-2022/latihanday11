package com.fitrizuyinanurazizah.aplikasirecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class TreasureAdapter extends RecyclerView.Adapter<TreasureAdapter.ViewHolder> {
    private Context context;

    public TreasureAdapter(Context context, List<TreasureModel> items) {
        this.context = context;
        this.items = items;
    }

    private List<TreasureModel> items;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_data, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TreasureAdapter.ViewHolder holder, int position) {
        TreasureModel item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.namaText.setText(item.getNama());
        Picasso.get().load(item.getImage()).into(holder.fotoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoImage;
        TextView namaText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoImage = itemView.findViewById(R.id.imgTreasure);
            namaText = itemView.findViewById(R.id.txtTreasure);
        }
    }
}
