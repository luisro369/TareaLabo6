package com.luisro00005513.tarealabo6.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisro on 5/14/18.
 */

public class RestaurantPagerAdapter extends FragmentPagerAdapter {

    //===============variables======================
    List<String> titleList;
    List<Fragment> fragmentList;

    public RestaurantPagerAdapter(FragmentManager fm) {
        super(fm);
        this.titleList = new ArrayList<>();
        this.fragmentList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
    //-------------------metodos------------------
    public void addItem(String title,Fragment fragment){
        titleList.add(title);
        fragmentList.add(fragment);

    }//add item


}
