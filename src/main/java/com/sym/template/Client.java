package com.sym.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("=================黑豆豆浆=================");
        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        System.out.println("=================花生豆浆=================");
        SoyaMilk pennantSoyaMilk = new PennantSoyaMilk();
        pennantSoyaMilk.make();
    }
}
