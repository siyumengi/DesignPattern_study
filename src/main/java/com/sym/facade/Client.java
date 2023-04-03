package com.sym.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.on();
        homeTheaterFacade.play();
        homeTheaterFacade.off();
    }
}
