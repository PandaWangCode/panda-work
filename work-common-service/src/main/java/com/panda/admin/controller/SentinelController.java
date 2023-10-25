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
@RequestMapping( Constants.API + "/sentinel")
public class SentinelController {

    @GetMapping("/add")
    public String create(){
        try {
            // 设置一个资源名称为 Hello
            Entry ignored = SphU.entry("AddUser");
            System.out.println("新建一个用户");
            return "新建一个用户";
        } catch (BlockException e) {
            System.out.println("系统繁忙，请稍后");
            e.printStackTrace();
            return "系统繁忙，请稍后";
        }
    }

    /**
     * 使用代码编写流控规则，项目中不推荐使用，这是硬编码方式
     *
     * 注解 @PostConstruct 的含义是：本类构造方法执行结束后执行
     */
    @PostConstruct
    public void initFlowRule() {
        /* 1.创建存放限流规则的集合 */
        List<FlowRule> rules = new ArrayList<>();
        /* 2.创建限流规则 */
        FlowRule rule = new FlowRule();
        /* 定义资源，表示 Sentinel 会对哪个资源生效 */
        rule.setResource("AddUser");
        /* 定义限流的类型(此处使用 QPS 作为限流类型) */
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        /* 定义 QPS 每秒通过的请求数 */
        rule.setCount(1);
        /* 3.将限流规则存放到集合中 */
        rules.add(rule);
        /* 4.加载限流规则 */
        FlowRuleManager.loadRules(rules);
    }

    @GetMapping("/edit")
    public String edit() {
        return "编辑一个用户";
    }


}
