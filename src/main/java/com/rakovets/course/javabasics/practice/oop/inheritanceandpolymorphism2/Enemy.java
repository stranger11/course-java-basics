package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

public class Enemy implements Mortal {

    int health;

    public Enemy(int health) {
        this.health = health;
    }

    int takeDamage(int damage) {
        return health -= damage;
    }

    int Revenge (Hero hero1, Enemy enemy1){
        int ost = hero1.attackEnemy(enemy1);
        if(ost != enemy1.health) {
            return hero1.herohealth - 10;
        } else
            return hero1.herohealth;
    }


    public boolean isAlive() {
        if (health > 0){
            return true;
        } else {
            return false;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
