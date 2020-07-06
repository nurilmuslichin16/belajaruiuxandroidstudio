package com.example.uiux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btnToSignUp;
    Button btnToProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnToSignUp = (Button) findViewById(R.id.btnToSignUp);
        btnToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSignUp = new Intent(Login.this, MainActivity.class);
                startActivity(toSignUp);
            }
        });

        btnToProfile = (Button) findViewById(R.id.btnToProfile);
        btnToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toProfile = new Intent(Login.this, Profile.class);
                startActivity(toProfile);
            }
        });
    }
}