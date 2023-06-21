package com.hpe.kevin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Value("${spring.datasource.username}")
    private String username;

    public void test() {
        System.out.println("spring.datasource.username=" + username);
    }
}
