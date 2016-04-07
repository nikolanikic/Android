package com.nnikic.rcjeep;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nnikic on 4/6/2016.
 */
public class SplashActivity extends AppCompatActivity {
    MediaPlayer splashSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splashSound = MediaPlayer.create(SplashActivity.this, R.raw.vine);
        splashSound.start();
        Thread splashTimer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent mainIntent = new Intent("android.intent.action.MENU");
                    startActivity(mainIntent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        splashTimer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        splashSound.release();
    }
}
