package com.bridgelabz.userregistration;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("Vighnesh");
        assertEquals("First Name",true,result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("vIGHNESH");
        assertEquals("First Name",false,result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.lastName("Bilgi");
        assertEquals("Last Name",true,result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.lastName("bILGI");
        assertEquals("Last Name",false,result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.email("vighnesh@gmail.com");
        assertEquals("Email",true,result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.email("vighnesh.gmail.com");
        assertEquals("Email",false,result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.mobileNumber("9049480396");
        assertEquals("Mobile Number",true,result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.mobileNumber("12345");
        assertEquals("Mobile Number",false,result);
    }

    @Test
    public void givenPasswordRule_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.passwordRule("abcDEF123!@#");
        assertEquals("Password ",true,result);
    }

    @Test
    public void givenPasswordRule_WhenInvalid_ShouldReturnFalse() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.passwordRule("aD1#");
        assertEquals("Password ",false,result);
    }}