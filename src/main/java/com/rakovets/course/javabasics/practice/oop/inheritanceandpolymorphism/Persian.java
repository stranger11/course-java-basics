package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public void Mew() {
        System.out.println("MaoMao");
    }

    @Override
    public void Purr() {
        System.out.println("MarMar");
    }

    @Override
    public void Mew(Person person) {
        person.ChangeHappiness(20);
    }

    @Override
    public void Purr(Person person) {
        person.ChangeHappiness(20);
    }
}
