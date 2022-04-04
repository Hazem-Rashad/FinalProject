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

public class MainActivityVR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vr);
        ArrayList<Video> video = new ArrayList<>();
        ListView listView3 = findViewById(R.id.listviwevr);

        Video egyppt = new Video("مصر","الجيزة",R.drawable.egypt,"android.resource://" + getPackageName()+ "/"+ R.raw.cairop);
        video.add(egyppt);
        Video egyppt1 = new Video("مصر","الجيزة",R.drawable.egypt,"android.resource://" + getPackageName()+ "/"+ R.raw.cairoa);
        video.add(egyppt1);

        VideoAdapter videoAdapter =new VideoAdapter(this , 0 , video);
        listView3.setAdapter(videoAdapter);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Video  thisvideo = video.get(i);
                Intent detailsIntentV = new Intent(MainActivityVR.this , DetailActivityV.class);
               detailsIntentV.putExtra("video",thisvideo );
               startActivity(detailsIntentV);
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_viwe);

        bottomNavigationView.setSelectedItemId(R.id.homeId);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.homeId:
                        Intent intent = new Intent(MainActivityVR.this , MainActivityMain.class);
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
                        Intent back = new Intent(MainActivityVR.this , MainActivityMain.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }
}