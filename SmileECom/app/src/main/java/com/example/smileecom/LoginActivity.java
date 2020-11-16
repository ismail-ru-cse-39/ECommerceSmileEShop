package com.example.smileecom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText login_phone_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        login_phone_number = findViewById(R.id.login_phone_number_input);

        login_phone_number.setBackgroundColor(Color.TRANSPARENT);
    }
}