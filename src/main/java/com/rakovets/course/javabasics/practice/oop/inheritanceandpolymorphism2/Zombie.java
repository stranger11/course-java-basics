package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    int takeDamage(int damage) {
        return health -= damage;
    }

    int Ressurection (Hero hero1, Enemy enemy){
        hero1.attackEnemy(enemy);
        if (enemy.health == 0) {
            return enemy.health + 100;
        } else
            return enemy.health;
    }

}
