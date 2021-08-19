package com.example.myanime;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_ANIME = "extra_anime";
    private Anime anime;
    private ImageView ivAnime;
    private TextView tvTitle, tvTags, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivAnime = findViewById(R.id.iv_anime);
        tvTitle = findViewById(R.id.tv_title);
        tvTags = findViewById(R.id.tv_tags);
        tvDetail = findViewById(R.id.tv_details);

        anime = getIntent().getParcelableExtra(EXTRA_ANIME);

        Picasso.get()
                .load(anime.getImage())
                .into(ivAnime);
        tvTitle.setText(anime.getTitle());
        tvTags.setText(anime.getTags());
        tvDetail.setText(anime.getDetail());
    }
}