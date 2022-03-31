package com.revature.demo.comparable;

public class Car implements Comparable<Car> {
    private int price;
    private String brand;
    private String model;

    public Car() {
    }

    public Car(int price, String brand, String model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if (getPrice() == car.price) {
            return 0;
        } else if (getPrice() > car.price) {
            return 1;
        }

        return -1;
    }
}
