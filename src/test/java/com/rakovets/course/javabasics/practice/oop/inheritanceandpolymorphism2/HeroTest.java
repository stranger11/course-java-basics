package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {
    Hero hero = new Hero("Sven", 100) {
        @Override
        int attackEnemy(Enemy enemy1) {
            return 0;
        }
    };

    @Test
    void HeroTest(){
        Assertions.assertEquals("Sven", hero.getName());
        Assertions.assertEquals("Sven is alive!", hero.HeroesDeath());
        Assertions.assertEquals("Health of Sven:100", hero.Indexofhealth());
    }
}
