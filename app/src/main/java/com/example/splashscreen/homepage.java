package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class homepage extends AppCompatActivity {
    private int[] mImages = new int[]{
            R.drawable.one, R.drawable.two, R.drawable.three
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
}