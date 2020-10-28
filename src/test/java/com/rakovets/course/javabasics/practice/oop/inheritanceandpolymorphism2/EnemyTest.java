package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest {

    Enemy enemy = new Enemy(100);
    Hero hero = new Hero("Sam", 100) {
        @Override
        int attackEnemy(Enemy enemy1) {
            return 0;
        }
    };

    @Test
    void EnemyTest() {
        Assertions.assertEquals(100, enemy.getHealth());
        Assertions.assertEquals(80, enemy.takeDamage(20));
        Assertions.assertEquals(90, enemy.Revenge(hero, enemy));
        Assertions.assertEquals(true, enemy.isAlive());
    }
}
