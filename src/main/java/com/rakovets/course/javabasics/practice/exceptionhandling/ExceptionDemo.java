package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {

    }

    void Task1() {
        String name = null;
        try {
            name.length();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка");
        }
    }

    void Task2() {
        int [] marks = new int[3];
        try {
            marks[4] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }


}
