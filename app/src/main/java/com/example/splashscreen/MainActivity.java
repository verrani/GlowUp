package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int loading_time=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(MainActivity.this, ActivityHome.class);
                startActivity(home);
                finish();
            }
        },loading_time);
    }
}