package com.hpe.kevin.controller;

import com.hpe.kevin.nacosconfig.NacosCommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private NacosCommonConfig nacosCommonConfig;
    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return nacosCommonConfig.isUseLocalCache();
    }

    /**
     * http://localhost:8080/config/getString
     */
    @RequestMapping("/getString")
    public String getString() {
        return nacosCommonConfig.getUsername();
    }
}
