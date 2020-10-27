package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

public class Enemy implements Mortal{

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public void attackEnemy(Enemy enemy){
        enemy.takeDamage(10);
    }


    public int takeDamage(int damage){
        return health -= damage;
    }

    public void attackHero(Hero hero) {
        hero.takeHeroDamage(10);
        System.out.println("Enemy attack hero");
    }

    @Override
    public boolean isAlive(Enemy enemy) {
        if (enemy.health > 0) {
            return true;
        }

        return false;
    }
}
