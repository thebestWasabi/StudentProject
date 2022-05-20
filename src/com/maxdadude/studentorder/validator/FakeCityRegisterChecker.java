package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.CityRegisterCheckerResponse;
import com.maxdadude.studentorder.domain.Person;
import com.maxdadude.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkerPerson(Person person) throws CityRegisterException {
        return null;
    }
}
