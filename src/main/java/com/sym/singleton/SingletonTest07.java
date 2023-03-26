package com.sym.singleton;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton7 instance =  Singleton7.INSTANCE;
        Singleton7 instance2 =  Singleton7.INSTANCE;
        System.out.println(instance2 == instance);
    }
}

enum Singleton7{
    INSTANCE;

}