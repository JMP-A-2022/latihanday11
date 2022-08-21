package putra.carel.tugasrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterBrand adapterBrand;
    private ArrayList<NamaBrandActivity> namaBrandActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapterBrand = new AdapterBrand(namaBrandActivity);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterBrand);
    }

    private void getData() {
        namaBrandActivity = new ArrayList<>();
        namaBrandActivity.add(new NamaBrandActivity("Nike", R.drawable.nike));
        namaBrandActivity.add(new NamaBrandActivity("Adidas", R.drawable.adidas));
        namaBrandActivity.add(new NamaBrandActivity("New Balance", R.drawable.newbalance));
        namaBrandActivity.add(new NamaBrandActivity("Puma", R.drawable.puma));
        namaBrandActivity.add(new NamaBrandActivity("Reebok", R.drawable.reebok));
        namaBrandActivity.add(new NamaBrandActivity("Diadora", R.drawable.diadora));
        namaBrandActivity.add(new NamaBrandActivity("Umbro", R.drawable.umbro));
        namaBrandActivity.add(new NamaBrandActivity("Mizuno", R.drawable.mizuno));
        namaBrandActivity.add(new NamaBrandActivity("Lotto", R.drawable.lotto));
    }
}