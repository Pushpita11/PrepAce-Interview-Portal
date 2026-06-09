package com.pushpita.prepace.service;

import com.pushpita.prepace.model.Dashboard;
import com.pushpita.prepace.model.TestResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultService {

    private List<TestResult> results = new ArrayList<>();

    public void saveResult(TestResult result) {
        results.add(result);
    }

    public List<TestResult> getResults() {
        return results;
    }

    public Dashboard getDashboardStats() {

        int totalAttempts = results.size();
        int correctAnswers = 0;

        for (TestResult result : results) {
            if (result.getScore() == 1) {
                correctAnswers++;
            }
        }

        int wrongAnswers = totalAttempts - correctAnswers;

        double accuracy = 0;

        if (totalAttempts > 0) {
            accuracy = ((double) correctAnswers / totalAttempts) * 100;
        }

        return new Dashboard(
                totalAttempts,
                correctAnswers,
                wrongAnswers,
                accuracy
        );
    }
}