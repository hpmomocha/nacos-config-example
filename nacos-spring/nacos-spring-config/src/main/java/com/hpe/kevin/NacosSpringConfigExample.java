package com.hpe.kevin;

import com.hpe.kevin.config.NacosSpringConfigAppConfig;
import com.hpe.kevin.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NacosSpringConfigExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(NacosSpringConfigAppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.test();
    }
}
