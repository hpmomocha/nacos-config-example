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

    @Value("${login.username}")
    private String username;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${ReadTimeout}")
    private int readTimeout;

    @Value("${ConnectTimeout}")
    private int connectTimeout;

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

    public String getDatasourceUrl() {
        return datasourceUrl;
    }

    public void setDatasourceUrl(String datasourceUrl) {
        this.datasourceUrl = datasourceUrl;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
}
