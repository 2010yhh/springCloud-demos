package com.ctg.test.cloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * http://localhost:8766/api-a/test?name=zyq&token=123456
 * http://localhost:8766/api-a/test?name=zyq
 * http://localhost:8766/api-b/test?name=zyq&token=123456
 * http://localhost:8766/api-b/test?name=zyq
 *
 */

@EnableZuulProxy//zuul网关过滤器
@EnableEurekaClient//Eureka客户端
@SpringBootApplication
public class CloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuulApplication.class, args);
    }
}
