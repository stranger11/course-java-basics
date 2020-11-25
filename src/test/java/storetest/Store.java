package storetest;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store.Buyer;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store.Shop;

public class Store {
    public static void main(String[] args) {
        int numberOfBuyers = 3;
        Buyer[] buyers = new Buyer[numberOfBuyers];
        Shop shop = new Shop();
        for (int i = 0; i < numberOfBuyers; i++) {
            buyers[i] = new Buyer(shop);
            new Thread(buyers[i]).start();
        }
    }
}

