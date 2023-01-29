package com.nx.ood.proxy.jdkporxy;

/**
 * jdk 动态代理
 * 原理：通过实现接口的方式，来实现动态代理
 */
public class Test {

    public static void main(String[] args) {
        // 显示代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HuaZaiService huaZaiService = new HuaZaiService();
        JDKStarProxy jdkStarProxy = new JDKStarProxy();
        jdkStarProxy.setTarget(huaZaiService);
        IStar iStar = (IStar) jdkStarProxy.createProxyObj();
        iStar.sing("千里之外");
        iStar.dance("老年广场舞");
    }

}
