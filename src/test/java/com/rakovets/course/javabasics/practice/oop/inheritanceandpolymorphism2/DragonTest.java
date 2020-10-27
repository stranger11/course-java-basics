package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DragonTest {
    private static Dragon dragon;

    @BeforeAll
    static void init() {
        dragon =  new Dragon(30);
    }

    @Test
    void enemyTest() {
        Assertions.assertEquals(30, dragon.getHealth());
        Assertions.assertEquals(true, dragon.isAlive(dragon));
    }
}