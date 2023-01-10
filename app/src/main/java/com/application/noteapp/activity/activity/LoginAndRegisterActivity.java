package com.application.noteapp.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.application.noteapp.R;

public class LoginAndRegisterActivity extends AppCompatActivity {

    Button btnLogin, btnRegiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_register);

        // Reference
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegiter = (Button) findViewById(R.id.btn_register);

        // Go to login screen
        btnLogin.setOnClickListener(view ->{
            Intent loginScreen = new Intent(LoginAndRegisterActivity.this, LoginActivity.class);
            startActivity(loginScreen);
        });

        // Go to register screen
        btnRegiter.setOnClickListener(view -> {
            Intent registerScreen = new Intent(LoginAndRegisterActivity.this, RegisterActivity.class);
            startActivity(registerScreen);
        });
    }
}