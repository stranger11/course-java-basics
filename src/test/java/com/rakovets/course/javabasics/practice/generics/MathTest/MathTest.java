package com.rakovets.course.javabasics.practice.generics.MathTest;

import com.rakovets.course.javabasics.practice.generics.Math.Math;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    void task1() {
        assertEquals(3, Math.max(1, 2, 3));
        assertEquals(77, Math.max(12, 9, 77));
        assertEquals(7.0, Math.max(1.0, 2.0, 7.0));
    }

    @Test
    void task2() {
        assertEquals(0, Math.min(2, 2, 1, 0, 1));
        assertEquals(1.0, Math.min(5.0, 1.0, 6.0, 110.0, 11.0));
        assertEquals(5, Math.min(23, 5, 12, 25, 56));
    }

    @Test
    void task3() {
        assertEquals("12", Math.average(new Integer[]{10, 11, 12, 13, 14}));
        assertEquals("3.0", Math.average(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}));
    }

    @Test
    void task4() {
        assertEquals("f", Math.arrayMax(new String[]{"b", "f", "e"}));
        assertEquals(7, Math.arrayMax(new Integer[]{7, 2, 6}));
        assertEquals(15.0, Math.arrayMax(new Double[]{10.0, 7.0, 15.0}));
    }

    @Test
    void task5() {
        assertEquals(5, Math.arrayMin(new Integer[]{5, 119, 16}));
        assertEquals(1.0, Math.arrayMin(new Double[]{2.0, 1.0, 2.0}));
        assertEquals("a", Math.arrayMin(new String[]{"a", "b", "f"}));
    }

    @Test
    void task6() {
        assertArrayEquals(new Integer[]{1, 2, 3}, Math.arraySort(new Integer[]{3, 2, 1}));
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0}, Math.arraySort(new Double[]{2.0, 3.0, 1.0}));
        assertArrayEquals(new String[]{"a", "b", "c"}, Math.arraySort(new String[]{"b", "c", "a"}));

    }

    @Test
    void task7() {
        assertEquals(1, Math.arraySearch(new Double[]{9.9, 10.0, 9.99}, 10.0));
        assertEquals(2, Math.arraySearch(new Integer[]{8, 9, 10}, 10));
        assertEquals(0, Math.arraySearch(new String[]{"aaa", "bbb", "ccc"}, "aaa"));

    }
}
