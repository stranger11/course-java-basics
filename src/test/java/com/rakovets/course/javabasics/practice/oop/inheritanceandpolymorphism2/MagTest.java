package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagTest {
    Mag mag = new Mag("Stinger", 200);
    Enemy enemy = new Enemy(100);
    Warrior warrior = new Warrior("Sam", 80);

    @Test
    void MagTest(){
        Assertions.assertEquals("Stinger", mag.getName());
        Assertions.assertEquals(80, mag.attackEnemy(enemy));
        Assertions.assertEquals(100, mag.Hill(warrior));
    }
}
