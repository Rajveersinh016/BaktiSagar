package com.rajveer.baktisagar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class VishnuActivity extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo};

    String[] name = {"Shree_Vishnu_ji-ki_aarti(Gujrati)","vishnu-sahastranam-namavali-stotra"};



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vishnu);

        listView = findViewById(R.id.Vishnu_pdf_list);

        VishnuCustomerAdapter mycutomAdapter = new VishnuCustomerAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent= new Intent(getApplicationContext(), Vishnu_pdf_arti_Gujrati.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(getApplicationContext(), vishnu_pdf_sahastranam_namavali_stotra.class);
                    startActivity(intent);
                }
            }
        });

    }
}