package com.ctg.test.cloudadminweb;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 服务监控界面：http://localhost:8760/
 */
@SpringBootApplication
@EnableAdminServer//标识为spring-cloud监控应用
@EnableDiscoveryClient//使得注册中心发现该服务
//@EnableTurbine//spring-boot-admin-server2.0x整合turbine1.5.x目前有问题
public class CloudAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminWebApplication.class, args);
    }
}

