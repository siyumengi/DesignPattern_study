package com.sym.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("静态代理方式");
        TeacherDao teacherDao = new TeacherDao();
        TeacherProxy proxy = new TeacherProxy(teacherDao);
        proxy.teach();
    }
}
