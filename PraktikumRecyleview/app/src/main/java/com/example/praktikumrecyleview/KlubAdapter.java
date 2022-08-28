package com.example.praktikumrecyleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KlubAdapter extends RecyclerView.Adapter<KlubAdapter.Viewholder> {

    private ArrayList<KlubModel> klubModel;

    public KlubAdapter(ArrayList<KlubModel> klubModel) {
        this.klubModel = klubModel;
    }

    @NonNull
    @Override
    public KlubAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        Viewholder vh = new Viewholder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull KlubAdapter.Viewholder holder, int position) {
        holder.nama_klub.setText(klubModel.get(position).getNamaKlub());
        holder.logo_klub.setImageResource(klubModel.get(position).getLogoKlub());

    }

    @Override
    public int getItemCount() {
        return klubModel.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        TextView nama_klub;
        ImageView logo_klub;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            nama_klub = itemView.findViewById(R.id.nama_klub);
            logo_klub = itemView.findViewById(R.id.logo_klub);
            //done

        }
    }
}
