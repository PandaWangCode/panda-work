package com.nx.ood.proxy.staticproxy;

/**
 * 代理类
 */
public class ProxyCalService implements ICalService{

    CalImplService calImplService;

    public ProxyCalService(CalImplService calImpl){
        calImplService = calImpl;
    }

    @Override
    public void cal() {
        System.out.println("调用之前处理一些事");
        // 调用之前处理一些事
        calImplService.cal();
        // 调用之后处理一些事
        System.out.println("调用之后处理一些事");
    }
}
