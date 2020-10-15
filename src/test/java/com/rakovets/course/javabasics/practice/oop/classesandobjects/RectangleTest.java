package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args){
       Point topleft = new Point(2, 6);
       Point downRight = new Point(6, 3);
       Rectangle rectangle = new Rectangle(topleft, downRight);
       System.out.println(rectangle.getArea(topleft, downRight));
       System.out.println(rectangle.getPerimetr(topleft, downRight));
    }
}
