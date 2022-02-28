package com.example.demofragment_recycleview_tablayout_viewpager;

import android.content.ClipData;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = ItemListFragment.newInstance(0);
                break;
            case 1:
                fragment = ItemListFragment.newInstance(1);
                break;
            case 2:
                fragment = ItemListFragment.newInstance(2);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Việt Nam";
                break;
            case 1:
                title = "Nước Ngoài";
                break;
        }
        return title;
    }
}


