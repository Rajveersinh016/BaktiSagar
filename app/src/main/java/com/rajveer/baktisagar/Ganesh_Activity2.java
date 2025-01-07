package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Ganesh_Activity2 extends AppCompatActivity {

  ListView listView;


    int[] logo = {R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo
            ,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo};

    String[] name = {"Ganesh Arti(Gujarati)","Ganesh Arti(Hindi)","Ganesh path(Gujrati)","Ganesh path(Hindi)","Ganesh chalisa(Gujrati)","Ganesh chalisa(Hindi)","Ganesh Stotra(Gujrati)","Ganesh Stotra(Hindi)","Ganesh Mantra(Hindi)"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh2);

        listView = findViewById(R.id.Ganesh_pdf);


        GaneshCustomeAdapter mycutomAdapter = new GaneshCustomeAdapter(this,logo,name);
        listView.setAdapter(mycutomAdapter);




        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

      // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           // @Override
           // public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               // String item = listView.getItemAtPosition(i).toString();
              // Intent start = new Intent(Ganesh_Activity2.this,pdf_view.class);
             //  start.putExtra("name",item);
           //  startActivity(start);

          //  }
       // });

        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         //   @Override
          //  public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // String item = listView.getItemAtPosition(i).toString();
              //  Intent intent = new  Intent(Ganesh_Activity2.this,pdf_view.class);
             //   intent.putExtra("jaymataji",item);
             //   startActivity(intent);
          //  }
        //});

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent= new Intent(getApplicationContext(),pdf_view.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(getApplicationContext(),Ganesh_pdf_arti_hindi.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_path_gujrati.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_path_hindi.class);
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_chalisha_gujrati.class);
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_chalisha_hindi.class);
                    startActivity(intent);
                }
                else if (i==6){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_stotra_gujrati.class);
                    startActivity(intent);
                }
                else if (i==7){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_stotra_hindi.class);
                    startActivity(intent);
                }
                else if (i==8){
                    Intent intent = new Intent(getApplicationContext(),ganesh_pdf_mantra_hindi.class);
                    startActivity(intent);
                }
            }
        });

    }
}