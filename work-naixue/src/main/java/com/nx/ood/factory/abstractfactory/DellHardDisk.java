package com.nx.ood.factory.abstractfactory;

public class DellHardDisk implements HardDisk{
    @Override
    public void makeHardDisk() {
        System.out.println("制作DELL品牌硬盘");
    }
}
