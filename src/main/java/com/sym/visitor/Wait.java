package com.sym.visitor;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人等会");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println("女人等会");

    }
}
