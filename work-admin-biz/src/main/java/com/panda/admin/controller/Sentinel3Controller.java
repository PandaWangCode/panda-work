package com.panda.admin.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.panda.admin.sentinel.SentinelBlockHandler;
import com.panda.admin.service.SentinelService;
import com.panda.core.common.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

/**
 * @author wangpan
 */

@RequiredArgsConstructor
@RestController
@RequestMapping( Constants.API + "/sentinel3")
public class Sentinel3Controller {

    private final SentinelService sentinelService;

    @SentinelResource(value = "AddUser3", blockHandler = "addUser3ExceptionHandler", blockHandlerClass = SentinelBlockHandler.class)
    @GetMapping("/add")
    public String create() {
        System.out.println("新建一个用户");
        return "新建一个用户";
    }

    @GetMapping("/edit")
    public String edit() {
        return "编辑一个用户";
    }

    @SentinelResource(value = "hotSpot", blockHandler = "hotSpotExceptionHandler", blockHandlerClass = SentinelBlockHandler.class)
    @GetMapping("/hotSpot/{id}")
    public String hotSpot(@PathVariable long id) {
        System.out.println("当前热点id:" + id);
        return "当前热点id:" + id;
    }


    @GetMapping("/hotSpotByHeader")
    public String hotSpot2(HttpServletRequest request) {
        String clientId = request.getHeader("clientId");
        System.out.println("当前热点clientId:" + clientId);
        return sentinelService.hotSpotByHeader(clientId);
    }


}
