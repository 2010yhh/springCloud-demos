package com.ctg.test.cloudfeign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fegin像调用本地服务一样调用远程服务
 * feign是采用基于接口的注解，所以我们需要新建一个接口，使用这个接口调用服务提供商
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient(value = "cloud-service",fallback = FeignTestServiceHystric.class)
public interface FeignTestService {
    @RequestMapping(value = "/test", method = RequestMethod.GET)//服务中的具体接口
    String getResponse(@RequestParam(value = "name") String name);
}
