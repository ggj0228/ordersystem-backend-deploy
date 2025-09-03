package com.beyond.ordersystem.common.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Map;

@RestController
public class HealthChbeckContorller {

    @GetMapping("/health")
    public String probe() {
        // 여기서는 절대 DB 호출하지 말 것 (빠른 200 응답 필요)
        return "Ok2";
    }
}

