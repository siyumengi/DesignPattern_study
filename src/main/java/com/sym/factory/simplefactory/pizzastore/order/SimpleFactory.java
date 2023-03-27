package com.sym.factory.simplefactory.pizzastore.order;

import com.sym.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.sym.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.sym.factory.simplefactory.pizzastore.pizza.Pizza;

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
