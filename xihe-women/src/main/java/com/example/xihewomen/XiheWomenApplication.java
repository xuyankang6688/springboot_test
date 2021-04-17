package com.example.xihewomen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.xiheservice.service","com.example.xihewomen.controller"})
public class XiheWomenApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiheWomenApplication.class, args);
    }

}
