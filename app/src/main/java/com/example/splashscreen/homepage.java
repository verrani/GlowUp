package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class homepage extends AppCompatActivity {
    private int[] mImages = new int[]{
            R.drawable.carousel1, R.drawable.carousel2, R.drawable.carousel3
    };

    private final int[] mImagesAct = new int [] {
            R.layout.activity_about_us, R.layout.activity_tipsn_tricks, R.layout.activity_article_haircare
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });

        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                setContentView(mImagesAct[position]
                );
            }
        });
    }


    public void MoveLayout(View view) {
        Intent intent = new Intent(homepage.this, TipsnTricks.class);
        startActivity(intent);
    }
    public void ProfileLayout(View view) {
        Intent intent = new Intent(homepage.this, ProfileAccount.class);
        startActivity(intent);
    }
    public void TimerLayout(View view) {
        Intent intent = new Intent(homepage.this, BeautyTimer.class);
        startActivity(intent);
    }
    public void Playlist(View view) {
        Intent intent = new Intent(homepage.this, Playlist.class);
        startActivity(intent);
    }
    public void PlaylistHomepage(View view) {
        Intent intent = new Intent(homepage.this, HappyVibes.class);
        startActivity(intent);
    }
    public void NewestArticle(View view) {
        Intent intent = new Intent(homepage.this, Article.class);
        startActivity(intent);
    }
}