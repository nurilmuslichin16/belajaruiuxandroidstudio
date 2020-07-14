package com.example.uiux;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView cardCuaca;
    CardView cardProfile;
    CardView cardProduct;
    CardView cardShare;
    CardView cardExit;

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

        cardProduct = (CardView) findViewById(R.id.card_product);
        cardProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toProduct = new Intent(Dashboard.this, Product.class);
                startActivity(toProduct);
            }
        });

        cardShare = (CardView) findViewById(R.id.card_share);
        cardShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toShare =  new Intent(Dashboard.this, ShareApp.class);
                startActivity(toShare);
            }
        });

        cardExit = (CardView) findViewById(R.id.card_exit);
        cardExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Dashboard.this);
                builder.setTitle("Exit App");
                builder.setMessage("Do you want to exit ??");
                builder.setPositiveButton("Yes. Exit now!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        System.exit(0);
                    }
                });
                builder.setNegativeButton("Not now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialogExit = builder.create();
                dialogExit.show();
            }
        });

        getSupportActionBar().setTitle("Home");
        getSupportActionBar().show();
    }
}