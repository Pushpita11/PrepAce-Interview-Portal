package com.pushpita.prepace.controller;

import com.pushpita.prepace.model.Question;
import com.pushpita.prepace.service.QuestionService;
import org.springframework.web.bind.annotation.*;
import com.pushpita.prepace.model.AnswerRequest;
import com.pushpita.prepace.model.Result;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    @PostMapping("/submit")
    public Result submitAnswer(@RequestBody AnswerRequest request) {

        return questionService.submitAnswer(request);
    }
    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
}