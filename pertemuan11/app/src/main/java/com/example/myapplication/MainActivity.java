package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView vtuberr = findViewById(R.id.vtuber);

        List<VTuberData> listvtuber = new ArrayList<>();
        listvtuber.add(new VTuberData("Kobo Kanaeru", "https://static.wikia.nocookie.net/virtualyoutuber/images/3/3b/Kobo_Kanaeru_Portrait.png"));
        listvtuber.add(new VTuberData("Vestia Zeta", "https://static.wikia.nocookie.net/virtualyoutuber/images/b/b6/Vestia_Zeta_Portrait.png"));
        listvtuber.add(new VTuberData("Mythia Batford", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEp3sqz3mCidY768Sow0FAT58tKYe72DVQBg&usqp=CAU"));
        listvtuber.add(new VTuberData("Ayunda Risu", "https://static.wikia.nocookie.net/virtualyoutuber/images/d/de/Ayunda_Risu_-_Portrait.png"));
        listvtuber.add(new VTuberData("Ollie Kureji", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEPHOUkRAZCQc_pqwijMe9rzXC2VViNhdHmA&usqp=CAU"));
        VTuberAdapter adapter = new VTuberAdapter(this, listvtuber);
        vtuberr.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        vtuberr.setLayoutManager(layoutManager);
    }
}