package com.sym.principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface interface1 {
    void operation1();


}

interface interface2 {
    void operation2();

    void operation3();
}

interface interface3 {
    void operation4();

    void operation5();
}

class B implements interface1, interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");

    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");

    }

}

class D implements interface1, interface3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }


    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");

    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");

    }
}

/**
 * A 类通过接口 Interface1 依赖（使用）D 类，但是只会用到 1，2，3 方法
 */
class A {
    public void depend1(interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(interface2 interface2) {
        interface2.operation2();
    }

    public void depend3(interface2 interface2) {
        interface2.operation3();
    }

}

/**
 * C 类通过接口 Interface1 依赖（使用）D 类，但是只会用到 1，4，5 方法
 */
class C {
    public void depend1(interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(interface3 interface3) {
        interface3.operation4();
    }

    public void depend5(interface3 interface3) {
        interface3.operation5();
    }

}
