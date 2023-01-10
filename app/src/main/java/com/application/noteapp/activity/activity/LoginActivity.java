package com.application.noteapp.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.application.noteapp.R;

public class LoginActivity extends AppCompatActivity {

    EditText user, pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.et_user_name);
        pass = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.login_app);

        login.setOnClickListener(view ->{
            // Check condition if user and password is true



            // Go to MainScreen
            Intent mainScreen = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(mainScreen);
        });

    }
}