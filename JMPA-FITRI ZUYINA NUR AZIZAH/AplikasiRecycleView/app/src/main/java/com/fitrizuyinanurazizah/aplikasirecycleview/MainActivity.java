package com.fitrizuyinanurazizah.aplikasirecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvTreasure = findViewById(R.id.rv_treasure);

        List<TreasureModel> treasure = new ArrayList<>();
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/6b/f2/f7/6bf2f720b4428d993f208cb39782f511.jpg", "So Junghwan"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/97/73/4e/97734e966fba3b0c2e08d2c798d52907.jpg", "Park Jeongwoo"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/f0/7e/40/f07e40dfcf1199bc579884ffa87f60ca.jpg", "Watanabe Haruto"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/a1/99/85/a19985bdbaade9f5671d19d7c3e1f4eb.jpg", "Kim Doyoung"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/e0/fb/1e/e0fb1e7f3f3cc8394d7f29a8ff8f0377.jpg", "Bang Yedam"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/88/12/c6/8812c6c32399541d9e39d37d8dc15065.jpg", "Hamada Asahi"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/b6/a7/51/b6a75107d5f51929eff16638a40772c8.jpg", "Yoon Jaehyun"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/31/ab/3d/31ab3d1b043a734a8f268074921ed2f6.jpg", "Takata Mashiho"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/09/89/62/09896281a7a9dea69ce03b945a428e43.jpg", "Kim Junkyu"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/97/8b/2a/978b2a77fdc76c9bfa41d7e0c5075aae.jpg", "Kanemoto Yoshinori"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/ed/b0/86/edb0869c09c86e57523feb333e72d698.jpg", "Park Jihoon"));
        treasure.add(new TreasureModel("https://i.pinimg.com/564x/85/bb/e3/85bbe34f16378545a64689ea6a90471f.jpg", "Choi Hyunsuk"));

        TreasureAdapter adapter = new TreasureAdapter(this, treasure);
        rvTreasure.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvTreasure.setLayoutManager(layoutManager);
    }
}