package com.company.questions;

public class TrueFalse extends Base{
    public TrueFalse(String question, String correctAnswer){
        super(question, correctAnswer);
    }
    @Override
    public String toString(){
        return "\nPlease answer Yes(y) or No(n): " + getQuestion();
    }

    public Boolean checkingAnswer() throws Exception {
        System.out.println(getUserAnswer().toLowerCase());
        if(!"yn".contains(getUserAnswer().toLowerCase())){
            throw new Exception("Only (y/n) allowed");
        }
        return getCorrectAnswer().equals(getUserAnswer());
    }

}
