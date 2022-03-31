package com.revature.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(10000, "Toyota", "Camry"));
        carList.add(new Car(50000, "Tesla", "Model 3"));
        carList.add(new Car(100000, "Lamborghini", "Aventador"));
        carList.add(new Car(5000, "Honda", "Civic"));

        System.out.println(carList);
    }
}
