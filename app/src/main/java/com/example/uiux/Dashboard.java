package com.example.uiux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView cardCuaca;
    CardView cardProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cardCuaca = (CardView) findViewById(R.id.card_cuaca);
        cardCuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCuaca = new Intent(Dashboard.this, Cuaca.class);
                startActivity(toCuaca);
            }
        });

        cardProfile = (CardView) findViewById(R.id.card_profile);
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toProfile = new Intent(Dashboard.this, ProfileDashboard.class);
                startActivity(toProfile);
            }
        });

        getSupportActionBar().setTitle("Home");
        getSupportActionBar().show();
    }
}