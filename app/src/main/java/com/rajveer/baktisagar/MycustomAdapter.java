package com.rajveer.baktisagar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MycustomAdapter extends ArrayAdapter<String> {

    int[] logo;

    String[] name;

Activity context;

    public MycustomAdapter(Activity context1, int[] logo, String[] name) {
        super(context1,R.layout.godlist_item);
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
        View rowview = inflater.inflate(R.layout.godlist_item,null,true);


        CircleImageView circleImageView = rowview.findViewById(R.id.godlist_image);
        TextView textView =rowview.findViewById(R.id.god_name);

        circleImageView.setImageResource(logo[position]);
        textView.setText(name[position]);


        return rowview;
    }
}
