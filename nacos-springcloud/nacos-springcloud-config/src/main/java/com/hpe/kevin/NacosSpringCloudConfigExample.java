package com.hpe.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NacosSpringCloudConfigExample {
    public static void main(String[] args) {
        System.setProperty("spring.cloud.bootstrap.enabled","true");

        SpringApplication.run(NacosSpringCloudConfigExample.class, args);
    }
}