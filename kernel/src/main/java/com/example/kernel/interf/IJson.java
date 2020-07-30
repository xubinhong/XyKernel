package com.example.kernel.interf;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/31
 */
public interface IJson {

    String parse(Object obj);

    <T> T parse(String text, Class<T> clazz);
}
