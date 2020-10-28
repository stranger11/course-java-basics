package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Archer extends Hero {


    public Archer(String name, int herohealth) {
        super(name, herohealth);
    }

    String FireArrows(Enemy enemy) {
        return ("Enemy Fired!");
    }


    @Override
    int attackEnemy(Enemy enemy1) {
        remainder = enemy1.takeDamage(15);
        if (remainder > 0) {
            return remainder;
        } else
            return 0;
    }
}
