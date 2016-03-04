package com.andifni.ruma.intern.rumainternship.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andifni.ruma.intern.rumainternship.R;

/**
 * Created by Andi Fajar on 03/03/2016.
 * A simple {@link TabFragment} subclass.
 */
public class SubTabFragment extends Fragment {

    private String label;

    public SubTabFragment(){
        // Required empty public constructor
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sub_tab, container, false);
        TextView textView = (TextView) v.findViewById(R.id.label);
        // avoiding nullpointer
        String text = "A";
        if (label!=null && !"".equals(label)) text = label;

        textView.setText(text);
        return v;
    }

}
