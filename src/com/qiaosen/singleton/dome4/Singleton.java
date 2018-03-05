package com.qiaosen.singleton.dome4;

/**
 * Created by qiaosen on 2018/3/5.
 * 单例模式-静态内部类-多线程推荐使用
 */
public final class Singleton {

    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }

    public static class SingletonHolder{
        private static Singleton singleton = new Singleton();
    }
}
