package com.ctg.test.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: http://localhost:8771/testConfig
 * http://localhost:8771/user
 * @Author: yanhonghai
 * @Date: 2018/10/12 17:12
 */
@RestController
@RefreshScope
public class TestConfigTontroller {
    //这个@Value会根据配置的配置中心地址找到git仓库对应的配置和本地服务的配置文件
    @Value("${content}")
    private String configValue;
    @Value("${userName}")
    private String userName;
    @Value("${passWord}")
    private String passWord;
    @RequestMapping("testConfig")
    public String test(){
        return "读取到配置中心：属性content值："+configValue;
    }
    @RequestMapping("/user")
    public String from() {
        return "~user:" + this.userName + "~pass:" + this.passWord;
    }

}
