package com.ctg.test.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**配置中心：
 * Config Server作为一个普通的微服务应用，纳入Eureka的服务治理体系中。
 * 这样我们的微服务应用就可以通过配置中心的服务名来获取配置信息
 * http://localhost:8770/springCloud-demos/dev/master
 * http://localhost:8770/config-dev.properties
 */
@SpringBootApplication
//配置中心注册
@EnableConfigServer
public class CloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }
}
