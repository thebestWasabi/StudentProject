package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerWedding;
import com.maxdadude.studentorder.domain.StudentOrder;

public class WeddingValidator {

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("wedding проверяется");
        return new AnswerWedding();
    }
}
