package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class ActivityHome extends AppCompatActivity {

    private EditText RegEmail, RegPassword;
    private TextView tvSignIn;
    private Button btnRegister;

    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RegEmail = findViewById(R.id.RegistrationEmail);
        RegPassword = findViewById(R.id.RegistrationPassword);
        tvSignIn = findViewById(R.id.textView4);
        btnRegister = findViewById(R.id.button);

        mAuth = FirebaseAuth.getInstance();

        btnRegister.setOnClickListener(view -> {
            createUser();
        });
        tvSignIn.setOnClickListener(view ->{
            startActivity(new Intent(ActivityHome.this, ActivityLogin.class));
        });

    }

    private void createUser() {
        String email = RegEmail.getText().toString();
        String password = RegPassword.getText().toString();

        if (TextUtils.isEmpty(email)){
            RegEmail.setError("Email cannot be empty");
            RegEmail.requestFocus();
        } else if (TextUtils.isEmpty(password)){
            RegPassword.setError("Password cannot be empty");
            RegPassword.requestFocus();
        }else {
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(ActivityHome.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(ActivityHome.this, ActivityLogin.class));
                    } else {
                        Toast.makeText(ActivityHome.this, "Registration Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });


        }
    }
    public void MoveLayout(View view) {
        Intent intent = new Intent(ActivityHome.this, ActivityLogin.class);
        startActivity(intent);
    }
}