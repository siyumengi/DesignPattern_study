package com.sym.visitor;


public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给出了失败的评价");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println("女人给出了失败的评价");

    }
}
