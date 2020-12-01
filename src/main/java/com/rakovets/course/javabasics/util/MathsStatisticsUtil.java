package com.rakovets.course.javabasics.util;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class MathsStatisticsUtil {
    public static int[] generateRandom (int limit) {
        return IntStream.generate(new Random()::nextInt).limit(limit).toArray();
    }

    public static long getAmount(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .count();
    }

    public static long getAmountOfOdds(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 != 0)
                .count();
    }

    public static long getAmountOfZeroes(int[] array) {
        return Arrays.stream(array)
                .filter(x -> x == 0)
                .count();
    }

    public static long getAmountOfCurrentValue(int[] array, int num) {
        return Arrays.stream(array)
                .filter(x -> x == num)
                .count();
    }
}
