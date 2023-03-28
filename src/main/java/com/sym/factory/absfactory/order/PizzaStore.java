package com.sym.factory.absfactory.order;

import com.sym.factory.absfactory.pizza.BJGreekPizza;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza().setFactory(new BJOrderPizza());
    }
}
