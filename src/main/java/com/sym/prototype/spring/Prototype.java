package com.sym.prototype.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object bean = context.getBean("id01");
        System.out.println(bean);
        Object bean1 = context.getBean("id01");
        System.out.println(bean1);
        System.out.println(bean == bean1);
    }
}
