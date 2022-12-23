package com.nx.ood.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * CGLIB 动态代理 ：原理：继承类
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 继承被代理的类
        enhancer.setSuperclass(HelloService.class);
        // 设置回调
        enhancer.setCallback(new HelloMethodInterceptor());
        // 设置代理对象
        HelloService helloService = (HelloService) enhancer.create();
        // 在调用代理类中方法时，会被我们实现的方法拦截器进行拦截
        helloService.sayHello();
        helloService.sayBye();
    }

//    动态代理:JDK和CGLIB
//    JDK代理要求被代理的类必须实现接口，有很强的局限性。
//    而CGLIB动态代理则没有此类强制性要求。简单的说，CGLIB会让生成的代理类继承被代理类，并在代理类中对代理方法进行强化处理(前置处理、后置处理等)。
//    但是如果被代理类被final修饰，那么它不可被继承代理，同样，如果被代理类中存在final修饰的方法，那么该方法也不可被代理
//
//    在mybatis和spring中的应用 ：
//        1、mybatis中获取代理对象后进行调用idk代理
//        2、spring aop中 JdkDynamicAopProxy
}
