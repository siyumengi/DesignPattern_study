package com.sym.proxy.staticproxy;

//静态代理
public class TeacherProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("方法执行前，额外操作");
        target.teach();
        System.out.println("方法执行后，额外操作");
    }
}
