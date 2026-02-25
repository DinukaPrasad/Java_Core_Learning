package com.dino.javacore.lesson10;

// ============================================================
// Lesson 10 — throw + Custom Exceptions
// ============================================================
// Demonstrates:
//   - Throwing a custom RuntimeException during object creation
//   - Validation logic inside the User class constructor/setter
//   - Using try-catch to handle custom exceptions gracefully
// ============================================================

public class Main {

    public static void main(String[] args) {

        // Valid email — should succeed
        try {
            User user1 = new User("dino@gmail.com");
            System.out.println("Created user with email: " + user1.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("---");

        // Invalid email (missing '@') — should throw InvalidEmailException
        try {
            User user2 = new User("dinukagmail.com");
            System.out.println("Created user with email: " + user2.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("---");

        // Empty email — should throw InvalidEmailException
        try {
            User user3 = new User("");
            System.out.println("Created user with email: " + user3.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
