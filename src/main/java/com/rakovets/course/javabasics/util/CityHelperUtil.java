package com.rakovets.course.javabasics.util;

import java.util.List;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.cityhelper.CityHelper.cities;

public class CityHelperUtil {

    public static List<String> getList() {
        return cities;
    }

    public static Object[] getUnique() {
        return cities.stream()
                .distinct()
                .toArray();
    }

    public static void getBiggerThanSixLetters() {
        cities.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);
    }

    public static void getStartWithLetter(char letter) {
        cities.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .forEach(System.out::println);
    }

    public static long getNumberOfRepeatingCities(String city) {
        return cities.stream()
                .filter(city::equals)
                .count();
    }
}
