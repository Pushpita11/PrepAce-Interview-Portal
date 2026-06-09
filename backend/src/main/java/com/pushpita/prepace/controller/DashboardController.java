package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.Dashboard;
import com.pushpita.prepace.service.ResultService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
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