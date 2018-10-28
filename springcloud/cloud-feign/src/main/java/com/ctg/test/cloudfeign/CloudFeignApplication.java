package com.ctg.test.cloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * http://localhost:8765/test?name=zyq
 */
@SpringBootApplication
@EnableDiscoveryClient//使得注册中心发现该服务
@EnableFeignClients//Feign的客户端
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }
}
