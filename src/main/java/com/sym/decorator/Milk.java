package com.sym.decorator;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setPrice(2.0f);
        setDes("牛奶");
    }
}
