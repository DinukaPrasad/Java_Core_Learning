package com.dino.javacore.lesson01;

// ============================================================
// Car — A simple class demonstrating fields, constructors, methods
// ============================================================

public class Car {

    // Fields (instance variables)
    private String brand;
    private String model;
    private int year;

    // Default (no-arg) constructor
    public Car() {
    }

    // Parameterized constructor — uses 'this' to distinguish fields from params
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Instance method — prints the car details
    public void printDetails() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }

    // Instance method — business logic using field data
    public boolean isVintage() {
        return year < 1980;
    }

    // --- Getters & Setters ---

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
