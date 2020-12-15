package com.catha.digimaster.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.catha.digimaster.R;

public class SukaSukaActivity extends AppCompatActivity {
TextView tvsatu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suka_suka);
        tvsatu = findViewById(R.id.tv_satu);
        tvsatu.setText(getIntent().getStringExtra("kotak"));
    }
}