package com.ctg.test.cloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：
 *
 *  /{application}/{profile}[/{label}]：
 *
 *   ~： /{application}-{profile}.yml
 *   ~： /{label}/{application}-{profile}.yml
 *   ~： /{application}-{profile}.properties
 *   ~： /{label}/{application}-{profile}.properties

 */
@SpringBootApplication
public class CloudConfigClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }
}
