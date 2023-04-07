package com.sym.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite site1 = factory.getWebSiteFactory("新闻");
        site1.use(new User("jack"));
        WebSite site2 = factory.getWebSiteFactory("博客");
        site2.use(new User("tom"));
        WebSite  site3 = factory.getWebSiteFactory("博客");
        site3.use(new User("rose"));
        System.out.println(factory.getWebSiteFactoryCount());
    }
}
