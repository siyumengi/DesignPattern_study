package com.sym.factory.factorymethod.pizza;



public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDGreekPizza");
        System.out.println(name + "preparing");
    }
}
