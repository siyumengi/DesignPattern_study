package com.sym.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("牛牛" , "牛圈");
//        深拷贝
//        DeepProtoType p1 =(DeepProtoType) p.clone();
//        System.out.println(p1 == p);
//        System.out.println(p + " " + p.deepCloneableTarget.hashCode());
//        System.out.println(p1 + " " + p1.deepCloneableTarget.hashCode());
//        序列化
        DeepProtoType p1 =(DeepProtoType) p.deepClone();
        System.out.println(p1 == p);
        System.out.println(p + " " + p.deepCloneableTarget.hashCode());
        System.out.println(p1 + " " + p1.deepCloneableTarget.hashCode());
    }
}
