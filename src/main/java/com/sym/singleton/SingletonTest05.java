package com.sym.singleton;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton5 {
    //    1. 定义静态变量
    private static Singleton5 instance;

    //    2.构造方法私有化
    private Singleton5() {
    }

    //    3.通过一个静态公有方法返回，加锁即可保证线程安全
    public static  Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }

            }
        }
        return instance;
    }
}