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

public class MainActivityAsia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_asia);
        ArrayList<Countries> countries = new ArrayList<>();
        ListView listView1 = findViewById(R.id.listviweasia);

        Countries ku = new Countries("الكويت", "الدينار الكويتي",R.drawable.kuwait ,R.drawable.kuwaitmap,"soon" );
        Countries china= new Countries("الصين" , " يوان صيني" , R.drawable.china,R.drawable.chinamap,"soon" );
        Countries japan = new Countries("اليابان ", "الين الياباني", R.drawable.japan,R.drawable.japanmap,"soon" );
        Countries thailand = new Countries("تايلاند", "بات تايلاندي",R.drawable.thailand,R.drawable.thailandmap,"soon" );
        Countries saudiArabia = new Countries("المملكة العربية السعودية" , "الريال السعودي", R.drawable.sudia,R.drawable.sudiamap,"soon" );
        Countries Emirate  = new Countries("الامارات", "الدرهم الاماراتي", R.drawable.emarat,R.drawable.emaratmap,"soon" );
        Countries hongKong = new Countries("هونج كونج","دولار هونج كونج",R.drawable.hongkong,R.drawable.hongkongmap,"soon" );
        Countries singapore = new Countries("سينغافورا","دولار سنغافوري",R.drawable.singapoore,R.drawable.singapooremap,"soon" );
        Countries jordan = new Countries("الاردن","دينار اردني",R.drawable.jordan,R.drawable.jordanmapp,"soon" );
        Countries southKorea = new Countries("كوريا الجنوبية","وون كوري جنوبي",R.drawable.korea,R.drawable.koreamap,"soon" );
        Countries qatar = new Countries("قطر","ريال قطري",R.drawable.qatar,R.drawable.qatarmap,"soon" );
        Countries maldives = new Countries("المالديف","روفية مالديفية",R.drawable.maldives,R.drawable.maldivesmap,"soon" );



        countries.add(china);
        countries.add(japan);
        countries.add(thailand);
        countries.add(ku);
        countries.add(saudiArabia);
        countries.add(Emirate);
        countries.add(hongKong);
        countries.add(singapore);
        countries.add(jordan);
        countries.add(southKorea);
        countries.add(qatar);
        countries.add(maldives);



        CountryAdapter countryAdapter =new CountryAdapter(this , 0 , countries);
        listView1.setAdapter(countryAdapter);



        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Countries  thiscountry = countries.get(i);
                Intent detailsIntent = new Intent(MainActivityAsia.this , DetailActivity.class);
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
                        Intent intent = new Intent(MainActivityAsia.this , MainActivityMain.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        return true;

                    case  R.id.gpsId:
                        Intent intent3 = new Intent(Intent.ACTION_VIEW);
                        intent3.setData(Uri.parse("geo:34.0478630, 100.6196553"));
                        Intent chooser = Intent.createChooser(intent3,"maps");
                        startActivity(chooser);
                        return true;

                    case  R.id.backId:
                        Intent back = new Intent(MainActivityAsia.this , MainActivityQ.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });
    }
}