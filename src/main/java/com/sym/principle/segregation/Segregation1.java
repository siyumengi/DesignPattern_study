package com.sym.principle.segregation;

public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements interface1 {

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

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");

    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");

    }
}

class D implements interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");

    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");

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
    public void depend1(interface1 interface1){
        interface1.operation1();
    }
    public void depend2(interface1 interface1){
        interface1.operation2();
    }
    public void depend3(interface1 interface1){
        interface1.operation3();
    }

}

/**
 * C 类通过接口 Interface1 依赖（使用）D 类，但是只会用到 1，4，5 方法
 */
class C {
    public void depend1(interface1 interface1){
        interface1.operation1();
    }
    public void depend4(interface1 interface1){
        interface1.operation4();
    }
    public void depend5(interface1 interface1){
        interface1.operation5();
    }

}
