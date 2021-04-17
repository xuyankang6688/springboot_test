package com.example.xiheman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("man")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "hello world Man.";
    }
}
