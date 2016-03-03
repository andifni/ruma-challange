package com.andifni.ruma.intern.rumainternship.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andifni.ruma.intern.rumainternship.R;

/**
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
        return inflater.inflate(R.layout.fragment_tab, container, false);
    }
}
