package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {
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
