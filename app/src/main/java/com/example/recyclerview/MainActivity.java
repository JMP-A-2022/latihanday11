package com.example.recyclerview;

import static com.example.recyclerview.DataClubActivity.ITEM_EXTRA;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(list);
        rvClub.setAdapter(listClubAdapter);

        listClubAdapter.setOnItemClickCallback(new ListClubAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Club club) {
                Intent move = new Intent(MainActivity.this, DataClubActivity.class);
                move.putExtra(DataClubActivity.ITEM_EXTRA, club);
                startActivity(move);
            }
        });
    }

}