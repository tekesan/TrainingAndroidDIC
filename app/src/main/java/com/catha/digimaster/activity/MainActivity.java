package com.catha.digimaster.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.catha.digimaster.R;

public class MainActivity extends AppCompatActivity {
    Button btnsatu, btnNext, btnListView;
    EditText etsatu;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = 0;
        btnsatu = findViewById(R.id.btn_tambah);
        etsatu = findViewById(R.id.Et);
        btnNext = findViewById(R.id.btn_pindah);
        etsatu.setText(String.valueOf(total));
        btnListView = findViewById(R.id.btnListView);

        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total++;
                etsatu.setText(String.valueOf(total));
            }
        });

        //pindah ke list view
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inListView = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(inListView);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahkamar = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(pindahkamar);
            }
        });
    }
}
