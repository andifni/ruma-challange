package com.andifni.ruma.intern.rumainternship.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;

import com.andifni.ruma.intern.rumainternship.View.Tab1Fragment;
import com.andifni.ruma.intern.rumainternship.View.Tab2Fragment;
import com.andifni.ruma.intern.rumainternship.View.Tab3Fragment;

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
                Tab1Fragment tab1 = new Tab1Fragment();
                return tab1;
            case 1:
                Tab2Fragment tab2 = new Tab2Fragment();
                return tab2;
            case 2:
                Tab3Fragment tab3 = new Tab3Fragment();
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
