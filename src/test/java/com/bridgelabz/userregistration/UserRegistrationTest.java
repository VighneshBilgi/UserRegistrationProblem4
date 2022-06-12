package com.bridgelabz.userregistration;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result = ure.firstNameException("Vighnesh");
        assertEquals("First Name", true, result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.firstNameException("vIGHNESH");
        assertEquals("First Name",false,result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.lastNameException("Bilgi");
        assertEquals("Last Name",true,result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.lastNameException("bILGI");
        assertEquals("Last Name",false,result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.emailException("vighnesh@gmail.com");
        assertEquals("Email",true,result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.emailException("vighnesh.gmail.com");
        assertEquals("Email",false,result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.mobileNumberException("9049480396");
        assertEquals("Mobile Number",true,result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.mobileNumberException("12345");
        assertEquals("Mobile Number",false,result);
    }

    @Test
    public void givenPasswordRule_WhenValid_ShouldReturnTrue() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.passwordRuleException("abcDEF123!@#");
        assertEquals("Password ",true,result);
    }

    @Test
    public void givenPasswordRule_WhenInvalid_ShouldReturnFalse() throws CustomException {
        UserRegistrationException ure=new UserRegistrationException();
        boolean result=ure.passwordRuleException("aD1#");
        assertEquals("Password ",false,result);
    }
}