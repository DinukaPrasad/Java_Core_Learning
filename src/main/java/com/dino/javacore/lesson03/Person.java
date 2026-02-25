package com.dino.javacore.lesson03;

// ============================================================
// Person — Base class representing a generic person
// ============================================================
// Fields and methods here can be inherited by subclasses.
// ============================================================

public class Person {

    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Prints the person's profile — can be overridden by subclasses
    public void printProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
