package com.example.uiux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CuacaMalam extends AppCompatActivity {

    ImageView imgNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuaca_malam);

        imgNight = (ImageView) findViewById(R.id.imgNight);
        imgNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCuacaSiang = new Intent(CuacaMalam.this, Cuaca.class);
                startActivity(toCuacaSiang);
            }
        });

        getSupportActionBar().hide();
    }
}