package com.example.kernel.interf;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public interface IJsonParser {

    String parse(Object obj);

    <T> T parse(String text, Class<T> clazz);
}
