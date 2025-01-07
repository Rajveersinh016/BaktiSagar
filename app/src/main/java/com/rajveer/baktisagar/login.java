package com.rajveer.baktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class login extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lottieAnimationView = findViewById(R.id.lottieAnimationView);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              Intent intent = new Intent(getApplicationContext(),MainActivity.class);
             startActivity(intent);
            }
        },3000);




    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are You Sure You Want To Close")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();

                    }
                })
                .setNegativeButton("No",null)
                .show();
    }
}