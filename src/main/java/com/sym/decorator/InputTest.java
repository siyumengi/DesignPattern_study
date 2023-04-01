package com.sym.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {
//        1. InputStream 是抽象类，类似Drink
//        2. FileInputStream 是 InputStream 子类，类似 LongBlack 单品
//        3. FilerInputStream 是 InputStream 子类，类似 Decorator 修饰者
//        3. DataInputStream 是 FilerInputStream 子类，类似 Milk 修饰手段
//        4. FilerInputStream 类有  protected volatile InputStream in，即含被装饰者
        InputStream dis = new DataInputStream(new FileInputStream(""));
    }
}
