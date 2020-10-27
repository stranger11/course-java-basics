package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println("Mag attack enemy");
    }


}
