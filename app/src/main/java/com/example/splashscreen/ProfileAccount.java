package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ProfileAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void HomeLayout(View view) {
        Intent intent = new Intent(ProfileAccount.this, homepage.class);
        startActivity(intent);
    }

}

