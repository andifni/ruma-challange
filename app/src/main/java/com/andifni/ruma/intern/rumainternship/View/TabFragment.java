package com.andifni.ruma.intern.rumainternship.View;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.andifni.ruma.intern.rumainternship.Adapter.SubTabAdapter;
import com.andifni.ruma.intern.rumainternship.R;

/**
 * Created by Andi Fajar on 03/03/2016.
 * A simple {@link com.andifni.ruma.intern.rumainternship.MainActivity} subclass.
 */
public class TabFragment extends Fragment {

    private int tabNumber;

    public TabFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab, container, false);
        // avoiding crash
        int page = 0;
        if (tabNumber != 0) page = tabNumber;

        //change page indicator
        final ImageView icon1 = (ImageView) v.findViewById(R.id.icn1);
        final ImageView icon2 = (ImageView) v.findViewById(R.id.icn2);
        final ImageView icon3 = (ImageView) v.findViewById(R.id.icn3);

        switch (page) {
            case 0:
                icon1.setVisibility(View.VISIBLE);
                icon2.setVisibility(View.VISIBLE);
                icon3.setVisibility(View.VISIBLE);
                break;
            case 1:
                icon1.setVisibility(View.VISIBLE);
                icon2.setVisibility(View.VISIBLE);
                icon3.setVisibility(View.GONE);
                break;
            case 2:
                icon1.setVisibility(View.VISIBLE);
                icon2.setVisibility(View.GONE);
                icon3.setVisibility(View.GONE);
                break;
            default:
        }
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.pager);
        SubTabAdapter adapter = new SubTabAdapter(getChildFragmentManager(), 3-page);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        icon1.setAlpha(255);
                        icon2.setAlpha(70);
                        icon3.setAlpha(70);
                        break;
                    case 1:
                        icon2.setAlpha(255);
                        icon1.setAlpha(70);
                        icon3.setAlpha(70);
                        break;
                    case 2:
                        icon3.setAlpha(255);
                        icon2.setAlpha(70);
                        icon1.setAlpha(70);
                        break;
                    default:
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return v;

    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }
}
