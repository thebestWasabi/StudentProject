package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerCityRegister;
import com.maxdadude.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public int port;
    public String login;
    public String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkerPerson(so.getHusband());
        personChecker.checkerPerson(so.getWife());
        personChecker.checkerPerson(so.getChild());

        AnswerCityRegister asr = new AnswerCityRegister();
        return asr;
    }
}
