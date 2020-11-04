package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.DivisionZeroException;

public class Task5 {
    public static void main(String[] args) {
        try {
            try {
                int num = 5 / 0;
            } catch (ArithmeticException e) {
                throw new DivisionZeroException(e.getMessage());
            }
        } catch (DivisionZeroException e) {
            e.printStackTrace(System.out);
        }
    }
}