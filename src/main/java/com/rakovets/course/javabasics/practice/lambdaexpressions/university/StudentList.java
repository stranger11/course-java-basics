package com.rakovets.course.javabasics.practice.lambdaexpressions.university;

import java.util.List;

public class StudentList {
    public static List<Student> studentList = List.of(
            new Student("Yan", "Pashyk", "Android developer", 4),
            new Student("Anton", "Pastrevich", "Architect", 3),
            new Student("Gleb", "Markin", "IOS developer", 5),
            new Student("Alex", "Frolov", "Engineer", 3),
            new Student("Max", "Andreev", "Radio engineer", 5)
    );
}
