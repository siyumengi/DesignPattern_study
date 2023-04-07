package com.sym.flyweight;


public class ConcreteWebSite implements WebSite{
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布方式是"+ this.type + "，使用者是" + user.getName());
    }
}
