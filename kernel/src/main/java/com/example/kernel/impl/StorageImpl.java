package com.example.kernel.impl;

import android.app.Application;
import android.text.TextUtils;

import com.example.kernel.XyKernel;
import com.example.kernel.interf.IStorage;
import com.tencent.mmkv.MMKV;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public class StorageImpl implements IStorage {

    private MMKV kv;

    @Override
    public void init(Application app) {
        MMKV.initialize(app);
        kv = MMKV.mmkvWithID("XyKernel", MMKV.MULTI_PROCESS_MODE);
    }

    @Override
    public void save(String key, Object val) {
        if (val instanceof Integer) {
            kv.encode(key, (int) val);
        } else if (val instanceof Long) {
            kv.encode(key, (long) val);
        } else if (val instanceof Float) {
            kv.encode(key, (float) val);
        } else if (val instanceof Double) {
            kv.encode(key, (double) val);
        } else if (val instanceof Boolean) {
            kv.encode(key, (boolean) val);
        } else if (val instanceof String) {
            kv.encode(key, (String) val);
        } else {
            kv.encode(key, XyKernel.jsonParser().parse(val));
        }
    }

    @Override
    public int get(String key, int defVal) {
        return kv.decodeInt(key, defVal);
    }

    @Override
    public long get(String key, long defVal) {
        return kv.decodeLong(key, defVal);
    }

    @Override
    public float get(String key, float defVal) {
        return kv.decodeFloat(key, defVal);
    }

    @Override
    public double get(String key, double defVal) {
        return kv.decodeDouble(key, defVal);
    }

    @Override
    public boolean get(String key, boolean defVal) {
        return kv.decodeBool(key, defVal);
    }

    @Override
    public String get(String key, String defVal) {
        return kv.decodeString(key, defVal);
    }

    @Override
    public <T> T get(String key, Class<T> clazz) {
        return XyKernel.jsonParser().parse(kv.decodeString(key), clazz);
    }

    @Override
    public boolean contains(String key) {
        return kv.containsKey(key);
    }

    @Override
    public void delete(String key) {
        kv.removeValueForKey(key);
    }
}
