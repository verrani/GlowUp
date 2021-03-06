package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TipsnTricks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsn_tricks);
    }
    public void MoveLayout(View view) {
        Intent intent = new Intent(TipsnTricks.this, Article.class);
        startActivity(intent);
    }

    public void MoveLayout2(View view) {
        Intent intent = new Intent(TipsnTricks.this, article_skincare.class);
        startActivity(intent);
    }

    public void TimerLayout(View view) {
        Intent intent = new Intent(TipsnTricks.this, article_haircare.class);
        startActivity(intent);
    }

    public void Playlist(View view) {
        Intent intent = new Intent(TipsnTricks.this, article_bodycare.class);
        startActivity(intent);
    }

}