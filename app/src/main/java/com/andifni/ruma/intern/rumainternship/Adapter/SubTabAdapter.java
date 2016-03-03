package com.andifni.ruma.intern.rumainternship.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.andifni.ruma.intern.rumainternship.View.SubTabFragment;
import com.andifni.ruma.intern.rumainternship.View.TabFragment;


/**
 * Created by Andi Fajar on 04/03/2016.
 */
public class SubTabAdapter extends FragmentStatePagerAdapter {

    private int numOfTab;
    private int parentTabPosition;

    public SubTabAdapter(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                String tabLabel = numOfTab == 1 ? "F" : numOfTab == 2 ? "D" : "A";
                SubTabFragment tab = new SubTabFragment();
                tab.setLabel(tabLabel);
                return tab;
            case 1:
                String tabLabel1 = numOfTab == 2 ? "E" : "B";
                SubTabFragment tab1 = new SubTabFragment();
                tab1.setLabel(tabLabel1);
                return tab1;
            case 2:
                SubTabFragment tab2 = new SubTabFragment();
                tab2.setLabel("C");
                return tab2;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return this.numOfTab;
    }
}
