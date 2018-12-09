package com.ctg.test.cloudfegin2;

import org.springframework.stereotype.Component;

@Component
public class FeignTestServiceHystric implements FeignTestService {
    @Override
    public String getResponse2(String name) {
        return "CloudFegin2Application,sorry "+name;
    }
}