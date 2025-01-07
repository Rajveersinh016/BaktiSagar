package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Ganesh_pdf_arti_hindi extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh_pdf_arti_hindi);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = findViewById(R.id.pdfView_arti_hindi);

        String getitem = getIntent().getStringExtra("jaymataji_pdf_hindi");


        pdfView.fromAsset("ganpati_arti(hindi).pdf").load();
    }
}