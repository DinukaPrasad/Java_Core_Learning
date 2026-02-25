package com.dino.javacore.lesson01;

// ============================================================
// Lesson 01 — Classes & Objects
// ============================================================
// Demonstrates:
//   - Defining a class with fields and methods
//   - Creating objects using the 'new' keyword
//   - Constructors (default and parameterized)
//   - Calling methods on objects
//   - The 'this' keyword
// ============================================================

public class Main {
    public static void main(String[] args) {

        // --- Creating objects using the default constructor ---
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2020);
        car1.printDetails();

        System.out.println("---");

        // --- Creating objects using the parameterized constructor ---
        Car car2 = new Car("Honda", "Civic", 2022);
        car2.printDetails();

        System.out.println("---");

        // --- Demonstrating method behavior ---
        System.out.println("Is car1 vintage? " + car1.isVintage());
        System.out.println("Is a 1965 Ford Mustang vintage? "
                + new Car("Ford", "Mustang", 1965).isVintage());
    }
}
