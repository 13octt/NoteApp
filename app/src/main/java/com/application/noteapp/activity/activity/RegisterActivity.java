package com.application.noteapp.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.application.noteapp.R;

public class RegisterActivity extends AppCompatActivity {

    EditText user, email, pass, rePass;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user = (EditText) findViewById(R.id.et_user_name);
        pass = (EditText) findViewById(R.id.et_password);
        email = (EditText) findViewById(R.id.et_email);
        rePass = (EditText) findViewById(R.id.et_re_password);
        register = (Button) findViewById(R.id.register_app);

        register.setOnClickListener(view -> {
            // Check condition for register

        });
    }
}