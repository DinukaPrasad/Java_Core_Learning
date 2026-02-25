package Lesson01_OOP_Fundamentals;

// ============================================================
// Encapsulation Example — Student Class with Getters & Setters
// ============================================================
// Demonstrates:
//   - Private fields (data hiding)
//   - Public getter and setter methods (controlled access)
//   - Input validation inside setters
// ============================================================

class student {
    // Private fields — cannot be accessed directly from outside this class
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
        } else {
            this.email = email;
        }
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

// Test class to demonstrate encapsulation in action
class test {
    public static void main(String[] args) {

        // Create a new student object and set fields through setters
        student s1 = new student();

        s1.setId(1);
        s1.setName("John");
        s1.setEmail("jone@gmail.com");

        s1.printProfile();

        // Attempting to set an invalid (empty) email — validation will reject it
        s1.setEmail("");

        s1.printProfile();

    }
}