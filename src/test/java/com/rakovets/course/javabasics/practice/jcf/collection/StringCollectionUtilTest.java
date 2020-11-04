package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.collections.collection.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringCollectionUtilTest {

    @Test
    void task2() {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        Collection<String> list = new ArrayList<String>();
        list.add("java");
        list.add("mir");
        list.add("kent");
        list.add("of");
        list.add("stay");
        Assertions.assertEquals(Arrays.<String>asList("java", "mir", "kent", "*", "stay"), stringCollectionUtil.resetWordsByLength(list, 2));
    }




    @Test
    void task3() {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        Collection<String> list = new ArrayList<String>();
        list.add("time");
        list.add("of");
        list.add("mid");
        list.add("tomas");
        list.add("begruj");
        Assertions.assertEquals(Arrays.<String>asList("time", "mid", "tomas", "begruj"), stringCollectionUtil.removeWordsByLength(list, 2));
    }
}
