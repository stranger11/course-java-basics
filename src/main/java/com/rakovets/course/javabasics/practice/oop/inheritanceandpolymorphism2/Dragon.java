package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Dragon extends Enemy {
    public Dragon(int health) {
        super(health);
    }

    @Override
    int takeDamage(int damage) {
        return health -= damage;
    }

    @Override
    int Revenge(Hero hero1, Enemy enemy1) {
        int ost = hero1.attackEnemy(enemy1);
        if (ost != enemy1.health) {
            return hero1.herohealth - 50;
        } else
            return hero1.herohealth;
    }
}


