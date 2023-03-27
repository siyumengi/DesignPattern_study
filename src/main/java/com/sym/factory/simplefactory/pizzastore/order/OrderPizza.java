package com.sym.factory.simplefactory.pizzastore.order;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.sym.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.sym.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.sym.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrderPizza {
//    构造器
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderPizza;
//        do {
//            orderPizza = getType();
//            if (orderPizza.equals("greek")){
//                pizza = new LDGreekPizza();
//            } else if (orderPizza.equals("cheese")) {
//                pizza = new CheesePizza();
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        } while (true);
//    }

    SimpleFactory factory;
    Pizza pizza = null;
    String orderType;

    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);
    }
    public OrderPizza() {

        do {
            orderType = getType();
            pizza = this.factory.createPizzaStatic(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }
        }while (true);
    }
    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
        do {
            orderType = getType();
            pizza = this.factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }
        }while (true);
    }

    private String getType() {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
