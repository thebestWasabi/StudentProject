package com.maxdadude.studentorder.validator;

import com.maxdadude.studentorder.domain.CityRegisterCheckerResponse;
import com.maxdadude.studentorder.domain.Person;

public interface CityRegisterChecker {

    CityRegisterCheckerResponse checkerPerson(Person person);
}
