package com.dino.javacore.lesson02;

// ============================================================
// Lesson 02 — Encapsulation
// ============================================================
// Demonstrates:
//   - Private fields (data hiding)
//   - Public getter and setter methods (controlled access)
//   - Input validation inside setters
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a new student and set fields through setters
        Student s1 = new Student();

        s1.setId(1);
        s1.setName("John");
        s1.setEmail("john@gmail.com");

        s1.printProfile();

        System.out.println("---");

        // Attempting to set an invalid (empty) email — validation will reject it
        s1.setEmail("");
        s1.printProfile();
    }
}
