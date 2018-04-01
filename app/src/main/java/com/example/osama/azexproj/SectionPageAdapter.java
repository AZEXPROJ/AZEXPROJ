package com.example.osama.azexproj;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahmoud reda on 01/04/2018.
 */

class SectionPageAdapter extends FragmentPagerAdapter {

    private List<android.support.v4.app.Fragment> fragmentList =new ArrayList<>();
    private List <String> fragmentTitleList = new ArrayList<>();

    public void addFragment (android.support.v4.app.Fragment fragment,String title){
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
