package com.revature.demo.comparator;

public class Student extends Object {

    private int age;
    private String name;
    private int studentNo;

    public Student(int age, String name, int studentNo) {
        this.age = age;
        this.name = name;
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return this.age + ", " + this.name + ", " + this.studentNo;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
}
