package com.sym.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.RoadRun("摩托车");
        vehicle2.WaterRun("轮船");
        vehicle2.AirRun("飞机");
    }
}
//1.增加了方法
//2.虽然没有在类上遵守单一职责原则，但是在方法级别上遵守了单一职责
class Vehicle2 {
    public void RoadRun(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
    public void AirRun(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }
    public void WaterRun(String vehicle){
        System.out.println(vehicle + "在水上游");
    }
}

