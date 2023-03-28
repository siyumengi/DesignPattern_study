package com.sym.factory.simplefactory.order;

import com.sym.factory.simplefactory.pizza.Pizza;
import com.sym.factory.simplefactory.pizza.CheesePizza;
import com.sym.factory.simplefactory.pizza.GreekPizza;

public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }

    public static Pizza createPizzaStatic(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
