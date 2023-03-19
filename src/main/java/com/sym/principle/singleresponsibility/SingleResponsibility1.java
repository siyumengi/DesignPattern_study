package com.sym.principle.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}
//交通工具类
//1.在方式1的 run 方法中，违背了单一职责原则
//2.根据交通工具运行方式不同，分解不同类即可
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑");
    }
}
