package com.example.design;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setItems(ArrayList<Fragment> fragments,ArrayList<String> title){

        this.fragments = fragments;
        this.titles = title;
    }

    @Override
    public Fragment getItem(int i){
        return fragments.get(i);
    }

    @Override
    public int getCount(){
        return titles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

}
