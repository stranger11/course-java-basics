package com.rakovets.course.javabasics.practice.jcf.list;
import com.rakovets.course.javabasics.example.collections.list.class1.Actor;
import com.rakovets.course.javabasics.example.collections.list.studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {

    @Test
    void studioTest() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Brad", "Pitt", 51, 1000));
        actors.add(new Actor("Leo", "Dicaprio", 41, 900));
        actors.add(new Actor("Al", "Pachino", 75, 910));
        actors.add(new Actor("Robert", "Pattinson", 35, 100));
        Studio studio = new Studio(actors);
        actors.sort(Studio.fee);
        Assertions.assertEquals("1000 910 900 100", studio.getFees());
        actors.sort(Studio.age);
        Assertions.assertEquals("35 41 51 75", studio.getAges());
        actors.sort(Studio.lastName);
        Assertions.assertEquals("Dicaprio Pachino Pattinson Pitt", studio.getLastNames());
        actors.sort(Studio.lastNameAndAge);
        Assertions.assertEquals("Dicaprio Pachino Pattinson Pitt", studio.getLastNames());
        Assertions.assertEquals("41 75 35 51", studio.getAges());
        actors.sort(Studio.feeAndLastName);
        Assertions.assertEquals("1000 910 900 100", studio.getFees());
        Assertions.assertEquals("Pitt Pachino Dicaprio Pattinson", studio.getLastNames());
        studio.fire();
        Assertions.assertEquals("910 900 100", studio.getFees());
    }
}
