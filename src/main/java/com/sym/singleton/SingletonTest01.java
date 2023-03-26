package com.sym.singleton;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton {
    //    2.启动时就创建静态常量 instance
    private static final Singleton instance = new Singleton();

    //    1.先将构造器私有化
    private Singleton() {

    }

    //    3.提供一个公共方法获取 instance
    public static Singleton getInstance() {
        return instance;
    }

}