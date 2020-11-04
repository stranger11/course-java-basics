package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotCapitalLetterException;
import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotGenderException;

public class DataPerson {
    private String name;
    private String gender;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NotCapitalLetterException {
        if(name.equals(name.toLowerCase())) throw new NotCapitalLetterException("Name should start with capital letter! ");
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender (String gender) throws NotGenderException {
        if (gender != "male" && gender != "female") throw new NotGenderException(gender + " is a not gender!");
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
