package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityLogin extends AppCompatActivity {



    private EditText LogEmail, LogPassword;
    Button btnLogin;


    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LogEmail = findViewById(R.id.editTextTextPersonName3);
        LogPassword = findViewById(R.id.editTextTextPersonName4);
        btnLogin = findViewById(R.id.button2);

        mAuth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(view -> {
            loginUser();
        });

    }

    private void loginUser(){
        String email = LogEmail.getText().toString();
        String password = LogPassword.getText().toString();

        if (TextUtils.isEmpty(email)){
            LogEmail.setError("Email cannot be empty");
            LogEmail.requestFocus();
        }else if (TextUtils.isEmpty(password)){
            LogPassword.setError("Password cannot be empty");
            LogPassword.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(ActivityLogin.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ActivityLogin.this, homepage.class));
                    }else{
                        Toast.makeText(ActivityLogin.this, "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    public void MoveLayout(View view) {
        Intent intent = new Intent(ActivityLogin.this, homepage.class);
        startActivity(intent);
    }

}