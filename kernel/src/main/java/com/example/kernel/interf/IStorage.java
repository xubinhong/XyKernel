package com.example.kernel.interf;

/**
 * [Author]
 * xubinhong
 *
 * [Date]
 * 2020/7/26
 */
public interface IStorage extends XyInitial {

    /********** 写 ***********/

    void save(String key, Object val);

    /********** 读 ***********/

    int get(String key, int defVal);

    long get(String key, long defVal);

    float get(String key, float defVal);

    double get(String key, double defVal);

    boolean get(String key, boolean defVal);

    String get(String key, String defVal);

    <T> T get(String key, Class<T> clazz);

    /********** 判断key是否存在 ***********/

    boolean contains(String key);

    /********** 删除 ***********/

    void delete(String key);
}
