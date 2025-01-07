package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class pdf_view extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = findViewById(R.id.pdfView);

        String getitem = getIntent().getStringExtra("jaymataji");


            pdfView.fromAsset("ganpati_arti(gujrati).pdf").load();

            //pdfView.fromAsset("ganpati_arti(hindi).pdf").load();
        //if (getitem.equals("Ganesh Arti(Hindi)")){
        //    pdfView.fromAsset("ganpati_arti(hindi).pdf").load();
      //  }




    }
}