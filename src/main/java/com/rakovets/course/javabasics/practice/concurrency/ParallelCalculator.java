package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ParallelCalculator {
    public static void getArrayAndMaxArrayElement(List<Integer[]> list) {
        for (int i = 1; i < list.size(); i++) {
            int maxElement = 0;
            for(int j = 0; j < list.get(i).length; j++) {
                maxElement = list.get(i)[0];
                if (maxElement < list.get(i)[j]) {
                    maxElement = list.get(i)[j];
                }
            }
            System.out.println("Thread1: " + "array" + i + " " + list.get(i).length + " max: " + maxElement);
        }
    }
    public static List<Integer[]> getListOfArraysWithRandomDigital(int listSize) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= listSize; i++) {
            int arrayLength = (int) (Math.random() * 1_000_000 + 1);
            Integer[] array = new Integer [arrayLength];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
        return list;
    }

    public static void getCalculationInSeveralThreads(int numberOfThreads, List<Integer[]> list) {
        for (int n = 0; n < numberOfThreads; n++) {
            Thread parallelThread = new Thread(new ParallelThreads(numberOfThreads, list, n));
            parallelThread.start();
            try {
                parallelThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void getTimeOfWorkingThreads() {
        List<Integer[]> list10 = ParallelCalculator.getListOfArraysWithRandomDigital(10);
        long startTime1Treads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(1, list10);
        long spentTime1Threads = System.currentTimeMillis() - startTime1Treads;
        long startTime2Treads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(2, list10);
        long spentTime2Threads = System.currentTimeMillis() - startTime2Treads;
        long startTime5Threads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(5, list10);
        long spentTime5Threads = System.currentTimeMillis() - startTime5Threads;
        long startTime10Threads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(10, list10);
        long spentTime10Threads = System.currentTimeMillis() - startTime10Threads;
        System.out.println("1 threads time: " + spentTime1Threads + " millis.");
        System.out.println("2 threads time: " + spentTime2Threads + " millis.");
        System.out.println("5 threads time: " + spentTime5Threads + " millis.");
        System.out.println("10 threads time:" + spentTime10Threads + " millis.");
    }

}
