package com.sym.principle.inversion;

public class DependencyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new WeiXin());
    }
}
interface IReceiver{
    String getInfo();
}
class Email2 implements  IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello world！";
    }
}
class WeiXin implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello wx！";
    }
}
class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}