package com.sym.factory.simplefactory.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDGreekPizza");
        System.out.println(name + "preparing");
    }
}
