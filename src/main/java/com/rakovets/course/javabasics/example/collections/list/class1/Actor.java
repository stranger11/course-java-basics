package com.rakovets.course.javabasics.example.collections.list.class1;

public class Actor {
    private String firstname;
    private String lastname;
    private int age;
    private int fee;

    public Actor(String firstname, String lastname, int age, int fee){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public int getFee() {
        return fee;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                '}';
    }
}
