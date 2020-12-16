package com.example;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    private static final List<String> positiveAns = Arrays.asList("T", "TRUE", "Y", "YES");
    private static final List<String> negativeAns = Arrays.asList("F", "FALSE", "N", "NO");

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        if (positiveAns.contains(answer.toUpperCase())) {
            correctAnswer = "TRUE";

        } else if (negativeAns.contains(answer.toUpperCase())) {
            correctAnswer = "FALSE";
        }
    }

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (positiveAns.contains(answer)) {
                return "TRUE";

            } else if (negativeAns.contains(answer)) {
                return "FALSE";
            } else {
                JOptionPane.showMessageDialog(f, "Invalid answer. Please enter TRUE or FALSE.");
            }
        }
    }
}
