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

public class Bhajan_pdf_shiva extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bhajan_pdf_shiva);


        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pdfView = findViewById(R.id.pdfView_bhajan_shiva);

        String getitem = getIntent().getStringExtra("jaymataji");


        pdfView.fromAsset("shiv-gujarati-bhajan.pdf").load();
    }
}