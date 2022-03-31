package com.revature.demo.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> sl = new ArrayList<>();
        sl.add(new Student("Joe",13,6));
        sl.add(new Student("Adrian",12,5));
        sl.add(new Student("Amy",14,7));
        Collections.sort(sl, new AgeComparator());
        Iterator itr = sl.iterator();
        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.getName() + " " + st.getAge() + " " + st.getGrade());
        }
    }
}
