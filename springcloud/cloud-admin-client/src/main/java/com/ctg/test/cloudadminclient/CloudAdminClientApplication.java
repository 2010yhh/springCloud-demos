package com.ctg.test.cloudadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//使得注册中心发现该服务
public class CloudAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminClientApplication.class, args);
    }
}
