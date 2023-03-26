package com.sym.uml.dependence;

public class Son {
    public void pay(Father father){
        System.out.println("father pay");
    }

    public Mother name(){
        return new Mother();
    }
}
