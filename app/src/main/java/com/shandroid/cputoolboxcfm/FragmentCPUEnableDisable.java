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
public class FragmentCPUEnableDisable extends Fragment {

    View cpuEnableDisableView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cpuEnableDisableView = inflater.inflate(R.layout.cpu_enable_disable_layout, container, false);
        return cpuEnableDisableView;
    }
}
