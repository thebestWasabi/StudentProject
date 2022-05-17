package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerChildren;
import com.maxdadude.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("children проверяется");
        return new AnswerChildren();
    }
}
