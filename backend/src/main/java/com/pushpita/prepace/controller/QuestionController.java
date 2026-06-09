package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.AnswerRequest;
import com.pushpita.prepace.model.Question;
import com.pushpita.prepace.model.Result;
import com.pushpita.prepace.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @PostMapping("/submit")
    public Result submitAnswer(@RequestBody AnswerRequest request) {
        return questionService.submitAnswer(request);
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(
            @PathVariable String category) {

        return questionService.getQuestionsByCategory(category);
    }
}