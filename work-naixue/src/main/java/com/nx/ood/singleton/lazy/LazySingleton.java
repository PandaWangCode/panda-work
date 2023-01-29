package com.nx.ood.singleton.lazy;

/**
 * 设计模式：单列模式
 * 第二种加载方式：懒加载模式，使用的时候才加载创建
 */
public class LazySingleton {
    // volatile关键字 ： 保证多线程环境下，可见性；以及禁止指令重排
    public volatile static LazySingleton instance = null;
    // 将构造函数私有化
    private LazySingleton(){}
    // 双重null判断 + 锁synchronized
    public static LazySingleton getInstance(){
        if (null == instance) {
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // volatile关键字 防止 指令重排
//    步骤1: 以LazySingleton 类作为原型，给他的对象实例分配一块内存空间instance = allocate(LazySingleton.clss):
//    步骤2:就是针对分配好的内存空间的一个对象实例，执行他的构造函数，对这个对象实例进行初始化操作，执行我们自己写的构造函数的一些代码，对各个实例变量赋值，进行初始化逻辑invokeConstructorlinstancel
//    步骤3:上两步骤搞定之后，一个实例对象就搞定了，此时就把instance指针指向内存地址，赋值给我们自己的引用类型的变量，instance就可以作为一个类似指针的概念，指向了LazySingleton对象的内存地址IIT动态编译，为了加速程序的执行的性能和效率所以会发生指令重拍
//    步骤1-》步骤3-》步骤2
//    线程1,刚刚执行完步骤1 和步骤3，步骤2 还没有执行，此时instance 已经不是null线程2，获取到instance调用某个方法就会报错

}
