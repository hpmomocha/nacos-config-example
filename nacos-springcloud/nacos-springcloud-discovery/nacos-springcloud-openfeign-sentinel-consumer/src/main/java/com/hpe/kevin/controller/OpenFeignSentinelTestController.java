package com.hpe.kevin.controller;

import com.hpe.kevin.service.openfeign.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignSentinelTestController {
    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/echo4Sentinel/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return echoService.echo4Sentinel(str);
    }
}
