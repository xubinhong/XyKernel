package com.example.kernel;

import android.app.Application;

import com.example.kernel.impl.JsonParserImpl;
import com.example.kernel.impl.StorageImpl;
import com.example.kernel.interf.IJsonParser;
import com.example.kernel.interf.IStorage;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public class XyKernel {

    private static final IStorage storage = new StorageImpl();
    private static final IJsonParser jsonParser = new JsonParserImpl();

    /************ 初始化 ************/

    public static void init(Application app) {
        storage.init(app);
    }

    /************ 获取基础库实例 ************/

    public static IStorage storage() {
        return storage;
    }

    public static IJsonParser jsonParser() {
        return jsonParser;
    }
}
