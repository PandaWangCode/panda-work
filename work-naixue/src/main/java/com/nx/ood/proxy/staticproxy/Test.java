package com.nx.ood.proxy.staticproxy;

/**
 * 代理模式：静态代理
 */
public class Test {

    public static void main(String[] args) {
        CalImplService calImplService = new CalImplService();
        ProxyCalService proxyCalService = new ProxyCalService(calImplService);
        proxyCalService.cal();
    }
}
