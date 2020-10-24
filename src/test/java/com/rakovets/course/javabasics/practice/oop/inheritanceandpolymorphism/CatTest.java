package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CatTest {
    @Test
    void task1() {
        String name = "Vasia";
        Cat cat = new Cat(name);
        assertEquals(name, cat.getName());
    }

    @Test
    void task2() {
        Siamese siamese = new Siamese("Sim");
        assertTrue(siamese instanceof Cat);
        Persian persian = new Persian("Pers");
        assertTrue(persian instanceof Cat);
        Sphynx sphynx = new Sphynx("Fin");
        assertTrue(sphynx instanceof Cat);
    }

    @Test
    void task3() {
        Person person = new Person(100);
        assertEquals(100, person.getHappiness());
        person.setHappiness(50);
        assertEquals(50, person.getHappiness());
        person.changeHappiness(30);
        assertEquals(80, person.getHappiness());
        person.changeHappiness(-10);
        assertEquals(70, person.getHappiness());
    }

    @Test
    void task4() {
        Person person = new Person(80);
        Cat cat = new Cat("Kitty");
        cat.Mew(person);
        assertEquals(75, person.getHappiness());
        cat.Purr(person);
        assertEquals(85, person.getHappiness());
    }

    @Test
    void task5() {
        Person person = new Person(80);
        Persian persian = new Persian("Pers");
        persian.Mew(person);
        assertEquals(65, person.getHappiness());
        persian.Purr(person);
        assertEquals(85, person.getHappiness());
        Siamese siamese = new Siamese("Sim");
        siamese.Mew(person);
        assertEquals(75, person.getHappiness());
        siamese.Purr(person);
        assertEquals(90, person.getHappiness());
        Sphynx sphynx = new Sphynx("King");
        sphynx.Mew(person);
        assertEquals(70, person.getHappiness());
        sphynx.Purr(person);
        assertEquals(95, person.getHappiness());
    }


}