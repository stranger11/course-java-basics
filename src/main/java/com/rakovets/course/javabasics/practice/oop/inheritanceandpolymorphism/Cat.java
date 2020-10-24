package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    String name;

    public Cat(String name){
        this.name = name;
    }

    public void Mew(Person person) {
        person.changeHappiness(-5);
    }

    public void Purr(Person person) {
        person.changeHappiness(10);
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

    public void setName(String name) {
        this.name = this.name;
    }



}
