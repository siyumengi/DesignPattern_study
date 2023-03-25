package com.sym.principle.segregation.improve;

import org.junit.Test;

import static org.junit.Assert.*;

public class Segregation1Test {
    @Test
    public void test(){
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }

    @Test
    public void test1(){
        String str = "aaa";
        System.out.println(str);
        for (int i = 0 ; i < str.length() ; i ++){
            System.out.println(str.toCharArray()[i]);
        }
    }
}