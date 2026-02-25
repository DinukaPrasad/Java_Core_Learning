package com.dino.javacore.lesson10;

// ============================================================
// User — Email Validation with Custom Exception
// ============================================================
// Validates the email in the setter method and throws
// InvalidEmailException if the email is empty or missing '@'.
// ============================================================

public class User {

    private String email;

    public User(String email) {
        setEmail(email);
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email is invalid — missing '@'");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
