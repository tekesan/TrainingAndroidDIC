package com.catha.digimaster.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.catha.digimaster.R;

public class SplashScreen extends AppCompatActivity {
int interval=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
Intent namaintent = new Intent(SplashScreen.this,MainActivity.class);
    startActivity(namaintent);
    finish();
    }
},interval);



    }
}