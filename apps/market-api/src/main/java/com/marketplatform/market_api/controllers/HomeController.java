package com.marketplatform.market_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Market Platform API!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "API is running!";
    }
}