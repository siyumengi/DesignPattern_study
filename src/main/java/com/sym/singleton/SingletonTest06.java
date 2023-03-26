package com.sym.singleton;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode = " + instance.hashCode());
        System.out.println("instance1.hashCode = " + instance1.hashCode());
    }
}

class Singleton6 {

    //    1.构造方法私有化
    private Singleton6() {
    }
    private static class SingletonInstance{
        private static final Singleton6 singleton6 = new Singleton6();
    }
    //    3.通过一个静态公有方法返回，加锁即可保证线程安全
    public static  Singleton6 getInstance() {

        return SingletonInstance.singleton6;
    }
}