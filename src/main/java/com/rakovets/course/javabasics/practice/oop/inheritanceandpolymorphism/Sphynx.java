package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String Mew() {
        return "Mau";
    }

    @Override
    public String Purr() {
        return "MurMur";
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
