package com.ctg.test.cloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  打开spring eureka界面:http://localhost:8761/
 *
 */
@SpringBootApplication
@EnableEurekaServer//注册中心

public class CloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaApplication.class, args);
    }
}
