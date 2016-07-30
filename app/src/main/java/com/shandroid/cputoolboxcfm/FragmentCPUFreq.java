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
public class FragmentCPUFreq extends Fragment {

    View cpuFreqView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cpuFreqView = inflater.inflate(R.layout.cpu_freq_layout, container, false);
        return cpuFreqView;
    }
}
