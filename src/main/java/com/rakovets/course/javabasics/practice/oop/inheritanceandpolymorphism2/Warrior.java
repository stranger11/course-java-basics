package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Warrior extends Hero {


    public Warrior(String name, int herohealth) {
        super(name, herohealth);
    }

    String Beast() {
        return "Warrior transform in Beast!";
    }

    @Override
    int attackEnemy(Enemy enemy1) {
        int remainder = enemy1.takeDamage(10);
        if (remainder > 0){
            return remainder;
        } else
            return 0;
    }
}