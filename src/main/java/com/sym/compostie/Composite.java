package com.sym.compostie;

import com.sym.builder.improve.HouseDirector;

import java.util.HashMap;
import java.util.Map;

public class Composite {
    public static void main(String[] args) {
//        1.Map 就是一个抽象的构建（类似Composite）
//        2.Hash Map是一个中间的构建（Composite），实现/继承了相关方法 put/putAll
//        3.Node 是 hashMap 的静态内部类，类似 Leaf 叶子节点，没有 put 方法
//        4.static class Node<K,V> implements Map.Entry<K,V>
        Map<String, Integer> hashMap = new HashMap<>();
    }
}
