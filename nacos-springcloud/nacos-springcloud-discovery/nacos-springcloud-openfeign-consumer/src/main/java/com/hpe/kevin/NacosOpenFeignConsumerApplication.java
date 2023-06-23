package com.hpe.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NacosOpenFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosOpenFeignConsumerApplication.class, args);
    }
}