package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {
    Zombie zombie = new Zombie(20);
    Hero hero = new Hero("Yan", 100) {
        @Override
        int attackEnemy(Enemy enemy1) {
            return 0;
        }
    };

    @Test
    void ZombieTest() {
        Assertions.assertEquals(20, zombie.getHealth());
        Assertions.assertEquals(0, zombie.takeDamage(20));
        Assertions.assertEquals(100, zombie.Ressurection(hero,zombie));
    }
}
