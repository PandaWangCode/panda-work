package com.nx.ood.prototype;

public class RealizeType implements Cloneable{

    public RealizeType(){
        System.out.println("MAC 电脑磨具生成成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("3D 打印MAC电脑！");
        return super.clone();
    }
}
