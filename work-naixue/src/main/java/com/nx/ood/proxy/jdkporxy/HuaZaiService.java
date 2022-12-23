package com.nx.ood.proxy.jdkporxy;

public class HuaZaiService implements IStar{

    @Override
    public void sing(String name) {
        System.out.println("开始唱歌" + name);
    }

    @Override
    public void dance(String name) {
        System.out.println("开始跳舞" + name);
    }
}
