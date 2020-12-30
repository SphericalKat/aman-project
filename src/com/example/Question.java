package com.example;

import javax.swing.*;
import java.awt.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;

    static final JFrame f = new JFrame();

    Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0, 1));
        this.question.add(new JLabel("     " + question + "     ", JLabel.CENTER));
    }

    String ask() {
        question.setVisible(true);
        return question.answer;
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    void check() {
        String answer = ask();
        nQuestions++;
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(f, "Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(f, "Incorrect, the correct answer is: " + "\"" + correctAnswer + "\"");
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(f, nCorrect + " correct out of " + nQuestions + " questions.");
    }
}
