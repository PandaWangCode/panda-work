package com.panda.admin.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.panda.core.common.Constants;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpan
 */

@RestController
@AllArgsConstructor
@RequestMapping( Constants.API + "/sentinel2")
public class Sentinel2Controller {

    @GetMapping("/add")
    public String create(){
        try {
            // 设置一个资源名称为 Hello
            Entry ignored = SphU.entry("AddUser2");
            System.out.println("新建一个用户");
            return "新建一个用户";
        } catch (BlockException e) {
            System.out.println("系统繁忙，请稍后");
            e.printStackTrace();
            return "系统繁忙，请稍后";
        }
    }

    @GetMapping("/edit")
    public String edit() {
        return "编辑一个用户";
    }


}
