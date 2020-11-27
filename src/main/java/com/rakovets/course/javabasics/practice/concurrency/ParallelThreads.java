package com.rakovets.course.javabasics.practice.concurrency;

import java.util.List;

public class ParallelThreads implements Runnable {
    int numberOfThreads;
    List<Integer[]> list;
    int n;
    public ParallelThreads (int numberOfThreads, List<Integer[]> list, int n) {
        this.numberOfThreads = numberOfThreads;
        this.list = list;
        this.n = n;
    }

    @Override
    public void run() {
        int oneThreadArrays = 0;
        if (list.size() % numberOfThreads == 0) {
            oneThreadArrays = list.size() / numberOfThreads;
        } else {
            oneThreadArrays = list.size() / numberOfThreads + 1;
        }
        for (int i = (n * oneThreadArrays); (i < (n * oneThreadArrays + oneThreadArrays)) && (i < list.size()); i++) {
            int maxElement = 0;
            for(int j = 0; j < list.get(i).length; j++) {
                maxElement = list.get(i)[0];
                if (maxElement < list.get(i)[j]) {
                    maxElement = list.get(i)[j];
                }
            }
            System.out.println("Threads " + numberOfThreads + " array" + i + " " + list.get(i).length + " max: " + maxElement);
        }
    }
}
