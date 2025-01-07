package com.rajveer.baktisagar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewpagerAdapter extends FragmentPagerAdapter {

    public viewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new MainFragment();
        }
        else if (position == 1)
        {
            return new MusicFragment();
        }
        else {
            return new MainFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Home";
        }
        else {
            return "Music";
        }

    }
}
