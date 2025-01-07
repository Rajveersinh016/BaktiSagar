package com.rajveer.baktisagar;

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

public class Bhajan extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo};

    String[] name = {"shiv-gujarati-bhajan","krishna-gujarati-bhajan","Bhajan-Book"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bhajan);

        listView = findViewById(R.id.Bhajan_pdf);


        GaneshCustomeAdapter mycutomAdapter = new GaneshCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);




        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent= new Intent(getApplicationContext(),Bhajan_pdf_shiva.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(getApplicationContext(),Bhajan_pdf_krishna.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(getApplicationContext(),Bhajan_pdf_Gujrati.class);
                    startActivity(intent);
                }

            }
        });

    }
}