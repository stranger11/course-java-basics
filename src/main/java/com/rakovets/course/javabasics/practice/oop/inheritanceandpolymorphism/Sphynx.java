package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void Mew() {
        System.out.println("Mau");
    }

    @Override
    public void Purr() {
        System.out.println("MurMur");
    }

    @Override
    public void Mew(Person person) {
        person.ChangeHappiness(30);
    }

    @Override
    public void Purr(Person person) {
        person.ChangeHappiness(30);
    }
}
