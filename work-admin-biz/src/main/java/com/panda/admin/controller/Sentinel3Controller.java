package com.panda.admin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.panda.admin.sentinel.SentinelBlockHandler;
import com.panda.core.common.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @author wangpan
 */

@RestController
@RequestMapping( Constants.API + "/sentinel3")
public class Sentinel3Controller {

    @SentinelResource(value = "AddUser3", blockHandler = "addUser3ExceptionHandler", blockHandlerClass = SentinelBlockHandler.class)
    @GetMapping("/add")
    public String create(){
        System.out.println("新建一个用户");
        return "新建一个用户";
    }

    @GetMapping("/edit")
    public String edit() {
        return "编辑一个用户";
    }



}
