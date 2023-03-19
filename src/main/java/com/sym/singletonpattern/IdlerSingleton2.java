package com.sym.singletonpattern;

/**
 * 单例模式-懒汉式
 * 线程安全，效率慢不推荐
 */
public class IdlerSingleton2 {
    private static IdlerSingleton2 idlerSingleton = null;

    private IdlerSingleton2() {
    }

    //    在方法上加锁是安全的
    public static synchronized IdlerSingleton2 getInstance() {
        if (idlerSingleton == null) {
            idlerSingleton = new IdlerSingleton2();
        }
        return idlerSingleton;
    }
//    在 new 上加锁是不安全的
//  public static IdlerSingleton2 getInstance() {
//    if (idlerSingleton == null) {
//        synchronized(IdlerSingleton2){
//    idlerSingleton = new IdlerSingleton2();
//          }
//
//    }
//    return idlerSingleton;
//}
}
