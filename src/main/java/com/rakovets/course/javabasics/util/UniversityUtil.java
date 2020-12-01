package com.rakovets.course.javabasics.util;

import com.rakovets.course.javabasics.practice.lambdaexpressions.university.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.university.StudentList.studentList;


public class UniversityUtil {

    public static Map<Integer, List<Student>> getGroupCourse() {
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
    }

    public static List<String> getSpecialiality(){
        return studentList.stream()
                .map(Student::getSpecialty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
