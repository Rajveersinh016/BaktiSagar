package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Ambamata_Activity2 extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo};

    String[] name = {"Ambamata Arti(Gujarati)","Ambamata Arti(Hindi)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambamata2);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView =findViewById(R.id.ambamata_pdf_list);

        AmbamataCustomeAdapter mycutomAdapter = new AmbamataCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getApplicationContext(),Ambamata_pdf_arti_gujrati.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(getApplicationContext(),Ambamata_pdf_arti_hindi.class);
                    startActivity(intent);
                }

            }

        });

    }
}