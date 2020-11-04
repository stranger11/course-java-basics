package com.rakovets.course.javabasics.practice.exceptionhandling.exceptions;

public class NotCapitalLetterException extends RuntimeException {
    public NotCapitalLetterException(String message) {
        super(message);
    }
}
