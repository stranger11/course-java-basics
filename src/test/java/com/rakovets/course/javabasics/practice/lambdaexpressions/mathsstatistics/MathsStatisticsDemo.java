package com.rakovets.course.javabasics.practice.lambdaexpressions.mathsstatistics;

import java.util.Arrays;
import static com.rakovets.course.javabasics.util.MathsStatisticsUtil.*;

public class MathsStatisticsDemo {
    public static void main(String[] args) {
        int[] array = generateRandom(5);
        System.out.println(Arrays.toString(array));
        System.out.println("Task1 : " + getAmount(array));
        System.out.println("Task2 : " + getAmountOfOdds(array));
        int[] array2 = {1, 0, 7, 2, 10, 6, 0, 1, 8, 2};
        System.out.println("Array: " + Arrays.toString(array2));
        System.out.println("Task3 : " + getAmountOfZeroes(array2));
        int num = 0;
        System.out.println("Task4, value: " + num + ", amount: " + getAmountOfCurrentValue(array2, num));
    }
}
