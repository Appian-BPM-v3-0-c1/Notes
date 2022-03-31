package com.revature.demo.comparator;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;
    private int year;
    private double gpa;

    public Student(){};

    public Student(String firstName, String lastName, int age, int year, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}
