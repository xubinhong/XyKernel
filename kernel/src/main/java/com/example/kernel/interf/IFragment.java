package com.example.kernel.interf;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/31
 */
public interface IFragment {

    void replace(AppCompatActivity activity, @IdRes int layoutId, Fragment fragment);
}
