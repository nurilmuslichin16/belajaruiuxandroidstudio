package com.example.uiux;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_dashboard);

        getSupportActionBar().hide();
    }
}