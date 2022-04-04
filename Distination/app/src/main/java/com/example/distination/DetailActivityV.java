package com.example.distination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailActivityV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_v);

        VideoView videoView = findViewById(R.id.videoView);
        String video = "android.resource://" + getPackageName()+ "/";
        Uri uri = Uri.parse(video);
        videoView.setVideoURI(uri);
        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


        Bundle bundle =getIntent().getExtras();
        Video thisvideo = (Video) bundle.getSerializable("video");
        videoView.setVideoPath(thisvideo.getVideo());



        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_viwe);

        bottomNavigationView.setSelectedItemId(R.id.homeId);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.homeId:
                        Intent intent = new Intent(DetailActivityV.this , MainActivityMain.class);
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
                        Intent back = new Intent(DetailActivityV.this , MainActivityMain.class);
                        startActivity(back);
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });


    }

}