package com.example.praktikumrecyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KlubAdapter klubAdapter;
    private ArrayList<KlubModel> klubModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        klubAdapter = new KlubAdapter(klubModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(klubAdapter);
    }

    private void getData() {
        klubModel = new ArrayList<>();
        klubModel.add(new KlubModel("AC Milan", R.drawable.ic_acmilan));
        klubModel.add(new KlubModel("Arsenal", R.drawable.ic_arsenal));
        klubModel.add(new KlubModel("Barcelona", R.drawable.ic_barcelona));
        klubModel.add(new KlubModel("Chelsea", R.drawable.ic_chelsea));
        klubModel.add(new KlubModel("Juventus", R.drawable.ic_juventus));
        klubModel.add(new KlubModel("Liverpool", R.drawable.ic_liverpool));
        klubModel.add(new KlubModel("Manchester City", R.drawable.ic_manchestercity));
        klubModel.add(new KlubModel("Manchester United", R.drawable.ic_manchesterunited));
        klubModel.add(new KlubModel("Real Madrid", R.drawable.ic_realmadrid));

    }
}