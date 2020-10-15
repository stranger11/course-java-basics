package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
      int x;
      int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point first, Point second) {
        int a = second.x - first.x;
        int b = second.y - first.y;
        double result = Math.sqrt(a * a + b * b);
        return result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
