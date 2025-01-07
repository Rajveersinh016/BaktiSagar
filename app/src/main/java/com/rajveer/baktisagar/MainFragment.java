package com.rajveer.baktisagar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.DialogPropertiesPendulum;
import org.imaginativeworld.oopsnointernet.dialogs.pendulum.NoInternetDialogPendulum;


public class MainFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        GridView gridView;


        int[] logo = {R.drawable.ganesh, R.drawable.hanuman, R.drawable.shiva, R.drawable.ambamata, R.drawable.krishna
                , R.drawable.jalaram_bapa, R.drawable.vishnu, R.drawable.bhajan_logo};

        String[] name = {"Shree-Ganesh", "Bajrangbali", "lordShiva", "Ambamata", "Shree-Krishna", "Jalaram_bapa", "Shree-Vishnu", "Bhajan"};


        //NoInternetDialog();


        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
         @Override
        public void onInitializationComplete(InitializationStatus initializationStatus) {
        }
        });

        AdView mAdView =view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        gridView = view.findViewById(R.id.god_list);

        MycustomAdapter mycutomAdapter = new MycustomAdapter((Activity) getContext(), logo, name);
        gridView.setAdapter(mycutomAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getContext(), Ganesh_Activity2.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getContext(), Hanuman_Activity2.class);
                    startActivity(intent);

                } else if (position == 2) {
                    Intent intent = new Intent(getContext(), Shiva_Activity2.class);
                    startActivity(intent);

                } else if (position == 3) {
                    Intent intent = new Intent(getContext(), Ambamata_Activity2.class);
                    startActivity(intent);

                } else if (position == 4) {
                    Intent intent = new Intent(getContext(), Krishna_Activity2.class);
                    startActivity(intent);

                } else if (position == 5) {
                    Intent intent = new Intent(getContext(), JalaramActivity2.class);
                    startActivity(intent);

                } else if (position == 6) {
                    Intent intent = new Intent(getContext(), VishnuActivity.class);
                    startActivity(intent);

                } else if (position == 7) {
                    Intent intent = new Intent(getContext(), Bhajan.class);
                    startActivity(intent);

                }
            }
        });
        return view;


    }
}

