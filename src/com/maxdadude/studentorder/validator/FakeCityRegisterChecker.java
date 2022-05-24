package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.Adult;
import com.maxdadude.studentorder.domain.CityRegisterCheckerResponse;
import com.maxdadude.studentorder.domain.Person;
import com.maxdadude.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkerPerson(Person person) throws CityRegisterException {
        if (person instanceof Adult) {
            System.out.println("ADULT");
        }
        return null;
    }
}
