package com.example.day11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<LogoActivity> logoActivity = new ArrayList<>();
        logoActivity.add(new LogoActivity(R.drawable.fore, "Fore"));
        logoActivity.add(new LogoActivity(R.drawable.maxx, "Maxx Coffee"));
        logoActivity.add(new LogoActivity(R.drawable.starbuck, "Starbucks"));

        LogoAdapter logoAdapter = new LogoAdapter(logoActivity);
        RecyclerView RV = findViewById(R.id.recycleview);

        RecyclerView.LayoutManager LM = new LinearLayoutManager(MainActivity.this);
        RV.setLayoutManager(LM);
        RV.setAdapter(logoAdapter);
    }
}