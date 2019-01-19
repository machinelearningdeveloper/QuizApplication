package com.example;

public class Answer {
    private String answerTxt;
    private boolean correct;

    public Answer(String answerTxt, boolean correct) {
        this.answerTxt = answerTxt;
        this.correct = correct;
    }

    public String toString() {
        return this.answerTxt;
    }

    public boolean isCorrect() {
        return this.correct;
    }
}
