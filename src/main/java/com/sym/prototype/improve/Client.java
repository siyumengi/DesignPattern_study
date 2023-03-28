package com.sym.prototype.improve;



public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 18, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        System.out.println("sheep" + sheep);
        System.out.println("sheep1" + sheep1);
        System.out.println("sheep2" + sheep2);
        System.out.println("sheep3" + sheep3);
        System.out.println(sheep == sheep1);
        System.out.println(sheep1 == sheep2);
    }
}
