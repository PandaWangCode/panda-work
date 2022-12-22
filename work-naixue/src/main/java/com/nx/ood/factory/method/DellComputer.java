package com.nx.ood.factory.method;

public class DellComputer implements Calculation{
    @Override
    public void powerOn() {
        System.out.println("DELL 电脑开始开机 ");
    }

    @Override
    public void powerOff() {
        System.out.println("DELL 电脑开始关机 " );
    }
}
