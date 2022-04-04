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

public class MainActivityEarupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_earupe);
        ArrayList<Countries> countries = new ArrayList<>();
        ListView listView = findViewById(R.id.listviweeroupe);

        Countries ku = new Countries("الدنيمارك", " ",R.drawable.denimark1 ,R.drawable.ic_map,"soon" );
        Countries china= new Countries("فنلندا" , "  " , R.drawable.fnlanda,R.drawable.ic_map,"soon" );
        Countries japan = new Countries("ايرلندا ", " ", R.drawable.erlanda,R.drawable.ic_map,"soon" );
        Countries thailand = new Countries("نرويج", " ",R.drawable.nrweyg,R.drawable.ic_map,"soon" );
        Countries Emirate  = new Countries("السويد", " ", R.drawable.sweaad,R.drawable.ic_map,"soon" );
        Countries hongKong = new Countries("المملكة المتحدة ","",R.drawable.uk,R.drawable.ic_map,"soon" );
        Countries singapore = new Countries("بولندا"," ",R.drawable.boland,R.drawable.ic_map,"soon" );
        Countries jordan = new Countries("النمسا"," ",R.drawable.nemsa,R.drawable.ic_map,"soon" );
        Countries southKorea = new Countries("فرنسا ","  ",R.drawable.franch,R.drawable.ic_map,"soon" );
        Countries qatar = new Countries("المانيا"," ",R.drawable.germany,R.drawable.ic_map,"soon" );
        Countries maldives = new Countries("اسبانيا"," ",R.drawable.espain,R.drawable.ic_map,"soon" );
        Countries maldives2 = new Countries("اطاليا"," ",R.drawable.italy,R.drawable.ic_map,"soon" );



        countries.add(china);
        countries.add(japan);
        countries.add(thailand);
        countries.add(ku);
        countries.add(maldives2);
        countries.add(Emirate);
        countries.add(hongKong);
        countries.add(singapore);
        countries.add(jordan);
        countries.add(southKorea);
        countries.add(qatar);
        countries.add(maldives);


        CountryAdapter countryAdapter =new CountryAdapter(this , 0 , countries);
        listView.setAdapter(countryAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Countries  thiscountry = countries.get(i);
                Intent detailsIntent = new Intent(MainActivityEarupe.this , DetailActivity.class);
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
                        Intent intent = new Intent(MainActivityEarupe.this , MainActivityMain.class);
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
                        Intent back = new Intent(MainActivityEarupe.this , MainActivityQ.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}