package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
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