package com.example;


import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private static final List<String> ansList = Arrays.asList("A", "B", "C", "D", "E");

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query + "\n";
        question += "A. " + a + "\n";
        question += "B. " + b + "\n";
        question += "C. " + c + "\n";
        question += "D. " + d + "\n";
        question += "E. " + e + "\n";

        correctAnswer = answer.toUpperCase();
    }

    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            // answer validation
            if (ansList.contains(answer)) {
                return answer;
            }
        }
    }
}
