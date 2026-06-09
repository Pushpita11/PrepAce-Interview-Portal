package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.Dashboard;
import com.pushpita.prepace.service.ResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    private final ResultService resultService;

    public DashboardController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/dashboard")
    public Dashboard getDashboard() {
        return resultService.getDashboardStats();
    }
}