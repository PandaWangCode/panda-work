package com.nx.ood.factory.abstractfactory;

public class DellCpu implements Cpu{
    @Override
    public void makeCpu() {
        System.out.println(" 制作DELL品牌 CPU!  " );
    }
}
