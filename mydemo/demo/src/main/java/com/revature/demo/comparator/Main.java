package com.revature.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentComparator compare = new StudentComparator();


        ArrayList studentList = new ArrayList();

        studentList.add(new Student("Jacob","Soto",25,2018,2.6));
        studentList.add(new Student("Tracy","Carrington",44,2002,3.5));
        studentList.add(new Student("Xavier","Davis",30,2013,4.0));
        studentList.add(new Student("Tempistt","Lockett",36,2008,3.0));
        studentList.add(new Student(("Russell","Anderson",40,1999,2.9));
        studentList.add(new Student("Tahesha","O",30,2006,3.6));


        Collections.sort(studentList. new Student());
        System.out.println(compare.compare(studentList.get(0), studentList.get(1)));
    }
}
