package com.rakovets.course.javabasics.practice.lambdaexpressions.university;

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;

    public Student(String name, String surname, String specialty, int course) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int ourse) {
        this.course = ourse;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + ", " + specialty + ", " + course;
    }
}


