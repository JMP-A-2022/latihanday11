package putra.carel.tugasrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterBrand extends RecyclerView.Adapter<AdapterBrand.ViewHolder> {

    private ArrayList<NamaBrandActivity> namaBrandActivity;

    public AdapterBrand(ArrayList<NamaBrandActivity> namaBrandActivity) {
        this.namaBrandActivity = namaBrandActivity;
    }

    @NonNull
    @Override
    public AdapterBrand.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_brand, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBrand.ViewHolder holder, int position) {
        holder.namaBrand.setText(namaBrandActivity.get(position).getNamabrand());
        holder.logoBrand.setImageResource(namaBrandActivity.get(position).getLogobrand());

    }

    @Override
    public int getItemCount() {
        return namaBrandActivity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaBrand;
        ImageView logoBrand;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaBrand = itemView.findViewById(R.id.namabrand);
            logoBrand = itemView.findViewById(R.id.logobrand);
        }
    }
}
