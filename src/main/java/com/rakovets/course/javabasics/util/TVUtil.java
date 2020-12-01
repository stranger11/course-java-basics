package com.rakovets.course.javabasics.util;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tvtask.TV;

import java.util.Comparator;
import java.util.List;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.tvtask.TVList.list;

public class TVUtil {

    public static List<TV> getList() {
        return list;
    }

    public static void getDiagonal(int diagonal) {
        list.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .forEach(System.out::println);
    }

    public static void getManufacturer(String manufacturer) {
        list.stream()
                .filter(tv -> tv.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);
    }

    public static void getYounger() {
        list.stream()
                .filter(TVUtil::fitsCriteriaAge)
                .forEach(System.out::println);
    }

    public static void getInPriceRange() {
        list.stream()
                .filter(TVUtil::fitsCriteriaPrice)
                .forEach(System.out::println);
    }

    public static void getSortedDownPrice() {
        list.stream()
                .sorted((tv1, tv2) -> (int) (tv2.getPrice() - tv1.getPrice()))
                .forEach(System.out::println);
    }

    public static void getSortedUpPrice() {
        list.stream()
                .sorted((tv1, tv2) -> (int) (tv1.getPrice() - tv2.getPrice()))
                .forEach(System.out::println);
    }

    public static void getSortedDownDiagonal() {
        list.stream()
                .sorted((tv1, tv2) -> tv2.getDiagonal() - tv1.getDiagonal())
                .forEach(System.out::println);
    }

    public static void getSortedUpDiagonal() {
        list.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .forEach(System.out::println);
    }

    private static boolean fitsCriteriaAge(TV tv) {
        return tv.getYearOfIssue() < 2020;
    }

    private static boolean fitsCriteriaPrice(TV tv) {
        return tv.getPrice() > 500.0 && tv.getPrice() < 1000.0;
    }
}
