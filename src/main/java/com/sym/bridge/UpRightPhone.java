package com.sym.bridge;

public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立手机");
    }
}
