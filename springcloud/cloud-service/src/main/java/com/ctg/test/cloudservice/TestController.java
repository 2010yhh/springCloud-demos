package com.ctg.test.cloudservice;

import com.ctg.test.cloudservice.service.TestService;
import com.ctg.test.cloudservice.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/test")
    public String home(@RequestParam String name) {
        return  testService.getResponse(name);
 }
}
