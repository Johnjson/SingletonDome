package com.qiaosen.singleton.dome1;

/**
 * Created by qiaosen on 2018/3/5.
 * 单例模式-恶汉式-单线程推荐使用
 */
public final class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
