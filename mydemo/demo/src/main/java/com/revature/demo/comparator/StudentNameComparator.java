package com.revature.demo.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator {
        public  int compareFirstName(Object obj1, Object obj2){
                Student student1 = (Student)obj1;
                Student student2 = (Student)obj2;

                return (student1.getFirstName()).compareTo(student2.getFirstName());
        }


}
