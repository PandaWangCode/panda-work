package com.nx.ood.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin do something: " + method.getName());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after do something: " + method.getName());
        return result;
    }

}
