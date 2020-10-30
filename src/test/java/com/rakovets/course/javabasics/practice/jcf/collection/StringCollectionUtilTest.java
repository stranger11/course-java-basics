package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.collections.collection.StringCollectionUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringCollectionUtilTest {

    @Test
    void task2() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] result = new String[]{"*", "is", "*", "of", "fun", "for", "every", "*", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.resetWordsByLength(list, 4);
        assertArrayEquals(result, list.toArray());
    }


    @Test
    void task3() {
        String[] array = new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] result = new String[]{"is", "of", "fun", "for", "every", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.removeWordsByLength(list, 4);
        assertArrayEquals(result, list.toArray());
    }
}
