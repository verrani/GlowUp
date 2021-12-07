package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class TermsandCond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
    }
    public void profileterms(View view) {
        Intent intent = new Intent(TermsandCond.this, ProfileAccount.class);
        startActivity(intent);
    }
}
