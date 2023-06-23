package com.hpe.kevin.service.openfeign;

import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo4Sentinel(String string) {
        return "降级啦!!!";
    }
}
