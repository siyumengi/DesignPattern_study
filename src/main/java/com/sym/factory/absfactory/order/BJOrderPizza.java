package com.sym.factory.absfactory.order;


import com.sym.factory.absfactory.pizza.BJCheesePizza;
import com.sym.factory.absfactory.pizza.BJGreekPizza;
import com.sym.factory.absfactory.pizza.Pizza;

public class BJOrderPizza implements AbsFactory {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
