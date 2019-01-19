package com.example;

import java.util.ArrayList;

public class Question {
    private String questionTxt;
    private ArrayList<Answer> answers;

    public Question(String questionTxt, ArrayList<Answer> answers) {
        this.questionTxt = questionTxt;
        this.answers = answers;
    }

    public String toString() {
        StringBuilder questionPlusAnswers = new StringBuilder(this.questionTxt + '\n');
        int i = 1;
        for (Answer answer: this.answers) {
            questionPlusAnswers.append(i + ". " + answer.toString() + '\n');
            i++;
        }
        return questionPlusAnswers.toString();
    }

    public Answer getAnswer(int i) {
        if (i < 0 || i >= this.answers.size())
            return null;
        return answers.get(i);
    }
}
