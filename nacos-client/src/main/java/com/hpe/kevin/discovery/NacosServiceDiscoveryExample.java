package com.hpe.kevin.discovery;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.listener.NamingEvent;
import com.alibaba.nacos.api.naming.pojo.Instance;

import java.io.IOException;
import java.util.List;

public class NacosServiceDiscoveryExample {
    public static void main(String[] args) throws NacosException, IOException {
        NamingService namingService = NamingFactory.createNamingService("localhost:8848");

        // 获取所有的实例(包括不健康的)
        List<Instance> app1s = namingService.getAllInstances("app1");

        for (Instance app1: app1s) {
            System.out.println(app1);
        }

        // 获取健康的实例
        List<Instance> app2s = namingService.selectInstances("app2", true);
        for (Instance app2: app2s) {
            System.out.println(app2);
        }

        System.out.println("========华丽的分割线========");

        // 权重随机算法获取一个健康的实例
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));
        System.out.println(namingService.selectOneHealthyInstance("app1"));


        namingService.subscribe("app2", event -> {
            if (event instanceof NamingEvent) {
                System.out.println(((NamingEvent) event).getServiceName());
                System.out.println(((NamingEvent) event).getInstances());
            }
        });

        // 阻塞线程
        System.in.read();
    }
}