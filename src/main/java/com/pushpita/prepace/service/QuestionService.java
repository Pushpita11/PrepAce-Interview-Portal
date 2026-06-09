package com.pushpita.prepace.service;

import com.pushpita.prepace.model.AnswerRequest;
import com.pushpita.prepace.model.Question;
import com.pushpita.prepace.model.Result;
import com.pushpita.prepace.model.TestResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private List<Question> questions = new ArrayList<>();

    private final ResultService resultService;

    public QuestionService(ResultService resultService) {
        this.resultService = resultService;
    }

    public Question addQuestion(Question question) {
        questions.add(question);
        return question;
    }

    public List<Question> getAllQuestions() {
        return questions;
    }

    public Result submitAnswer(AnswerRequest request) {

        for (Question q : questions) {

            if (q.getId() == request.getQuestionId()) {

                if (q.getCorrectAnswer().equalsIgnoreCase(request.getAnswer())) {

                    resultService.saveResult(
                            new TestResult(
                                    "Pushpita",
                                    1,
                                    "Correct Answer"
                            )
                    );

                    return new Result(1, "Correct Answer");
                }

                resultService.saveResult(
                        new TestResult(
                                "Pushpita",
                                0,
                                "Wrong Answer"
                        )
                );

                return new Result(0, "Wrong Answer");
            }
        }

        return new Result(0, "Question Not Found");
    }
}