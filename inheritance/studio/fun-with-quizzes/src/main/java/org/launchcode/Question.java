package org.launchcode;

import java.util.ArrayList;

public abstract class Question {
    private String prompt;
    private ArrayList<String> choices;

    public String getPrompt() {
        return prompt;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public abstract void displayPrompt(){
        System.out.println("blah");

    }
    public abstract void checkAnswers(){
        System.out.println("blah, blah");

    }





}


