package com.revature.demo.comparator;

import java.util.ArrayList;
import java.util.List;

public class StudentNoGenerator {

    private final int max = 9999;
    private final int min = 1000;

    public int randoNoGen(List<Integer> unique) {

        while (true) {
            int id1 = (int) Math.floor(Math.random() * (max - min) + min);

            if (!unique.contains(id1)) {
                unique.add(id1);
                return id1;
            }
        }
    }

}
