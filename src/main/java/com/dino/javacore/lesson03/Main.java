package com.dino.javacore.lesson03;

// ============================================================
// Lesson 03 — Inheritance
// ============================================================
// Demonstrates:
//   - Base/parent class with shared properties
//   - Child class extending the parent (extends keyword)
//   - Inheriting fields and methods
//   - Overriding methods with @Override
//   - Using super() to call the parent constructor
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Person (base class)
        Person person = new Person("Alice", "alice@example.com");
        person.printProfile();

        System.out.println("---");

        // Create a Student (child class) — inherits name/email, adds studentId/major
        Student student = new Student("Bob", "bob@university.edu", "S-1001", "Computer Science");
        student.printProfile(); // overridden version with extra fields

        System.out.println("---");

        // Demonstrate polymorphism preview: a Student IS-A Person
        Person personRef = student;
        personRef.printProfile(); // calls Student's overridden version
    }
}
