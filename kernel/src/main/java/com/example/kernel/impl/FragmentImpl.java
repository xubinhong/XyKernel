package com.example.kernel.impl;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.kernel.interf.IFragment;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/31
 */
public class FragmentImpl implements IFragment {

    private static final String TAG = "FragmentImpl";

    @Override
    public void replace(AppCompatActivity activity, @IdRes int layoutId, Fragment fragment) {
        try {
            FragmentManager manager = activity.getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(layoutId, fragment);
            transaction.commitNowAllowingStateLoss();
        } catch (Throwable t) {
            Log.i(TAG, t.getMessage());
        }
    }
}
