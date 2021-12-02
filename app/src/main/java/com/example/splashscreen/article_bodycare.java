package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class article_bodycare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_bodycare);
    }
    public void ArticleBack(View view) {
        Intent intent = new Intent(article_bodycare.this, TipsnTricks.class);
        startActivity(intent);
    }
}