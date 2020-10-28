package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Mag extends Hero {


    public Mag(String name, int herohealth) {
        super(name, herohealth);
    }

    int Hill(Hero hero1){
        return hero1.herohealth + 20;
    }

    @Override
    int attackEnemy(Enemy enemy1) {
        int remainder = enemy1.takeDamage(20);
        if (remainder > 0){
            return remainder;
        } else
            return 0;
    }
}