package com.rajveer.baktisagar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AmbamataCustomeAdapter extends ArrayAdapter<String> {
    int[] logo;

    String[] name;

    Activity context;

    public AmbamataCustomeAdapter(Activity context1, int[] logo, String[] name) {
        super(context1, R.layout.ganesh_listitem);
        this.logo = logo;
        this.name = name;
        this.context = context1;
    }

    @Override
    public int getCount() {
       return name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.ganesh_listitem,null,true);


        ImageView circleImageView = rowview.findViewById(R.id.ganesh_pdflogo);
        TextView textView =rowview.findViewById(R.id.ganesh_pdfname);

        circleImageView.setImageResource(logo[position]);
        textView.setText(name[position]);

        return rowview;
    }
}
