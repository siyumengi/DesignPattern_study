package com.sym.factory.factorymethod.order;


import com.sym.factory.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new LDGreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
