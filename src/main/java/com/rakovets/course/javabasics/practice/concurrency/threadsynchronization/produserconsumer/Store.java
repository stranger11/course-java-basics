package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> list = new LinkedList<>();
    public static final String RED = "\033[0;31m";
    public static final String BLUE = "\033[0;34m";

    public synchronized void produce() {
        while (true) {
            while (list.size() >= 10) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            Random random = new Random();
            int num = random.nextInt(100);
            list.add(num);
            System.out.println( BLUE + "Number" + num + " produced. Size:" + list.size());
            notify();
        }
    }


    public synchronized void consume() {
        while (true) {
            try {
                Random random = new Random();
                int num = random.nextInt(10);
                Thread.sleep(num);
            } catch (InterruptedException e) {
                break;
            }
            while (list.size() <= 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    break;
                }
            }
            int first = list.getFirst();
            list.removeFirst();
            System.out.println(RED + "Number" + first + " consumed. Size:" + list.size());
            notify();
        }
    }
}
