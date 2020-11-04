package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotCapitalLetterException;

public class Task4 {
    public static void main(String[] args) {
        DataPerson ann = new DataPerson();
        try {
            ann.setName("ann");
        } catch (NotCapitalLetterException e) {
            e.printStackTrace(System.out);
        }
    }
}