package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumertest;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer.ConsumerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer.ProducerThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer.Store;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producer = new ProducerThread(store);
        ConsumerThread consumer = new ConsumerThread(store);
        new Thread(producer).start();
        new Thread(consumer).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
