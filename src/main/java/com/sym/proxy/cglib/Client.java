package com.sym.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        System.out.println("cglib ");
        Teach teach = new Teach();
        Teach proxyInstance = (Teach) new ProxyFactory(teach).getProxyInstance();
        proxyInstance.teach();
    }
}
