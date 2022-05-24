package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.AnswerCityRegister;
import com.maxdadude.studentorder.domain.CityRegisterCheckerResponse;
import com.maxdadude.studentorder.domain.StudentOrder;
import com.maxdadude.studentorder.exception.CityRegisterException;

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

        try {
            CityRegisterCheckerResponse hAns = personChecker.checkerPerson(so.getHusband());
            CityRegisterCheckerResponse wAns = personChecker.checkerPerson(so.getWife());
            CityRegisterCheckerResponse childAns = personChecker.checkerPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }

        AnswerCityRegister asr = new AnswerCityRegister();
        return asr;
    }
}
