package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.DivisionZeroException;

public class Task7 {
    public static void main(String[] args) throws DivisionZeroException {
        try {
            half();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Half worked");
        }
    }

    public static void half() throws NullPointerException {
        int random = (int) Math.round(Math.random());
        if (random == 0) throw new NullPointerException();
    }
}