package com.sym.visitor;

public class WoMan extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
