package com.rajveer.baktisagar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Jalaram_pdf_arti_gujrati extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jalaram_pdf_arti_gujrati);


            AdView mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

            pdfView = findViewById(R.id.jalaram_pdfView_arti_gujarati);

            String getitem = getIntent().getStringExtra("jaymataji");


            pdfView.fromAsset("jalaram_arti(Gujrati).pdf").load();
        }
    }
