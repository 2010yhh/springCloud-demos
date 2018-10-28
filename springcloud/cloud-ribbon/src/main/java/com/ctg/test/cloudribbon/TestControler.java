package com.ctg.test.cloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

    @Autowired
    TestService testService;

    @GetMapping(value = "/test")
    public String test(@RequestParam String name) {
        return testService.getResponse( name );
    }
    @GetMapping(value = "/test2")
    public String test2(@RequestParam String name) {
        return testService.getResponse2( name );
    }
}
