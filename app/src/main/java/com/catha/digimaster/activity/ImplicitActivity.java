package com.catha.digimaster.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.catha.digimaster.R;

public class ImplicitActivity extends AppCompatActivity {
    Button btnOpenWeb, btnShareTxt;
    EditText etUrl, etShareTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnShareTxt = findViewById(R.id.btnShareTxt);
        etUrl = findViewById(R.id.etUrl);
        etShareTxt = findViewById(R.id.etShareTxt);

        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite(v);
            }
        });

        btnShareTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareText(v);
            }
        });
    }

    public void shareText(View view){
        String shareTxt = etShareTxt.getText().toString();
        String mimeType = "text/plain";

        ShareCompat.IntentBuilder.from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.teks)
                .setText(shareTxt)
                .startChooser();
    }

    public void openWebsite(View v){
        //mengambil teks URL
        String url = etUrl.getText().toString();

        //parsing dari string ke Uri
        Uri webpage = Uri.parse(url);

        //mulai intent utk buka website
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        //validasi url bisa dibuka atau tidak 🤓🖥
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else{
            Log.d("ImplicitIntents", "ERROR. Can't handle this intent");
        }
    }


}