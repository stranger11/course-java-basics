package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    private final String[] products = {"vine", "whiskey", "gin", "tequila", "rom", "beer", "vodka", "cognac"};
    private final Integer[] cashBox = {1, 2, 3};

    public void buy(Buyer buyer) {
        int number1 = new Random().nextInt(cashBox.length);
        synchronized (cashBox[number1]) {
            System.out.println("cashbox" + cashBox[number1] + " serves " + buyer.getName());
            for(String product : buyer.getList()) {
                System.out.println("cashbox" + cashBox[number1] + " struck " + product);
            }
        }
    }

    public List<String> getListOfProducts() {
        List<String> list = new ArrayList<>();
        int max = 10;
        int amountOfProducts = new Random().nextInt(max) + 1;
        for (int i = 0; i < amountOfProducts; i++) {
            int numberOfProduct = new Random().nextInt(products.length);
            list.add(products[numberOfProduct]);
        }
        return list;
    }
}
