package com.company.quiz;

import com.company.questions.Base;

import java.util.ArrayList;

public class Quiz {
    public ArrayList<Base> questions;

    public Quiz(ArrayList<Base> questions){
        this.questions = questions;
    }
    public void addQuestion(Base aQuestion){
        questions.add(aQuestion);
    }
    public Double gradeQuiz() throws Exception {
        Double totalSum = 0.0;
        for (Base aQuestion : this.questions){
            System.out.println("User Answer: " + aQuestion.getUserAnswer());
            System.out.println("Correct Answer: " + aQuestion.getCorrectAnswer());
            System.out.println("Comparison: " + (aQuestion.checkingAnswer() == true));

            if (aQuestion.getUserAnswer() == null){
                System.out.println(aQuestion.getQuestion());
                throw new Exception("Please answer all questions");
            } else if (aQuestion.checkingAnswer() == true){
                totalSum += 1;
            }
            System.out.println(totalSum);
        }
        return totalSum/this.questions.size();
    }
}
