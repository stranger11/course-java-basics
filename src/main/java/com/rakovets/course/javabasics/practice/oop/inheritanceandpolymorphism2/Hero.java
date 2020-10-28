package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

public abstract class Hero {

    String name;
    int herohealth;
    int remainder;

    public Hero(String name, int herohealth) {
        this.name = name;
        this.herohealth = herohealth;
    }

    public String getName() {
        return name;
    }

    String  Indexofhealth() {
        return ("Health of " + name + ":" + herohealth);
    }

    String HeroesDeath() {
        if (herohealth == 0){
            return (name + " is dead!");
        } else {
            return (name + " is alive!");
        }
    }

    abstract int attackEnemy (Enemy enemy1);
}
