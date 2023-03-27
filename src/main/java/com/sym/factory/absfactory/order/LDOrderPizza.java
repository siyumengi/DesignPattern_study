package com.sym.factory.absfactory.order;



import com.sym.factory.absfactory.pizza.LDCheesePizza;
import com.sym.factory.absfactory.pizza.LDGreekPizza;
import com.sym.factory.absfactory.pizza.Pizza;


public class LDOrderPizza implements AbsFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
