package com.example.fitmon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class viewpager_adapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> items;
    private ArrayList<String> itext;

    public viewpager_adapter(FragmentManager fm) {
        super(fm);
        items = new ArrayList<Fragment>();
        itext = new ArrayList<String>();

        items.add(new easy1());
        items.add(new easy2());
        items.add(new easy3());

        itext.add("wholeBody");
        itext.add("upperBody");
        itext.add("lowerBody");

    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return itext.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
