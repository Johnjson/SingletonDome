package com.qiaosen.singleton.dome3;

/**
 * Created by qiaosen on 2018/3/5.
 * 单例模式-双重检查-折中方案
 */
public final class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            // 同步代码块
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
