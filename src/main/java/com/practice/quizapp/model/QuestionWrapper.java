package com.practice.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {

    private Integer id;
    private String question;
    private String option1;
    private String option2;

    public QuestionWrapper(Integer id, String question, String option1, String option2) {
        this.id = id;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
    }
}
