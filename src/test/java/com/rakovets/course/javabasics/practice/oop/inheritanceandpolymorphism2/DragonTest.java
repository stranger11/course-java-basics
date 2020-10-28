package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DragonTest {

    Dragon dragon = new Dragon(100);
    Mag mag = new Mag("Suruki", 100);
    Hero hero = new Hero("Yan", 100) {
        @Override
        int attackEnemy(Enemy enemy1) {
            return 0;
        }
    };


    @Test
    void DragonTest(){
        Assertions.assertEquals(100, dragon.getHealth());
        Assertions.assertEquals(50, dragon.Revenge(hero,dragon));
    }
}
