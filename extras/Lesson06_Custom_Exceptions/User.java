package Lesson06_Custom_Exceptions;

// ============================================================
// User Class — Email Validation with Custom Exception
// ============================================================
// Validates the email in the setter method and throws
// InvalidEmailException if the email is empty or missing '@'.
// ============================================================

public class User {
    private String email;

    // Constructor immediately validates email via setter
    User(String email) {
        setEmail(email);
    }

    // Setter with validation — throws custom exception on invalid input
    public void setEmail(String email) {
        if (email.isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email is invalid");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
