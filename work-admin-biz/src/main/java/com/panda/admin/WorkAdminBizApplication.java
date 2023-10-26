package com.panda.admin;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangpan
 */
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
public class WorkAdminBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkAdminBizApplication.class, args);
    }

}
