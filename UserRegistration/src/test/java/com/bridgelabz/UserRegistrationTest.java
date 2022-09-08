package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckForFirstNameValidation("Priya");
        Assertions.assertTrue(value);

    }

    @Test
    public void givenLastNameValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckForLastNameValidation("Panda");
        Assertions.assertTrue(value);

    }

    @Test
    public void givenEmailIdValidation_WhenItsProper_ShouldReturnFalse(){
        boolean value = userRegistration.toCheckForEmailValidation("priya");
        Assertions.assertTrue(value);

    }
    @Test
    public void givenPasswordValidation_WhenItsProper_ShouldReturnTrue(){
        boolean value = userRegistration.toCheckPasswordValidation("Priya@123");
        Assertions.assertTrue(value);

    }
    @Test
    public void givenPasswordValidation_WhenItsProper_ShouldReturnFalse(){
        boolean value = userRegistration.toCheckPasswordValidation("priya_*");
        Assertions.assertTrue(value);

    }

}