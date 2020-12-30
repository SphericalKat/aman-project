package com.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class TrueFalseQuestion extends Question {
    private static final List<String> positiveAns = Arrays.asList("T", "TRUE", "Y", "YES");
    private static final List<String> negativeAns = Arrays.asList("F", "FALSE", "N", "NO");

    TrueFalseQuestion(String question, String answer) {
        super(question);
        JPanel buttons = new JPanel();

        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.question.add(buttons);

        initQuestionDialog();

        if (positiveAns.contains(answer.toUpperCase())) {
            correctAnswer = "TRUE";

        } else if (negativeAns.contains(answer.toUpperCase())) {
            correctAnswer = "FALSE";
        }
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
