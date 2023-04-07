package com.sym.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        System.out.println("动态代理方式");
        TeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxyFactory = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyFactory.teach();
        System.out.println(proxyFactory.getClass());

    }
}
