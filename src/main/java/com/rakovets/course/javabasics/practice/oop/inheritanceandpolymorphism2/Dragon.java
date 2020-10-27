package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Dragon extends Enemy {

    int regeneration = 500;

    public Dragon(int health) {
        super(health);
    }

    public int IncredibleDragon(Hero hero) {
        if (getHealth() == 0) {
            return setHealth(regeneration);
        } else {
            return getHealth();
        }
    }
}


