package com.ctg.test.cloudfeign;

import org.springframework.stereotype.Component;

@Component
public class FeignTestServiceHystric implements FeignTestService {
    @Override
    public String getResponse(String name) {
        return "sorry "+name;
    }
}