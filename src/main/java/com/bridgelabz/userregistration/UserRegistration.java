package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName) {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        return result;
    }

    public boolean lastName(String lastName) {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        return result;
    }

    public boolean email(String email){
        String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";

        Pattern pattern=Pattern.compile(emailPattern);
        Matcher matcher=pattern.matcher(email);
        boolean result=matcher.matches();

        return result;
    }

    public boolean mobileNumber(String mobileNumber) {

        String MobileNumberPattern = "(91-)?[0-9]{10}";

        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        Boolean result = matcher.matches();

        return result;
    }

    public boolean passwordRule(String password) {

        String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&+*])[a-zA-Z0-9@!#$%^&+*]{8,}$";

        Pattern pattern4 = Pattern.compile(PasswordPattern);
        Matcher matcher4 = pattern4.matcher(password);
        Boolean result4 = matcher4.matches();

        return result4;
    }

    public boolean emailSampleValidation(String emailSample){

        System.out.println("Checking for Email sample: "+emailSample);

        String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(emailSample);
        Boolean result = matcher.matches();

        return result;

    }

    public void isValid(boolean result){
        if (result == true) {
            System.out.println("Valid.");
        } else {
            System.out.println("Invalid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem:");
        UserRegistration ur = new UserRegistration();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        ur.isValid(ur.firstName(firstName));

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        ur.isValid(ur.lastName(lastName));

        System.out.println("Enter your Email:");
        String email = scanner.next();
        ur.isValid(ur.email(email));

        System.out.println("Enter your Mobile number:");
        String mobileNumber = scanner.next();
        ur.isValid(ur.mobileNumber(mobileNumber));

        System.out.println("Enter your Password:");
        String password=scanner.next();
        ur.isValid(ur.passwordRule(password));

        System.out.println();
        System.out.println("Email sample validation: ");
        ur.emailSampleValidation("abc@yahoo.com");
        ur.emailSampleValidation("abc-100@yahoo.com");
        ur.emailSampleValidation("abc.100@yahoo.com");
        ur.emailSampleValidation("abc111@abc.com");
        ur.emailSampleValidation("abc-100@abc.net");
        ur.emailSampleValidation("abc.100@abc.com.au");
        ur.emailSampleValidation("abc@1.com");
        ur.emailSampleValidation("abc@gmail.com.com");
        ur.emailSampleValidation("abc+100@gmail.com");

    }
}
