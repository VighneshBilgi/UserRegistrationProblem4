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




    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem:");
        Scanner scanner = new Scanner(System.in);

        UserRegistrationException ure = new UserRegistrationException();

        try {
            System.out.println("Enter First name:");
            String firstName = scanner.next();
            ure.firstNameException(firstName);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();

        try {
            System.out.println("Enter Last name:");
            String lastName = scanner.next();
            ure.lastNameException(lastName);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Email:");
            String email = scanner.next();
            ure.emailException(email);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Mobile Number:");
            String mobileNumber = scanner.next();
            ure.mobileNumberException(mobileNumber);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Password:");
            String password = scanner.next();
            ure.passwordRuleException(password);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }

        System.out.println();

        System.out.println("Entering fields through Lambda Function:");

        FieldValidation isFirstNameValid=(x)->{
            Pattern pattern=Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher matcher=pattern.matcher(x);
            boolean result=matcher.matches();
            return result;
        };

        FieldValidation isLastNameValid=(x)->{
            Pattern pattern=Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher matcher=pattern.matcher(x);
            boolean result1=matcher.matches();
            return result1;
        };

        FieldValidation isEmailValid=(x)->{
            Pattern pattern=Pattern.compile("[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}");
            Matcher matcher=pattern.matcher(x);
            boolean result2=matcher.matches();
            return result2;
        };

        FieldValidation isMobileNumberValid=(x)->{
            Pattern pattern=Pattern.compile("(91-)?[0-9]{10}");
            Matcher matcher=pattern.matcher(x);
            boolean result3=matcher.matches();
            return result3;
        };

        FieldValidation isPasswordValid=(x)->{
            Pattern pattern=Pattern.compile("([0-9a-zA-Z]*[~!@#$]){1}[0-9a-zA-Z~!@#$]*");
            Matcher matcher=pattern.matcher(x);
            boolean result4=matcher.matches();
            return result4;
        };

        System.out.println("Enter First name:");
        String firstNameLambda = scanner.next();
        boolean resultFirstName =isFirstNameValid.isValid(firstNameLambda);
        System.out.println("First Name Validity: "+resultFirstName);

        System.out.println("Enter Last name:");
        String lastNameLambda = scanner.next();
        boolean resultLastName =isLastNameValid.isValid(lastNameLambda);
        System.out.println("Last Name Validity: "+resultLastName);

        System.out.println("Enter Email:");
        String emailLambda = scanner.next();
        boolean resultEmail =isEmailValid.isValid(emailLambda);
        System.out.println("Email Validity="+resultEmail);

        System.out.println("Enter Mobile Number:");
        String mobileLambda = scanner.next();
        boolean resultMobileNumber =isMobileNumberValid.isValid(mobileLambda);
        System.out.println("Mobile Number Validity: "+resultMobileNumber);

        System.out.println("Enter Password:");
        String passwordLambda = scanner.next();
        boolean resultPassword =isPasswordValid.isValid(passwordLambda);
        System.out.println("Password Validity: "+resultPassword);
    }
}
