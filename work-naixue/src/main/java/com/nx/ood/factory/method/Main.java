package com.nx.ood.factory.method;

/**
 * 工厂方法模式
 * 什么时候使用？当简单工厂方法的if else 里面创建的对象实例比较复杂，麻烦的时候适用该模式。否则适用简单工厂方法就够用。
 */
public class Main {

    public static void main(String[] args) {
        // 1 先创建工厂
        DesktopFactory desktopFactory = new DesktopFactory();
        // 工厂里创建方法
        Calculation calculation = desktopFactory.create();
        calculation.powerOn();

        // 2 先创建工厂
        DellComputerFactory dellComputerFactory = new DellComputerFactory();
        // 工厂里创建方法
        Calculation calculation1 = dellComputerFactory.create();
        calculation1.powerOn();
    }

}
