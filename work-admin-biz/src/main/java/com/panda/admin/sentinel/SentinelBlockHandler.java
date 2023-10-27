package com.panda.admin.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import javax.validation.constraints.NotNull;

/**
 * @author wangpan
 * 该类里面的方法必须是 static
 * 必须返回参数和controller里面的返回参数一样
 * 入参数和controller里面的入参一样，且多一个参数：BlockException e
 */
public class SentinelBlockHandler {

    public static String addUser3ExceptionHandler(@NotNull BlockException e) {
        e.printStackTrace();
        return "当前请求过于频繁，系统繁忙，请稍后再试！";
    }

    public static String hotSpotExceptionHandler(long id, BlockException e) {
        System.out.println("请求过于频繁:(针对特定恶意刷请求的用户)，当前的请求id:" + id);
        return "请求过于频繁:" + id;
    }

    public static String hotSpotByHeaderExceptionHandler(String clientId, BlockException e) {
        System.out.println("请求过于频繁:(针对特定恶意刷请求的用户)，当前的请求clientId:" + clientId);
        return "请求过于频繁:(针对特定恶意刷请求的用户)，当前的请求clientId:" + clientId;
    }

}
