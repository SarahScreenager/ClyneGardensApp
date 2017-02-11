package com.example.sarah.clynegardensp1;


import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;



public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent splash = new Intent(getApplicationContext(),MainMenuActivity.class);
                    startActivity(splash);
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}







