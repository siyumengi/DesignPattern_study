package com.sym.decorator;

public abstract class Drink {
    private String des;//描述
    private float price;//价格

//    计算费用的抽象方法
//    子类实现
    public abstract float cost();
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
