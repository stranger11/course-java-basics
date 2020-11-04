package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
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
}
