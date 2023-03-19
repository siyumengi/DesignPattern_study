package com.sym.singletonpattern;

/**
 * 内部类
 * 推荐
 * ClassSingleton instance = ClassSingleton.getInstance();
 */
public class ClassSingleton {
    private ClassSingleton() {
    }

    private static class InnerClass {
        private static ClassSingleton classSingleton = new ClassSingleton();
    }

    public static ClassSingleton getInstance() {
        return InnerClass.classSingleton;
    }
}
