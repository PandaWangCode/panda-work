package com.nx.ood.singleton.hungry;

/**
 * 单列模式
 * 第一种加载方式：恶汉式加载
 * 缺点：在程序初始化的时候，就加载了，不管该对象有没有使用到。
 */
public class HungrySingleton {
    // 定义静态变量的同时，实例化单例类，所以类加载的时候已经创建了单例对象
    public static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

}
