package com.sym.factory.absfactory.pizza;


public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println(name + "preparing");
    }
}
