package com.rakovets.course.javabasics.util;

import java.util.ArrayList;

public class СityHelper {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Vilnius");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London");

        cities.stream()
                .filter(s -> s.startsWith("V"))
                .forEach(System.out::println);

        cities.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);

    }
}
