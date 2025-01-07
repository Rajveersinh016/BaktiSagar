package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Krishna_Activity2 extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo
            ,R.drawable.pdf_logo};

    String[] name = {"Krishna Arti(Gujarati)","Krishan Arti(Hindi)","Krishna chalisa(Gujrati)","Krishna chalisa(Hindi)","Krishna ashtakam(Gujarati)","krishna ashtakam(Hindi)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishna2);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        listView = findViewById(R.id.krishna_pdf_list);

        krishnaCustomeAdapter mycutomAdapter = new krishnaCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getApplicationContext(),krishna_pdf_arti_gujrati.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(getApplicationContext(),krishna_pdf_aarti_hindi.class);
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(getApplicationContext(),krishna_pdf_chalisa_gujrati.class);
                    startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(getApplicationContext(), krishna_pdf_chalisa_hindi.class);
                    startActivity(intent);
                } else if (i == 4) {
                    Intent intent = new Intent(getApplicationContext(),krishna_pdf_ashtak_gujrati.class);
                    startActivity(intent);
                }
                else if (i == 5) {
                    Intent intent = new Intent(getApplicationContext(),krishna_pdf_ashtak_hindi.class);
                    startActivity(intent);
                }

            }

        });

    }


}