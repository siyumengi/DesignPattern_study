package com.sym.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
//    集合，充当池作用
    private HashMap<String , ConcreteWebSite> pool = new HashMap<>();

//    根据网站的类型，返回一个网站，如果没有就创建一个网站，放入池中，返回
    public WebSite getWebSiteFactory(String type){
        if (!pool.containsKey(type)){
            pool.put(type , new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }
    public int getWebSiteFactoryCount(){
        return pool.size();
    }
}
