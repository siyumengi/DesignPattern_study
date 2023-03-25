package com.sym.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息：hello world！";
    }
}
//完成 Person 接收消息的功能
//方式1分析
//1.简单
//2.如果我们想获取的对象是 微信，短信等，则新增类，同时 Person 也要增强相应的接收方法
//3.解决思路：引入一个抽象的接口 IReceiver，表示接受者，这样 Person 类与接口发生依赖
//  因为 Email，WeiXin 等等属于接收的范围，他们各自实现 IReceiver 接口就可以，符合了依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}