package com.shandroid.cputoolboxcfm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 * Created by shane on 2016.07.30..
 */
public class FragmentAbout extends Fragment {

    View aboutView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        aboutView = inflater.inflate(R.layout.about_layout, container, false);
        return aboutView;
    }
}
