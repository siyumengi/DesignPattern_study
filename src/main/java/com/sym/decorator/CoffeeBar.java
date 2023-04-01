package com.sym.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("单点 order = " + order.cost());

        order = new Milk(order);
        System.out.println("order + Milk = " + order.cost());

        order = new Soy(order);
        System.out.println("order + Milk + Soy = " + order.cost());

        order = new Milk(order);
        System.out.println("order + Milk = " + order.cost());

        order = new Milk(order);
        System.out.println("order + Milk = " + order.cost());

    }
}
