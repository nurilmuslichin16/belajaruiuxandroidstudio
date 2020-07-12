package com.example.uiux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cuaca extends AppCompatActivity {

    ImageView imgSunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuaca);

        imgSunny = (ImageView) findViewById(R.id.imgSunny);
        imgSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toCuacaMalam = new Intent(Cuaca.this, CuacaMalam.class);
                startActivity(toCuacaMalam);
            }
        });

        getSupportActionBar().hide();
    }
}