package com.nx.ood.factory.abstractfactory;

/**
 * 抽象工厂模式 : 扩展性高，适用一组对象，接口，实现某个功能。比如当前是一组实现了dell电脑的组装，再增加个联想或者华硕工厂类，就可以实现具体其他品牌的组装方法
 */
public class Main {

    public static void main(String[] args) {
        // 获取dell品牌的工厂类
        DellComputerFactory factory = new DellComputerFactory();
        // 创建cpu
        factory.madeCpu().makeCpu();
        // 创建内存条
        factory.madeMemory().makeMemory();
        // 创建硬盘
        factory.madeHardDisk().makeHardDisk();
    }
}
