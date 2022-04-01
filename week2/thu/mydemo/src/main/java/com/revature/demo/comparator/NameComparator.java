package com.revature.demo.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Student stud1=(Student)o1;
        Student stud2=(Student)o2;

        return stud1.getName().compareTo(stud2.getName());
    }
}
