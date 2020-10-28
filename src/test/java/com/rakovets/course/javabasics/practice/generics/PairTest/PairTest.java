package com.rakovets.course.javabasics.practice.generics.PairTest;

import com.rakovets.course.javabasics.practice.generics.Pair.Pair;
import com.rakovets.course.javabasics.practice.generics.Pair.PairUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    void pairTest() {
        Pair<Integer, String> pair = new Pair(11, "eleven");
        Pair<String, Integer> swapedPair = PairUtil.swap(pair);
        Assertions.assertEquals("eleven", swapedPair.getKey());
        Assertions.assertEquals(11, swapedPair.getValue());
        Pair<Double, Integer> pair2 = new Pair(9.99, 10);
        Pair<Integer, Double> swapedPair2 = PairUtil.swap(pair2);
        Assertions.assertEquals(10, swapedPair2.getKey());
        Assertions.assertEquals(9.99, swapedPair2.getValue());
    }
}