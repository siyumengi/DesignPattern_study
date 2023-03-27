package com.sym.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDGreekPizza");
        System.out.println(name + "preparing");
    }
}
