package com.panda.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WorkAdminBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkAdminBizApplication.class, args);
    }

}
