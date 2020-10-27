package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(30);
        System.out.println("Archer attack enemy");
    }
}
