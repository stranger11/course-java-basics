package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

public class Fraction implements Runnable {
    private int head;
    private int torso;
    private int hand;
    private int feet;
    private int robot;
    private Factory factory;
    protected String fractionName;

    public Fraction(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        Part bodyPart;
        while ((bodyPart = factory.consume()) != null) {
            switch (bodyPart) {
                case HEAD:
                    head++;
                    break;
                case TORSO:
                    torso++;
                    break;
                case HAND:
                    hand++;
                    break;
                case FEET:
                    feet++;
                    break;
            }
        }
        System.out.println(fractionName + " took: " + head + " heads, " + torso + " torsos, " + hand + " hands, " + feet + " feets.");
        while (head > 0 && torso > 0 && hand > 1 && feet > 1) {
            robot++;
            head--;
            torso--;
            hand -= 2;
            feet -= 2;
        }
    }

    public int getRobot() {
        return robot;
    }
}

enum Part {
    HEAD, TORSO, HAND, FEET
}
