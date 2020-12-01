package com.rakovets.course.javabasics.practice.lambdaexpressions.tvtest;

import static com.rakovets.course.javabasics.util.TVUtil.*;

public class TVDemo {
    public static void main(String[] args) {
        System.out.println("TASK1:");
        System.out.println(getList());
        System.out.print("\nTASK2:\n");
        getDiagonal(24);
        System.out.print("\nTASK3:\n");
        getManufacturer("Horizont");
        System.out.print("\nTASK4:\n");
        getYounger();
        System.out.print("\nTASK5:\n");
        getInPriceRange();
        System.out.print("\nTASK6:\n");
        getSortedDownPrice();
        System.out.print("\nTASK7:\n");
        getSortedUpPrice();
        System.out.print("\nTASK8:\n");
        getSortedDownDiagonal();
        System.out.print("\nTASK9:\n");
        getSortedUpDiagonal();
    }
}
