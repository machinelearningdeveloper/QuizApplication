package com.example;

import java.util.ArrayList;

import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private int numCorrect;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public String toString() {
        StringBuilder quizTxt = new StringBuilder();
        for (Question question: this.questions) {
            quizTxt.append(question.toString() + '\n');
        }
        return quizTxt.toString();
    }

    public void run() {
        for (Question question: this.questions) {
            Answer answer = null;
            while (answer == null) {
                // print out the question
                System.out.println(question);

                Scanner in = new Scanner(System.in);
                // get the selected answer and print a message
                if (in.hasNextInt()) {
                    int i = in.nextInt() - 1;
                    // get the answer at index i
                    answer = question.getAnswer(i);
                }
                if (answer == null)
                    System.out.println("Please choose a valid answer.");
            }

            System.out.println("You answered: " + answer);
            if (answer.isCorrect()) {
                this.numCorrect++;
                System.out.println("Good job!");
            } else {
                System.out.println("Better luck next time.");
            }
        }
        System.out.println("\n1You have completed the quiz.\n");
        System.out.println("Correct: " + this.numCorrect);
        System.out.println("Total: " + this.questions.size());
        System.out.println("Percentage: " + ((double)this.numCorrect / this.questions.size() * 100) + "%");

    }
}
