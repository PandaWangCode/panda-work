package com.nx.ood.proxy.staticproxy;

public class CalImplService implements ICalService{
    @Override
    public void cal() {
        System.out.println("计算方法");
    }
}
