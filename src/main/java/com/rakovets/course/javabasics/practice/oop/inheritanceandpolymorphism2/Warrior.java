package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
       System.out.println("Warrior attack enemy");
    }
}


