package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.AIRequest;
import com.pushpita.prepace.service.AIService;
import org.springframework.web.bind.annotation.*;
import com.pushpita.prepace.model.InterviewRequest;
@RestController
@RequestMapping("/ai")
@CrossOrigin(origins = "http://localhost:3000")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }
    @PostMapping("/evaluate")
    public String evaluateAnswer(
            @RequestBody InterviewRequest request
    ) {

        return aiService.evaluateAnswer(
                request.getQuestion(),
                request.getAnswer()
        );
    }

    @PostMapping("/generate")
    public String generateQuestions(
            @RequestBody AIRequest request
    ) {

        return aiService.generateQuestions(
                request.getTopic()
        );
    }
}
