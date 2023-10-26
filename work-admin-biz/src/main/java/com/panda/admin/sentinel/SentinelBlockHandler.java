package com.panda.admin.sentinel;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import javax.validation.constraints.NotNull;

/**
 * @author wangpan
 */
public class SentinelBlockHandler {

    public static String addUser3ExceptionHandler(@NotNull BlockException e) {
        e.printStackTrace();
        return "当前请求过于频繁，系统繁忙，请稍后再试！";
    }

}
