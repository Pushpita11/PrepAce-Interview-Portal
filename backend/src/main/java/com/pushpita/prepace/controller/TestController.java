package com.pushpita.prepace.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${openai.api.key}")
    private String apiKey;

    @GetMapping("/test-key")
    public String testKey() {

        return apiKey;

    }
}