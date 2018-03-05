package com.qiaosen.singleton.dome2;

/**
 * Created by qiaosen on 2018/3/5.
 * 单例模式-懒汉式
 */
public final class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
