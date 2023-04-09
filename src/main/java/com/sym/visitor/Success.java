package com.sym.visitor;


public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给出了成功的评价");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println("女人给出了成功的评价");

    }
}
