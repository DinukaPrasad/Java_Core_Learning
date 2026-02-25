package Lesson01_OOP_Fundamentals;

// ============================================================
// Inheritance Example — Person Base Class
// ============================================================
// Demonstrates:
//   - Creating a base/parent class with shared properties
//   - Fields and methods that can be inherited by subclasses
// ============================================================

public class inherits {

}

// Base class representing a generic person
class person {
    String name;
    String email;

    // Prints the person's profile — can be inherited or overridden by subclasses
    public void printProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
