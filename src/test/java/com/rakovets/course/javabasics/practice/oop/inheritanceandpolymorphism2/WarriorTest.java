package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Warrior warrior = new Warrior("Roma", 100);
    Enemy enemy = new Enemy(100);

    @Test
    void WarriorTest() {
        Assertions.assertEquals("Roma", warrior.getName());
        Assertions.assertEquals(90, warrior.attackEnemy(enemy));
        Assertions.assertEquals("Warrior transform in Beast!", warrior.Beast());
    }
}
