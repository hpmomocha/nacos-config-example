package com.hpe.kevin.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    // 使用 SpringBoot + Nacos 时
    // 使用 @NacosValue 注解代替 @Value 注解, 并设置 autoRefreshed 属性为 true
    @NacosValue(value = "${spring.datasource.username}", autoRefreshed = true)
    private String username;

    @NacosValue(value = "${spring.datasource.password}", autoRefreshed = true)
    private String password;

    public String test() {
        return "spring.datasource.username=" + username
                + "<br>spring.datasource.password=" + password;
    }
}
