package com.company.questions;

import java.util.ArrayList;

public class MultipleChoice extends Base {
    protected ArrayList<String> possibleAnswers;

    public MultipleChoice(String question, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(question, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String toString(){
        String possibleAnswersResponses = "";
        for(int i = 0; i < this.possibleAnswers.size(); i++){
            possibleAnswersResponses += "\n" + (i + 1) + "-" + this.possibleAnswers.get(i);
        }
        return "\nPlease select the correct answer: " + getQuestion() + "\n Possible choices: " + possibleAnswersResponses;
    }
}
