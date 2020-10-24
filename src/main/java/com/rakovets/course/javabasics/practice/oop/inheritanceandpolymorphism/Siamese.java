package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String Mew() {
        return "Miu";
    }

    @Override
    public String Purr() {
        return "Mar";
    }

    @Override
    public void Mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public void Purr(Person person) {
        person.changeHappiness(15);
    }
}
