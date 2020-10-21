package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public void Mew(Person person) {
        person.ChangeHappiness(-2);
    }

    public void Purr(Person person) {
        person.ChangeHappiness(3);
    }

    public String Mew(){
        return "Meow";
    }

    public String Purr(){
        return "Mur";
    }

    public String getName(){
        return name;
    }

    public void setName() {
        this.name = name;
    }



}
