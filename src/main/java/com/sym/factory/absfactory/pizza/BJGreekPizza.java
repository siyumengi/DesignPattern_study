package com.sym.factory.absfactory.pizza;


public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJGreekPizza");
        System.out.println(name + "preparing");
    }
}
