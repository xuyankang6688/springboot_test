package com.example.xihegatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XiheGatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiheGatwayApplication.class, args);
    }

}
