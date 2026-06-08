package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.TestResult;
import com.pushpita.prepace.service.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService){
        this.resultService = resultService;
    }

    @GetMapping
    public List<TestResult> getResults(){
        return resultService.getResults();
    }
}