package com.panda.admin.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.panda.admin.sentinel.SentinelBlockHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangpan
 */
@Service
public class SentinelService {

    @SentinelResource(value = "hotSpotByHeader", blockHandler = "hotSpotByHeaderExceptionHandler", blockHandlerClass = SentinelBlockHandler.class)
    public String hotSpotByHeader(@PathVariable String clientId) {
        System.out.println("当前后台获取到的clientId:" + clientId);
        return "当前后台获取到的clientId:" + clientId;
    }

}
