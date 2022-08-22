package com.firstapp.latihan_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LogoAdapter extends RecyclerView.Adapter<LogoAdapter.ViewHoder>{

    private Context context;
    private List<TeamLogo> items;

    public LogoAdapter(Context context, List<TeamLogo> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHoder(view);
    }

    public class ViewHoder extends RecyclerView.ViewHolder {

        ImageView logoImage;
        TextView nameText;


        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.logo_club);
            nameText = itemView.findViewById(R.id.nama_club);
        }

    }



    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {

        TeamLogo item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.nameText.setText(item.getName());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;

        //kode diatas merupakan shorthand dari kondisi if-else
//        if (items != null) {
//            return items.size();
//        } else {
//            return 0
//        }

    }


}
