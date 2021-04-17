package com.example.xihewomen.controller;

import com.example.xiheservice.service.HelloWorldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloWorldController {

    @Resource
    HelloWorldService helloWorldService;

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return helloWorldService.HellWorld();
    }
}
