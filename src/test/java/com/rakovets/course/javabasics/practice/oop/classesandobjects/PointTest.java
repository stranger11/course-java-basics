package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args){
        Point first = new Point(3, 5);
        Point second = new Point(2, 6);
        System.out.println(Point.distance(first, second));
    }
}
