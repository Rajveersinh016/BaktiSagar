package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class JalaramActivity2 extends AppCompatActivity {

    ListView listView;

    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo};

    String[] name = {"jalaram_arti(Gujrati)","jalaram_arti(Hindi)","jalaram_bavni(Gujrati)","jalaram_Mangal-path(hindi)"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalaram2);

        listView = findViewById(R.id.Jalaram_pdf);

        JalaramCustomeAdapter mycutomAdapter = new JalaramCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent= new Intent(getApplicationContext(),Jalaram_pdf_arti_gujrati.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(getApplicationContext(), jalaram_pdf_arti_hindi.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(getApplicationContext(), Jalaram_pdf_Bavni_Gujrati.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(getApplicationContext(), Jalaram_pdf_Mangle_path_hindi.class);
                    startActivity(intent);
                }
            }
        });




    }
}