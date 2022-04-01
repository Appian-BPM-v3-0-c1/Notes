package com.revature.demo.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {

        if (stud1.getAge() == stud2.getAge()) {
            return 0;
        } else if (stud1.getAge() > stud2.getAge()) {
            return 1;
        }

        return -1;
    }
}
