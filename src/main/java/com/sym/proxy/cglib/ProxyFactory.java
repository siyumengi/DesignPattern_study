package com.sym.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class ProxyFactory implements MethodInterceptor {
    public Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
//        1.创建一个工具类
        Enhancer enhancer = new Enhancer();
//        2.设置父类
        enhancer.setSuperclass(target.getClass());
//        3.设置回调函数
        enhancer.setCallback(this);
//        4.创建子类对象，即代理对象
        return enhancer.create();
        }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        Object invokeRes = method.invoke(target, objects);
        System.out.println("方法执行后");
        return null;
    }
}
