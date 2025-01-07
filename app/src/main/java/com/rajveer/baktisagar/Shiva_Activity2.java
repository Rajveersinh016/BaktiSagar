package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Shiva_Activity2 extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo
            ,R.drawable.pdf_logo};

    String[] name = {"Shiva Arti(Gujarati)","Shiva Arti(Hindi)","Shiva chalisa(Gujrati)","Shiva chalisa(Hindi)","Shiva Mantra(Gujarati)","Shiva Mantra(Hindi)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiva2);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView = findViewById(R.id.shiva_pdf_list);

       shivaCustomeAdapter mycutomAdapter = new shivaCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getApplicationContext(),shiv_pdf_arti_gujrati.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(getApplicationContext(),shiv_pdf_arti_hindi.class);
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(getApplicationContext(),shiv_pdf_chalisa_gujrati.class);
                    startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(getApplicationContext(), shiv_pdf_chalisa_hindi.class);
                    startActivity(intent);
                } else if (i == 4) {
                    Intent intent = new Intent(getApplicationContext(),shiv_pdf_mantra_gujrati.class);
                    startActivity(intent);
                }
                else if (i == 5) {
                    Intent intent = new Intent(getApplicationContext(),shiv_pdf_mantra_hindi.class);
                    startActivity(intent);
                }

            }

        });

    }
}