package com.hpe.kevin.service.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "service-provider",
        contextId = "echoService",
        fallback = EchoServiceFallback.class)
public interface EchoService {
    @RequestMapping(value = "/echo4Sentinel/{string}", method = RequestMethod.GET)
    public String echo4Sentinel(@PathVariable("string") String string);
}
