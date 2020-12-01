package com.rakovets.course.javabasics.practice.lambdaexpressions.cityhelper;
import java.util.Arrays;

import static com.rakovets.course.javabasics.util.CityHelperUtil.*;

public class CityHelperDemo {
    public static void main(String[] args) {
        System.out.println("List of cities: " + getList());
        System.out.println("\nUnique cities: " + Arrays.toString(getUnique()));
        System.out.print("\nBigger than 6 letters: ");
        getBiggerThanSixLetters();
        System.out.print("\nStart with given letter: ");
        getStartWithLetter('T');
        String city = "Tokyo";
        System.out.print("\nNumber repeating city in list: " + getNumberOfRepeatingCities(city));
    }
}
