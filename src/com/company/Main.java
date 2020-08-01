package com.company;

import com.company.questions.Base;
import com.company.questions.Checkbox;
import com.company.questions.MultipleChoice;
import com.company.questions.TrueFalse;
import com.company.quiz.Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        TrueFalse zeroQuestion = new TrueFalse("\nIs the app going to work?", "y");

        TrueFalse firstQuestion = new TrueFalse("\nIs the sky blue?", "y");

        ArrayList possibleChoicesFirstQuestion = new ArrayList<String>(
                Arrays.asList("Gray", "Blue", "Black", "Pink", "Brown"));
        Checkbox secondQuestion = new Checkbox(
                "What colors can the sky be?",
                possibleChoicesFirstQuestion,
                "1,2,3,4");

        ArrayList possibleChoicesThirdQuestion = new ArrayList<String>(
                Arrays.asList("Gray", "Blue", "Black", "Pink", "Red"));
        MultipleChoice thirdQuestion = new MultipleChoice(
                "What color are firetrucks?",
                possibleChoicesThirdQuestion,
                "5");

        Scanner in = new Scanner(System.in);

        System.out.println("Please answer these questions:");

        System.out.println(zeroQuestion);
        System.out.println("Answer: ");
        String zeroAnswer = in.nextLine();
        zeroQuestion.setUserAnswer(zeroAnswer);

        System.out.println(firstQuestion);
        System.out.println("Answer: ");
        String firstAnswer = in.nextLine();
        firstQuestion.setUserAnswer(firstAnswer);

        System.out.println(secondQuestion);
        System.out.println("Answer: ");
        String secondAnswer = in.nextLine();
        secondQuestion.setUserAnswer(secondAnswer);

        System.out.println(thirdQuestion);
        System.out.println("Answer: ");
        String thirdAnswer = in.nextLine();
        thirdQuestion.setUserAnswer(thirdAnswer);


        ArrayList someQuestions = new ArrayList<Base>(
                Arrays.asList(zeroQuestion));

        Quiz aQuiz = new Quiz(someQuestions);
        aQuiz.addQuestion(firstQuestion);
        aQuiz.addQuestion(secondQuestion);
        aQuiz.addQuestion(thirdQuestion);
        in.close();

        System.out.println("Final result: " + aQuiz.gradeQuiz());


    }
}
