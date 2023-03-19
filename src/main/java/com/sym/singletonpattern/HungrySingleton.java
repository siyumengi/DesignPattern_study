package com.sym.singletonpattern;

/**
 * 单例模式-饿汉式
 * 可用
 * 访问方式：HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
