package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    int happiness;

    public Person(int happiness){
        this.happiness = happiness;
    }

    int ChangeHappiness(int percentHappiness){
        return this.happiness += percentHappiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }


}
