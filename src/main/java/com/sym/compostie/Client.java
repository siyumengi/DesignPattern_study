package com.sym.compostie;

public class Client {
    public static void main(String[] args) {
//        大学
        OrganizationComponent university = new University("清华大学", "清华大学");
//        学院
        OrganizationComponent computercollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infocollege = new College("信息学院", "信息学院");
//        系
        computercollege.add(new Department("计算机科学与技术" ,"计算机"));
        computercollege.add(new Department("软件工程" ,"软件"));
        university.add(computercollege);
        university.add(infocollege);
        university.print();
        System.out.println("================");
        computercollege.print();

    }
}
