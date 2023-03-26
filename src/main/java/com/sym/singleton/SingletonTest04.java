package com.sym.singleton;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton4 {
    //    1. 定义静态变量
    private static Singleton4 instance;

    //    2.构造方法私有化
    private Singleton4() {
    }

    //    3.通过一个静态公有方法返回，加锁即可保证线程安全
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}