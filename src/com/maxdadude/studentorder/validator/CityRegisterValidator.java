package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerCityRegister;
import com.maxdadude.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public int port;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("city проверяется " + hostName + ", " + login + ", " + password);
        AnswerCityRegister asr = new AnswerCityRegister();
        asr.success = false;
        return asr;
    }
}
