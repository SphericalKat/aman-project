package com.example;


import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private static final List<String> ansList = Arrays.asList("A", "B", "C", "D", "E");

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        super(query);
        correctAnswer = answer.toUpperCase();
        addChoice("A", a);
        addChoice("B", b);
        addChoice("C", c);
        addChoice("D", d);
        addChoice("E", e);
        initQuestionDialog();
    }

    void addChoice(String name, String label) {
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button, BorderLayout.WEST);
        choice.add(new JLabel(label + "     ", JLabel.LEFT), BorderLayout.CENTER);
        question.add(choice);
    }
}
