package com.dino.javacore.lesson02;

// ============================================================
// Student — Encapsulation Example with Getters & Setters
// ============================================================
// Private fields cannot be accessed directly from outside.
// Setters include validation logic to protect data integrity.
// ============================================================

public class Student {

    private int id;
    private String name;
    private String email;

    // Display the student's profile information
    public void printProfile() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    // Setter with validation — ensures email is not empty and contains '@'
    public void setEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("Email cannot be empty");
            return;
        }
        if (!email.contains("@")) {
            System.out.println("Email is invalid");
            return;
        }
        this.email = email;
    }

    // --- Standard Getters & Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
}
