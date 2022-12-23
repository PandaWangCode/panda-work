package com.nx.ood.proxy.jdkporxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKStarProxy implements InvocationHandler {

    // 目标类：也就是被代理类
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里就是功能增强
        System.out.println("开始执行前置事情");
        // 执行
        Object result = method.invoke(target, args);
        // 后置功能
        System.out.println("开始执行后置事情");
        return result;
    }

    public Object createProxyObj(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
