package com.pushpita.prepace.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    @Value("${openai.api.key}")
    private String apiKey;

    public String generateQuestions(String topic) {

        return """
                Topic: %s

                1. Explain JVM.
                2. What is Polymorphism?
                3. What is Multithreading?
                4. Difference between JDK and JRE?
                5. Explain Exception Handling.
                """
                .formatted(topic);
    }

    public String evaluateAnswer(String question, String answer) {

        int score = 5;

        if (answer.length() > 50) {
            score = 7;
        }

        if (answer.length() > 100) {
            score = 9;
        }

        return """
                Question:
                %s

                Score: %d/10

                Feedback:
                Good attempt. Add more technical details,
                project experience and confidence.
                """
                .formatted(question, score);
    }
}