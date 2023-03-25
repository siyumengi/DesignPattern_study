package com.sym.principle.liskov;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));
        System.out.println("====================");
        B b = new B();
        System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.func2(11, 3));
    }
}

class A {
    //    返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//增加一个新功能，完成两个数的相加，然后和 9 求和
class B extends A {
    //重写了func1
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}