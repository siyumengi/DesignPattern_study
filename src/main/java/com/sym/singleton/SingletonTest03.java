package com.sym.singleton;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton3 {
    //    1. 定义静态变量
    private static Singleton3 instance;

    //    2.构造方法私有化
    private Singleton3() {
    }

    //    3.通过一个静态公有方法返回
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}