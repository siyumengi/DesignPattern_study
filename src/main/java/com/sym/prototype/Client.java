package com.sym.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 18, "白色");
        Sheep sheep1 = new Sheep("tom", 18, "白色");
        Sheep sheep2 = new Sheep("tom", 18, "白色");
        Sheep sheep3 = new Sheep("tom", 18, "白色");
        System.out.println("sheep" + sheep);
        System.out.println("sheep1" + sheep1);
        System.out.println("sheep2" + sheep2);
        System.out.println("sheep3" + sheep3);
    }
}
