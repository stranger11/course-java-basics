package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String Mew() {
        return "MaoMao";
    }

    @Override
    public String Purr() {
        return "MarMar";
    }

    @Override
    public void Mew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public void Purr(Person person) {
        person.changeHappiness(20);
    }
}
