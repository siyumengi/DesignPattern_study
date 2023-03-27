package com.sym.factory.absfactory.order;


import com.sym.factory.absfactory.pizza.Pizza;

public interface AbsFactory {
    Pizza createPizza(String type);
}
