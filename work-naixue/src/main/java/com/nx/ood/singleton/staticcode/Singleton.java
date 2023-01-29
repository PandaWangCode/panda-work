package com.nx.ood.singleton.staticcode;
/**
 * 设计模式：单列模式
 * 第三种加载方式：静态代码块 ,内部静态类的方式加载
 */
public class Singleton {

    private Singleton(){}

    //通过静态内部类实现，类加载的时候进行实例化
    private static class InsideSingletonClass {
        final static Singleton singleton = new Singleton();
    }

    public Singleton getInstance(){
        // 第一次调用getInstance，加载内部类InsideSingletonClass
        return InsideSingletonClass.singleton;
    }
}
