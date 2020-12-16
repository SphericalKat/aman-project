package com.example;

public class Main {
    public static void main(String[] args) {
        Question question = new MultipleChoiceQuestion(
                "What is the distance between the Sun and the Earth?",
                "100KM",
                "10000KM",
                "500 M",
                "1 AU",
                "1 LY",
                "d"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "How old is the universe?",
                "10 years",
                "100 million years",
                "13 billion years",
                "4000 years",
                "50 centuries",
                "c"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "Who is the creator of Java?",
                "James Gosling",
                "Dennis Ritchie",
                "Bjarne Stroustrup",
                "Guido van Rossum",
                "Bill Joy",
                "a"
        );
        question.check();

        // change question
        question = new MultipleChoiceQuestion(
                "Who is the creator of Java?",
                "James Gosling",
                "Dennis Ritchie",
                "Bjarne Stroustrup",
                "Guido van Rossum",
                "Bill Joy",
                "a"
        );
        question.check();

        // change question
        question = new MultipleChoiceQuestion(
                "Who is the creator of Java?",
                "James Gosling",
                "Dennis Ritchie",
                "Bjarne Stroustrup",
                "Guido van Rossum",
                "Bill Joy",
                "a"
        );
        question.check();

        MultipleChoiceQuestion.showResults();

        Question question1 = new TrueFalseQuestion("Is Java cross platform?", "t");
        question1.check();

        TrueFalseQuestion.showResults();
    }
}
