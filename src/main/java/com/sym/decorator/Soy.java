package com.sym.decorator;

public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setPrice(1.0f);
        setDes("豆浆");
    }
}
