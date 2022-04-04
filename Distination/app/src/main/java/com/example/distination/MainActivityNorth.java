package com.example.distination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivityNorth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_north);
        ArrayList<Countries> countries = new ArrayList<>();
        ListView listView1 = findViewById(R.id.listviwenorth);




        CountryAdapter countryAdapter =new CountryAdapter(this , 0 , countries);
        listView1.setAdapter(countryAdapter);



        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Countries  thiscountry = countries.get(i);
                Intent detailsIntent = new Intent(MainActivityNorth.this , DetailActivity.class);
                detailsIntent.putExtra("country", thiscountry);
                startActivity(detailsIntent);

            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_viwe);

        bottomNavigationView.setSelectedItemId(R.id.homeId);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.homeId:
                        Intent intent = new Intent(MainActivityNorth.this , MainActivityMain.class);
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
                        Intent back = new Intent(MainActivityNorth.this , MainActivityQ.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}