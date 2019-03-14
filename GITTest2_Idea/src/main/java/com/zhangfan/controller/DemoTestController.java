package com.zhangfan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTestController {

    @RequestMapping("/")
    public String test(){
        return "hello world";
    }

}
