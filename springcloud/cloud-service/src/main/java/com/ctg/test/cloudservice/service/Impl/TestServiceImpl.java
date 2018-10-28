package com.ctg.test.cloudservice.service.Impl;

import com.ctg.test.cloudservice.service.TestService;
import com.ctg.test.cloudservice.util.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.InetAddress;

/**
 * @Description: TODO
 * @Author: yanhonghai
 * @Date: 2018/10/27 16:43
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private Environment env;
    @Autowired
    IpUtil ipUtil;
    @Override
    public String getResponse(String name) {
        String ip="";
        try {
            InetAddress inetAddress=ipUtil.getLocalHostLANAddress();
            ip=inetAddress.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "From "+ip+":"+env.getProperty("server.port")+",testService response:hello  "+name;
    }
}
