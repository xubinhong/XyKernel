package com.example.kernel.impl;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.example.kernel.interf.IJsonParser;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public class JsonParserImpl implements IJsonParser {

    @Override
    public String parse(Object obj) {
        if (obj == null) {
            return null;
        }

        String val = null;

        try {
            val = JSON.toJSONString(obj);
        } catch (Throwable ignore) {
            // do nothing
        }

        return val;
    }

    @Override
    public <T> T parse(String text, Class<T> clazz) {
        if (TextUtils.isEmpty(text) || clazz == null) {
            return null;
        }

        T t = null;

        try {
            t = JSON.parseObject(text, clazz);
        } catch (Throwable ignore) {
            // do nothing
        }

        return t;
    }
}
