package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class krishna_pdf_arti_gujrati extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishna_pdf_arti_gujrati);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = findViewById(R.id.krishna_pdfView_arti_gujarati);

        String getitem = getIntent().getStringExtra("jaymataji");


        pdfView.fromAsset("krishna-aarti(gujrati).pdf").load();
    }
}