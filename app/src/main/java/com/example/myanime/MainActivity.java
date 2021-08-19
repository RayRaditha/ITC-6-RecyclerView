package com.example.myanime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Anime> listAnime;
    private RecyclerView recyclerView;
    private AnimeListAdapter listAdapter;
    private AnimeGridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibProfile = findViewById(R.id.ib_profile);
        ibProfile.setOnClickListener(this);

        recyclerView = findViewById(R.id.rv_item);

        listAnime = DataDummy.getAllDataDummy();

        recyclerView.setHasFixedSize(true);
        setLinearList();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib_profile) {
            Intent moveIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(moveIntent);
        }
    }

    void setLinearList(){
        listAdapter = new AnimeListAdapter(listAnime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    void setGridList() {
        gridAdapter = new AnimeGridAdapter(listAnime);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(gridAdapter);
    }
}