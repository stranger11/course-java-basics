package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Archer legolaz = new Archer("Legolaz", 100);
    Enemy enemy = new Enemy(100);

    @Test
    void ArcherTest() {
        Assertions.assertEquals(85, legolaz.attackEnemy(enemy));
        Assertions.assertEquals("Enemy Fired!", legolaz.FireArrows(enemy));
    }
}
