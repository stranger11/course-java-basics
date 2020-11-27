package com.rakovets.course.javabasics.concurrencyparralelcalculator;

import com.rakovets.course.javabasics.practice.concurrency.ParallelCalculator;

import java.util.List;

public class ParallelCalculatorDemoTask2 {
    public static void main(String[] args) {
        List<Integer[]> list10 = ParallelCalculator.getListOfArraysWithRandomDigital(10);
        ParallelCalculator.getCalculationInSeveralThreads(2, list10);
    }
}
