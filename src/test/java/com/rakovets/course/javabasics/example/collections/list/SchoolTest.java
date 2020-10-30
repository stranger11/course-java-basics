package com.rakovets.course.javabasics.example.collections.list;

import com.rakovets.course.javabasics.example.collections.list.class1.SchoolClass;
import com.rakovets.course.javabasics.example.collections.list.studio.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {

    @Test
    void classTest() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", "Antonov", 17, 8.1));
        students.add(new Student("Yan", "Pashyk", 19, 8.2));
        students.add(new Student("Alex", "Zverev", 18, 5.3));
        students.add(new Student("Anton", "Pastrevich", 18, 9.1));
        students.add(new Student("Artem", "Volkov",21, 8.2));
        SchoolClass schoolClass = new SchoolClass(students);
        assertEquals("Pastrevich", schoolClass.getBestStudent().getSurname());
        students.sort(schoolClass.name);
        assertEquals("Alex Andrei Anton Artem Yan", schoolClass.getNames());
        assertEquals("Zverev Antonov Pastrevich Volkov Pashyk", schoolClass.getSurnames());
        students.sort(schoolClass.age);
        assertEquals("21 19 18 18 17", schoolClass.getAges());
        students.sort(schoolClass.mark);
        assertEquals("9.1 8.2 8.2 8.1 5.3", schoolClass.getMarks());

    }
}