package com.example.distination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainqq);

        Button africa = findViewById(R.id.africa);
        Button asia = findViewById(R.id.asia);
        Button astralia = findViewById(R.id.astralia);
        Button europe = findViewById(R.id.europe);
        Button south = findViewById(R.id.south);
        Button north = findViewById(R.id.north);

        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivityAfrica.class);
                startActivity(intent);


            }
        });

        asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivityAsia.class);
                startActivity(intent);


            }
        });
        astralia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivityAstralia.class);
                startActivity(intent);


            }
        });
        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivityEarupe.class);
                startActivity(intent);


            }
        });
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivityNorth.class);
                startActivity(intent);


            }
        });
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityQ.this , MainActivitySouth.class);
                startActivity(intent);


            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_viwe);

        bottomNavigationView.setSelectedItemId(R.id.homeId);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.homeId:
                        Intent intent = new Intent(MainActivityQ.this , MainActivityMain.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        return true;

                    case  R.id.gpsId:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW);
                        intent3.setData(Uri.parse("geo:"));
                        Intent chooser = Intent.createChooser(intent3,"maps");
                        startActivity(chooser);
                        return true;

                    case  R.id.backId:
                        Intent back = new Intent(MainActivityQ.this , MainActivityMain.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

    }
}