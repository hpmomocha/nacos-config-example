package com.hpe.kevin.discovery;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;

import java.io.IOException;

public class NacosServiceRegisterExample {
    public static void main(String[] args) {
        try {
            NamingService namingService = NamingFactory.createNamingService("localhost:8848");
            namingService.registerInstance("app1", "1.1.1.1", 8888, "bj");

            NamingService namingService2 = NamingFactory.createNamingService("localhost:8848");
            namingService2.registerInstance("app1", "2.2.2.2", 8888, "bj");

            NamingService namingService3 = NamingFactory.createNamingService("localhost:8848");
            namingService3.registerInstance("app1", "3.3.3.3", 8888, "sh");

            NamingService namingService4 = NamingFactory.createNamingService("localhost:8848");
            namingService4.registerInstance("app2", "4.4.4.4", 6666, "sh");

            Instance app2Instance = new Instance();
            app2Instance.setIp("55.55.55.55");
            app2Instance.setPort(6666);
            app2Instance.setClusterName("bj");
            app2Instance.setHealthy(false);
            app2Instance.setWeight(2.0);

            NamingService namingService5 = NamingFactory.createNamingService("localhost:8848");
            namingService5.registerInstance("app2", app2Instance);

            System.in.read();
        } catch (NacosException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
