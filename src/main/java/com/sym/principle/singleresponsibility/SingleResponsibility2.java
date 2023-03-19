package com.sym.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

//交通工具类
//1.遵守了单一职责原则
//2.这样的改动很大，即将类分解，同时修改了客户端
//3.改进：直接修改
class RoadVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
class AirVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }
}
class WaterVehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在水上游");
    }
}
