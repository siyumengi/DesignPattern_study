package com.sym.builder.improve;

public class Client {
    public static void main(String[] args) {
//        普通房子建造
        CommonBuilding commonBuilding = new CommonBuilding();
        HouseDirector houseDirector = new HouseDirector(commonBuilding);
        houseDirector.constructHouse();
//        高楼建造
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();


    }
}
