package Lesson05_Exception_Handling;

// ============================================================
// Exception Handling Basics — try / catch / finally
// ============================================================
// Demonstrates:
//   - Catching ArithmeticException (division by zero)
//   - Catching NumberFormatException (invalid number parsing)
//   - The finally block — always executes regardless of exception
//   - Multiple catch blocks for different exception types
// ============================================================

public class ex1 {
    public static void main(String[] args) {
        division(10, 2); // Normal division
        division(10, 0); // Division by zero → ArithmeticException
        division(10, Integer.parseInt("abc")); // Invalid parse → NumberFormatException

    }

    // Safe division method with multiple exception handlers
    static int division(int a, int b) {
        try {
            System.out.println(a / b);
            return a / b;
        } catch (NumberFormatException e) {
            // Handles invalid number format (e.g., Integer.parseInt("abc"))
            System.out.println("Number format exception: " + e.getMessage());
            return 0;
        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Arithmetic exception: " + e.getMessage());
            return 0;
        } finally {
            // This block runs no matter what — success or exception
            System.out.println("This block will always execute");
        }
    }
}
