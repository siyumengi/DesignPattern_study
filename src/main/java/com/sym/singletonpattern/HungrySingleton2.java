package com.sym.singletonpattern;

/**
 * 单例模式-饿汉式变化式
 * 可用
 * 访问方式：HungrySingleton2 hungrySingleton2 = HungrySingleton2.getHungrySingleton2();
 */
public class HungrySingleton2 {
    private static HungrySingleton2 hungrySingleton2 = null;
    static {
        hungrySingleton2 = new HungrySingleton2();
    }
    private HungrySingleton2(){}

    public static HungrySingleton2 getInstance() {
        return hungrySingleton2;
    }
}
