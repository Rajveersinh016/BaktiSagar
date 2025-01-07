package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Hanuman_Activity2 extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo
            ,R.drawable.pdf_logo};

    String[] name = {"Hanuman Arti(Gujarati)","Hanuman Arti(Hindi)","Hanuman chalisa(Gujrati)","Hanuman chalisa(Hindi)","Hanuman Mantra(Gujarati)","Hanuman Mantra(Hindi)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanuman2);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView =findViewById(R.id.hanuman_pdf_list);

        HanumanCustomeAdapter mycutomAdapter = new HanumanCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getApplicationContext(),hanuman_pdf_arti_gujarati.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(getApplicationContext(),hanuman_pdf_arti_hindi.class);
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(getApplicationContext(),hanuman_pdf_chalisa_gujarati.class);
                    startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(getApplicationContext(), hanuman_pdfView_chalisa_hindi.class);
                    startActivity(intent);
                } else if (i == 4) {
                    Intent intent = new Intent(getApplicationContext(),hanuman_pdf_mantra_gujarati.class);
                    startActivity(intent);
                }
                else if (i == 5) {
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_mantra_hindi.class);
                    startActivity(intent);
                }

            }

        });
    }
}