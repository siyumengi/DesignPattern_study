package com.sym.factory.absfactory.order;



import com.sym.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    private AbsFactory factory;

    public void setFactory(AbsFactory factory) {
        this.factory =factory;
        String orderType = "";
        Pizza pizza = null;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
