package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;


public class ProfileAccount extends AppCompatActivity {

    public ProfileAccount() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Button button_alert = findViewById(R.id.button74);
        button_alert.setOnClickListener(view -> showDialog());
    }
    public void homepage(View view) {
        Intent intent = new Intent(ProfileAccount.this, homepage.class);
        startActivity(intent);
    }

    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        alertDialogBuilder.setTitle("Quit from app?");

        alertDialogBuilder
                .setMessage("Press Yes to quit")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, id) -> ProfileAccount.this.finish())
                .setNegativeButton("Cancel", (dialog, id) -> dialog.cancel());

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void aboutus(View view) {
        Intent intent = new Intent(ProfileAccount.this, AboutUs.class);
        startActivity(intent);
    }
    public void termslayout(View view) {
        Intent intent = new Intent(ProfileAccount.this, TermsandCond.class);
        startActivity(intent);
    }

}
