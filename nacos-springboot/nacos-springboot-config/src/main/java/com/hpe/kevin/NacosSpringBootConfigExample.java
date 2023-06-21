package com.hpe.kevin;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 添加 @NacosPropertySource 注解, 并设置 autoRefreshed 属性值为 true
@NacosPropertySource(dataId = "test", autoRefreshed = true)
public class NacosSpringBootConfigExample {
    public static void main(String[] args) {
        SpringApplication.run(NacosSpringBootConfigExample.class, args);
    }
}