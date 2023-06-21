package com.hpe.kevin.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
// Nacos配置自动刷新
@RefreshScope
public class NacosCommonConfig {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${spring.datasource.username:defaultValue}")
    private String username;

    public boolean isUseLocalCache() {
        return useLocalCache;
    }

    public void setUseLocalCache(boolean useLocalCache) {
        this.useLocalCache = useLocalCache;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
