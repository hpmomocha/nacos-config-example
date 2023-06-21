package com.hpe.kevin.controller;

import com.alibaba.nacos.shaded.io.grpc.netty.shaded.io.netty.handler.codec.string.LineSeparator;
import com.hpe.kevin.nacosconfig.NacosCommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private NacosCommonConfig nacosCommonConfig;
    /**
     * http://localhost:8080/config/getUseLocalCache
     */
    @RequestMapping("/getUseLocalCache")
    public boolean getUseLocalCache() {
        return nacosCommonConfig.isUseLocalCache();
    }

    /**
     * http://localhost:8080/config/getUsername
     */
    @RequestMapping("/getUsername")
    public String getUsername() {
        return nacosCommonConfig.getUsername();
    }

    @RequestMapping("/getDatasourceUrl")
    public String getDatasourceUrl() {
        return nacosCommonConfig.getDatasourceUrl();
    }

    @RequestMapping("/getTimeout")
    public String getTimeout() {
        return "ConnectTimeout:"
                + nacosCommonConfig.getConnectTimeout()
                + "<--->ReadTimeout:"
                + nacosCommonConfig.getReadTimeout();
    }

    @RequestMapping("/getAllConfigs")
    public String getAllConfigs() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UseLocalCache=" + getUseLocalCache());
        stringBuffer.append("<br>");

        stringBuffer.append("Login.Username=" + getUsername());
        stringBuffer.append("<br>");

        stringBuffer.append("DatasourceUrl=" + getDatasourceUrl());
        stringBuffer.append("<br>");

        stringBuffer.append("Timeout=" + getTimeout());
        stringBuffer.append("<br>");

        return stringBuffer.toString();
    }

}
