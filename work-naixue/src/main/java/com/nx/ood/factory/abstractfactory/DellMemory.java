package com.nx.ood.factory.abstractfactory;

public class DellMemory implements Memory{
    @Override
    public void makeMemory() {
        System.out.println("制作DELL品牌内存条");
    }
}
