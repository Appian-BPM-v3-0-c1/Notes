package com.revature.demo.comparator;

import java.util.Comparator;

public class NoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getStudentNo() == o2.getStudentNo()) {
            return 0;
        } else if (o1.getStudentNo() > o2.getStudentNo()) {
            return 1;
        }

        return -1;

    }
}
