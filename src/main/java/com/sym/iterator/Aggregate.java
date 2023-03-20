package com.sym.iterator;

import java.util.Iterator;

public interface Aggregate { // 所要遍历的集合的接口，实现了该接口的类可以将成为一个可以保存多个元素的集合，就像数组一样
    public abstract Iterator iterator(); // 该方法生成了一个用于遍历集合的迭代器
}
