package com.sym.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getdVDPlayer();
        this.popcorn = Popcorn.getPopcorn();
        this.projector = Projector.getPopcorn();
    }

    public void on(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
    }
    public void off(){
        dvdPlayer.off();
        projector.off();
        projector.off();
    }
    public void play(){
        dvdPlayer.play();
    }
}
