package com.sym.factory.factorymethod.pizza;



public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println(name + "preparing");
    }
}
