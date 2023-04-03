package com.sym.facade;

public class Projector {
    private static final Projector projector = new Projector();

    public static Projector getPopcorn() {
        return projector;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void focus() {
        System.out.println("popcorn focus");
    }


}
