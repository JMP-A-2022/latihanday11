package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DataClubActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_club);

        ImageView imgClub = findViewById(R.id.image_club);
        TextView tvClubName = findViewById(R.id.tv_club_name);
        TextView tvClubDetail = findViewById(R.id.tv_club_detail);

        Club club = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (club != null) {
            Glide.with(this)
                    .load(club.getPhoto())
                    .into(imgClub);
            tvClubName.setText(club.getName());
            tvClubDetail.setText(club.getDetail());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Club");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}