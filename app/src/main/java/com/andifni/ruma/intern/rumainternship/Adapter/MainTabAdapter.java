package com.andifni.ruma.intern.rumainternship.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.andifni.ruma.intern.rumainternship.View.TabFragment;

/**
 * Created by Andi Fajar on 03/03/2016.
 */
public class MainTabAdapter extends FragmentStatePagerAdapter {

    private int numOfTab;

    public MainTabAdapter(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment tab1 = new TabFragment();
                return tab1;
            case 1:
                TabFragment tab2 = new TabFragment();
                return tab2;
            case 2:
                TabFragment tab3 = new TabFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
