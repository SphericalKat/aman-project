package com.example;

import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;

    static final JFrame f = new JFrame();

    abstract String ask();

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
