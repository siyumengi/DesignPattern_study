package com.sym.singletonpattern;

/**
 * 单例模式-懒汉式
 * 线程不安全，不可用
 */
public class IdlerSingleton {
    private static IdlerSingleton idlerSingleton = null;
    private IdlerSingleton(){}

    public static IdlerSingleton getInstance() {
        if (idlerSingleton == null){
            idlerSingleton = new IdlerSingleton();
        }
        return idlerSingleton;
    }
}
