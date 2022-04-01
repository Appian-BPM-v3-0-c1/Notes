package com.revature.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentNoGenerator noGen = new StudentNoGenerator();
        List<Integer> unique = new ArrayList<>();

        Student stud1 = new Student(38, "Dylan G.", noGen.randoNoGen(unique));
        Student stud2 = new Student(31, "Chris", noGen.randoNoGen(unique));
        Student stud3 = new Student(31, "Shawn", noGen.randoNoGen(unique));
        Student stud4 = new Student(26, "Blessa", noGen.randoNoGen(unique));
        Student stud5 = new Student(25, "Lun", noGen.randoNoGen(unique));
        Student stud6 = new Student(26, "Dylan M.", noGen.randoNoGen(unique));

        System.out.println("Unsorted students list:");

        List<Student> unorderedStudList = new ArrayList<>();
        unorderedStudList.add(stud1);
        unorderedStudList.add(stud2);
        unorderedStudList.add(stud3);
        unorderedStudList.add(stud4);
        unorderedStudList.add(stud5);
        unorderedStudList.add(stud6);

        for (Student stud : unorderedStudList) {
            System.out.println(stud);
        }

        List<Student> orderedStudList = new ArrayList<>();
        orderedStudList.add(stud1);
        orderedStudList.add(stud2);
        orderedStudList.add(stud3);
        orderedStudList.add(stud4);
        orderedStudList.add(stud5);
        orderedStudList.add(stud6);

        System.out.println("\nStudents sorted by age:");
        Collections.sort(orderedStudList, new AgeComparator());

        for (Student stud : orderedStudList) {
            System.out.println(stud);
        }

        System.out.println("\nStudents sorted by name:");
        Collections.sort(orderedStudList, new NameComparator());

        for (Student stud : orderedStudList) {
            System.out.println(stud);
        }

        System.out.println("\nStudents sorted by student ID#:");
        Collections.sort(orderedStudList, new NoComparator());

        for (Student stud : orderedStudList) {
            System.out.println(stud);
        }
    }




}
