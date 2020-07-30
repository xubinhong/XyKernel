package com.example.kernel;

import android.app.Application;

import com.example.kernel.impl.FragmentImpl;
import com.example.kernel.impl.JsonImpl;
import com.example.kernel.impl.KvImpl;
import com.example.kernel.interf.IFragment;
import com.example.kernel.interf.IJson;
import com.example.kernel.interf.IKv;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public class XyKernel {
    private static IKv mKv = new KvImpl();
    private static IJson mJson = new JsonImpl();
    private static IFragment mFragment = new FragmentImpl();

    public static void init(Application app) {
        mKv.init(app);
    }

    // KV键值对
    public static IKv kv() {
        return mKv;
    }

    // JSON处理
    public static IJson json() {
        return mJson;
    }

    // Fragment处理
    public static IFragment fragment() {
        return mFragment;
    }
}
