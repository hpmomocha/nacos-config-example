package com.hpe.kevin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Port: " + port + "===Hello Nacos Discovery " + string;
    }

    @RequestMapping(value = "/echo4Sentinel/{string}", method = RequestMethod.GET)
    public String echo4Sentinel(@PathVariable String string) {
        Random random = new Random();
        int i = random.nextInt(10);
        if (i > 5) {
            int ex = 1/0;
        }
        return "正常访问, 传入的字符串为:" + string;
    }
}
