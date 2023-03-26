package com.sym.singleton;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton2 {
    //    2.定义一个静态 instance
    private static Singleton2 instance;

    //    3.静态方法
    static {
        instance = new Singleton2();
    }

    //    1.先将构造器私有化
    private Singleton2() {

    }

    //    4.提供一个公共方法获取 instance
    public static Singleton2 getInstance() {
        return instance;
    }

}