package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerStudent;
import com.maxdadude.studentorder.domain.StudentOrder;

public class StudentValidator {

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("student проверяется");
        return new AnswerStudent();
    }
}
