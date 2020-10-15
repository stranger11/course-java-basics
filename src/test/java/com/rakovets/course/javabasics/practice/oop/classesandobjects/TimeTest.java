package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(6, 5, 7);
        System.out.printf("Time: %d:%d:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.printf("Total seconds: %d\n", time.getTotalSeconds());
    }
}
