package com.ctg.test.cloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
   FeignTestService feignTestService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam String name) {
        return feignTestService.getResponse(name);
    }


}