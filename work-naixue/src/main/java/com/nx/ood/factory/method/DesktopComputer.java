package com.nx.ood.factory.method;

public class DesktopComputer implements Calculation{

    @Override
    public void powerOn() {
        System.out.println("台式电脑正在开机");
    }

    @Override
    public void powerOff() {
        System.out.println("台式电脑正在关机");
    }
}
