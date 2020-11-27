package com.rakovets.course.javabasics.concurrencyparralelcalculator;

import com.rakovets.course.javabasics.practice.concurrency.ParallelCalculator;

import java.util.List;

public class ParallelCalculatorDemoTask1 {
    public static void main(String[] args) {
        List<Integer[]> list10 = ParallelCalculator.getListOfArraysWithRandomDigital(11);
        ParallelCalculator.getArrayAndMaxArrayElement(list10);
    }
}
