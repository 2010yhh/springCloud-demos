package com.ctg.test.cloudfeign;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * hystrix界面：http://localhost:8765/hystrix
 * 测试：（数据显示需要有服务调用：如请求：http://localhost:8765/test?name=zyq
 * 需要，输入 http://localhost:8765/hystrix.stream
 * 或者直接请求http://localhost:8765/hystrix.stream
 * ）
 *
 */
@SpringBootApplication
@EnableDiscoveryClient//使得注册中心发现该服务
@EnableFeignClients//Feign的客户端
@EnableHystrix//开启Hystrix
@EnableHystrixDashboard
//@EnableTurbine//开启Turbine
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
