package com.example.distination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivityIntro extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainintro);

      timer = new Timer();
      timer.schedule(new TimerTask() {
          @Override
          public void run() {
              Intent intent = new Intent(MainActivityIntro.this, MainActivityMain.class);
              startActivity(intent);
              finish();
          }
      },10000);

    }



}