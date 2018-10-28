package com.ctg.test.cloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * http://localhost:8764/test?name=zyq
 * http://localhost:8764/test2?name=zyq
 */
@EnableEurekaClient//Eureka客户端
@EnableDiscoveryClient//使得注册中心发现该服务
@SpringBootApplication
@EnableHystrix//Hystrix断路器

public class CloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced//实现负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
