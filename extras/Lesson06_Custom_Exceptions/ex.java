package Lesson06_Custom_Exceptions;

// ============================================================
// Custom Exception Demo — Using InvalidEmailException
// ============================================================
// Demonstrates:
//   - Throwing a custom RuntimeException during object creation
//   - Validation logic inside the User class constructor
// ============================================================

public class ex {
    public static void main(String[] args) {
        // This will throw InvalidEmailException because '@' is missing
        User user1 = new User("dinukagmail.com");
        System.out.println(user1.getEmail());

    }
}
