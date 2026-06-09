package com.pushpita.prepace.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dashboard {

    private int totalAttempts;
    private int correctAnswers;
    private int wrongAnswers;
    private double accuracy;
}