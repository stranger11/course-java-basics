package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = 0;

        do {
            System.out.println("Input a number");
            try {
                nextInt = scanner.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
       
            System.out.println(nextInt);
        } while (nextInt != -1);
    }
}
