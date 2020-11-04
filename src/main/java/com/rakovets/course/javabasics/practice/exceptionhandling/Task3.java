package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotGenderException;

public class Task3 {
    public static void main(String[] args) {
        DataPerson tomas = new DataPerson();
        try {
            tomas.setGender("transgender");
        } catch (NotGenderException e) {
            e.printStackTrace(System.out);
        }
    }
}