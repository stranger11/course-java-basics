package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void Mew() {
        System.out.println("Miu");
    }

    @Override
    public void Purr() {
        System.out.println("Mar");
    }

    @Override
    public void Mew(Person person) {
        person.ChangeHappiness(-10);
    }

    @Override
    public void Purr(Person person) {
        person.ChangeHappiness(-10);
    }
}
