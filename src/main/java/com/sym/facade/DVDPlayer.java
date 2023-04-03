package com.sym.facade;

public class DVDPlayer {
    private static final DVDPlayer dVDPlayer = new DVDPlayer();

    public static DVDPlayer getdVDPlayer() {
        return dVDPlayer;
    }

    public void on(){
        System.out.println("DVD on");
    }
    public void off(){
        System.out.println("DVD off");
    }
    public void play(){
        System.out.println("dvd play");
    }

    public void pause(){
        System.out.println("dvd pause");
    }
}
