package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ganesh_pdf_stotra_hindi extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh_pdf_stotra_hindi);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = findViewById(R.id.pdfView_stotara_hindi);

        String getitem = getIntent().getStringExtra("jaymataji");


        pdfView.fromAsset("ganpati_stotra(hindi).pdf").load();
    }
}