package com.ctg.test.cloudribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Eureka会将所有微服务的小写名字变成大写
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "testError")
    public String getResponse(String name) {
        return restTemplate.getForObject("http://CLOUD-SERVICE/test?name="+name,String.class);
    }
    public String getResponse2(String name) {
        return restTemplate.getForObject("http://CLOUD-SERVICE/test?name="+name,String.class);
    }
    public String testError(String name) {
        return "test,"+name+",sorry,error!";
    }
}