package com.sym.proxy.dynamic;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("动态代理正在授课");
    }
}
