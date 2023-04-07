package com.sym.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
//    维护一个目标对象，Object
    private Object target;
//    构造器，对 target 进行初始化
    public ProxyFactory(Object target){
        this.target = target;
    }
//    给目标对象 生成一个代理对象

    /*
    newProxyInstance(ClassLoader loader, 指定当前目标对象使用的类加载器，获取加载器的方法固定
                  Class<?>[] interfaces, 目标对象的实现接口类型，使用泛型方法确认类型
                InvocationHandler h)    事情处理，执行目标对象方法时，会触发事情处理方法，会把当前执行的对象，方法作为参数传入
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("方法执行前");
                        Object invokeRes = method.invoke(target, args);
                        System.out.println("方法执行后");
                        return invokeRes;
                    }
                }
        );
    }
}
