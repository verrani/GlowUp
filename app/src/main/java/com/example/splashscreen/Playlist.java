package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
    }
    public void homepage(View view) {
        Intent intent = new Intent(Playlist.this, homepage.class);
        startActivity(intent);
    }
    public void HappyVibes(View view) {
        Intent intent = new Intent(Playlist.this, HappyVibes.class);
        startActivity(intent);
    }
    public void OldVibes(View view) {
        Intent intent = new Intent(Playlist.this, OldVibes.class);
        startActivity(intent);
    }
    public void StudyMask(View view) {
        Intent intent = new Intent(Playlist.this, StudyMask.class);
        startActivity(intent);
    }
    public void relax(View view) {
        Intent intent = new Intent(Playlist.this, RelaxPlaylist.class);
        startActivity(intent);
    }
}