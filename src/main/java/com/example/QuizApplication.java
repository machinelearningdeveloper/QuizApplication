package com.example;

import java.util.ArrayList;

public class QuizApplication {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        ArrayList<Answer> moAnswers = new ArrayList<>();
        moAnswers.add(new Answer("Kansas City", false));
        moAnswers.add(new Answer("St. Louis", false));
        moAnswers.add(new Answer("Jefferson City", true));
        moAnswers.add(new Answer("Springfield", false));
        Question moQuestion = new Question("What is the capital of Missouri?", moAnswers);
        questions.add(moQuestion);

        ArrayList<Answer> mnAnswers = new ArrayList<>();
        mnAnswers.add(new Answer("Rochester", false));
        mnAnswers.add(new Answer("St. Paul", true));
        mnAnswers.add(new Answer("Minneapolis", false));
        mnAnswers.add(new Answer("Duluth", false));
        Question mnQuestion = new Question("What is the capital of Minnesota?", mnAnswers);
        questions.add(mnQuestion);

        Quiz quiz = new Quiz(questions);
        quiz.run();
    }
}
