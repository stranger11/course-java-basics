package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point topLeft;
    Point downRight;

    Rectangle(Point topLeft, Point downRight){
        this.topLeft = topLeft;
        this.downRight = downRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getDownRight() {
        return downRight;
    }

    public void setDownRight(Point downRight) {
        this.downRight = downRight;
    }

    int getPerimetr(Point topLeft, Point downRight){
        int a = downRight.x - topLeft.x;
        int b = downRight.y - topLeft.y;
        int perimetr = 2 * (Math.abs(a) + Math.abs(b));
        return perimetr;
        }


    int getArea(Point topLeft, Point downRight){
        int a = downRight.x - topLeft.x;
        int b = downRight.y - topLeft.y;
        int area = Math.abs(a) * Math.abs(b);
        return area;
    }


}
