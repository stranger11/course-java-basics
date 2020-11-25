package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer;

public class ConsumerThread implements Runnable{
    private Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        store.consume();
    }
}
