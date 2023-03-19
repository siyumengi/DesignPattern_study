package com.sym.singletonpattern;

/**
 * 单例模式-懒汉式
 * 双重校验
 * 线程安全-推荐
 */
public class IdlerSingleton3 {
    private static IdlerSingleton3 idlerSingleton = null;

    private IdlerSingleton3() {
    }

    //保证了 懒加载和线程安全
    public static IdlerSingleton3 getInstance() {
        if (idlerSingleton == null) {
            synchronized (IdlerSingleton3.class) {
                if (idlerSingleton == null) {
                    idlerSingleton = new IdlerSingleton3();
                }
            }
        }
        return idlerSingleton;
    }
}
