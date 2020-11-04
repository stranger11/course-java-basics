package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        try {
            realExceptions();
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
    }

    public static void realExceptions() throws ArithmeticException, NumberFormatException, ClassCastException {
        Random random = new Random();
        int num = 0 + random.nextInt(4 - 0);
        switch (num) {
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new ClassCastException();
        }
    }
}