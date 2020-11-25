package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.produserconsumer;

public class ProducerThread implements Runnable{
    private Store store;
    public ProducerThread(Store store) {
        this.store = store;
    }
    public void run() {
            store.produce();
        }
}
