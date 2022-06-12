package com.bridgelabz.userregistration;

public class CustomException extends Throwable {
    public CustomException(String message) {
        System.out.println(message);
    }
}